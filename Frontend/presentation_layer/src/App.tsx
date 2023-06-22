import { useState } from "react";
import "./App.css";
import Table from "./components/TableComponent";
import NavBar from "./components/NavComponent";
import ChartComponent from "./components/ChartComponent";

function App() {
  const [page, setPage] = useState<string>("dashboard");
  return (
    <>
      <div className="container-fluid" style={{ padding: "0" }}>
        <div className="row">
          <div className="col">
            <NavBar onClick={(page: string) => setPage(page)} />
          </div>
        </div>
        <div className="row">
          <div className="col" style={{ marginTop: "60px" }}>
            {page === "dashboard" && <ChartComponent />}
            {page === "population" && <Table page={page} />}
            {page === "movement" && <Table page={page} />}
          </div>
        </div>
      </div>
    </>
  );
}

export default App;
