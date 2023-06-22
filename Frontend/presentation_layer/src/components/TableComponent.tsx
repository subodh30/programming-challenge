import { useEffect, useState } from "react";
import HttpService, { Movement, Population } from "../services/HttpService";
import "./TableComponent.css";

export default function Table({ page }: { page: string }) {
  const [data, setData] = useState<Population[]>([]);
  const [mvmData, setMvmData] = useState<Movement[]>([]);

  useEffect(() => {
    if (page === "population")
      HttpService.fetchPupulationData().then((response) => {
        setData(response.data);
      });
    else {
      HttpService.fetchMovementData().then((response) => {
        setMvmData(response.data);
      });
    }
  }, []);
  return (
    <>
      <div className="container-fluid">
        <div className="row" style={{ margin: "1%" }}>
          <div className="col text-center">
            <h3> {page.toUpperCase() + "  DATA"}</h3>
          </div>
        </div>
        {page === "population" && (
          <table className="table table-fixed text-center table-striped table-hover table-active">
            <thead className="table-dark">
              <tr>
                <th> Premise ID </th>
                <th> Total Animal </th>
              </tr>
            </thead>
            <tbody>
              {data.map((row) => (
                <tr key={row.premiseId}>
                  <td>{row.premiseId}</td>
                  <td>{row.totalAnimal}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}

        {page === "movement" && (
          <table className="table table-fixed text-center table-striped table-hover table-active">
            <thead className="table-dark">
              <tr>
                <th> Account Or Company </th>
                <th> New Movement Reason </th>
                <th> New Species </th>
                <th> New Origin City </th>
                <th> New Origin Name </th>
                <th> New Origin Prem ID </th>
                <th> New Origin State </th>
                <th> New Destination City </th>
                <th> New Destination Name </th>
                <th> New Destination Prem ID </th>
                <th> New Destination State </th>
                <th> New Num Items Moved </th>
                <th> New Shipments Start Date </th>
              </tr>
            </thead>
            <tbody>
              {mvmData.map((row) => (
                <tr>
                  <td>{row.accountOrCompany}</td>
                  <td>{row.newMovementreason}</td>
                  <td>{row.newSpecies}</td>
                  <td>{row.newOrigincity}</td>
                  <td>{row.newOriginname}</td>
                  <td>{row.newOriginpremid}</td>
                  <td>{row.newOriginstate}</td>
                  <td>{row.newDestinationcity}</td>
                  <td>{row.newDestinationname}</td>
                  <td>{row.newDestinationpremid}</td>
                  <td>{row.newDestinationstate}</td>
                  <td>{row.newNumitemsmoved}</td>
                  <td>{row.newShipmentsstartdate}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    </>
  );
}
