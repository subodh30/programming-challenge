import { Bar } from "react-chartjs-2";
import Chart from "chart.js/auto";
import { useEffect, useState } from "react";
import HttpService, { Movement } from "../services/HttpService";

export default function ChartComponent() {
  const [pData, setPData] = useState<number[]>([]);
  const [pLabels, setPLabels] = useState<string[]>([]);
  const [data, setData] = useState<number[]>([]);
  const [originFarms, setOriginFarms] = useState<string[]>([]);
  const [destinationFarms, setDestinationFarms] = useState<string[]>([]);

  const chartData = {
    labels: pLabels,
    datasets: [
      {
        label: "Population Count per farm",
        backgroundColor: "rgb(0, 255, 0)",
        borderColor: "rgb(0, 255, 0)",
        data: pData,
      },
    ],
  };

  const options = {
    animation: {
      duration: 500,
    },
  };

  useEffect(() => {
    HttpService.fetchPupulationData().then((response) => {
      setPLabels(response.data.map((row) => row.premiseId));
      setPData(response.data.map((row) => row.totalAnimal));
    });

    HttpService.fetchMovementData().then((response) => {
      const movementData: Movement[] = response.data;
      setOriginFarms(movementData.map((row) => row.newOriginpremid));
      setDestinationFarms(movementData.map((row) => row.newDestinationpremid));
      setData(movementData.map((row) => row.newNumitemsmoved));
    });
  }, []);

  const colorScheme = [
    "rgba(255, 99, 132, 0.8)", // Red
    "rgba(54, 162, 235, 0.8)", // Blue
    "rgba(255, 206, 86, 0.8)", // Yellow
    "rgba(75, 192, 192, 0.8)", // Green
  ];

  const movData = {
    labels: pLabels,
    datasets: destinationFarms.map((farm, index) => ({
      label: `Moved from ${originFarms[index]} to ${farm}`,
      backgroundColor: colorScheme[index % colorScheme.length],
      data: data.map((item, i) =>
        originFarms[i] === originFarms[index] && destinationFarms[i] === farm
          ? item
          : 0
      ),
    })),
  };

  const movOptions = {
    scales: {
      x: {
        stacked: true,
      },
      y: {
        stacked: true,
        beginAtZero: true,
      },
    },
  };

  return (
    <>
      <div className="container" style={{ marginTop: "5%" }}>
        <div className="row">
          <div className="col">
            <div style={{ height: "400px", width: "600px" }}>
              <Bar data={chartData} typeof={Chart} options={options} />
            </div>
          </div>
          <div className="col">
            <div style={{ height: "400px", width: "600px" }}>
              <Bar data={movData} typeof={Chart} options={movOptions} />
            </div>
          </div>
        </div>
      </div>
    </>
  );
}
