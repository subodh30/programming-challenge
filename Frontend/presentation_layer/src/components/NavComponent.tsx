import { useState } from "react";

export default function NavBar({
  onClick,
}: {
  onClick: (page: string) => void;
}) {
  const [page, setPage] = useState<string>("dashboard");
  const dashboardClick = () => {
    setPage("dashboard");
    onClick("dashboard");
  };
  const populationClick = () => {
    setPage("population");
    onClick("population");
  };
  const movementClick = () => {
    setPage("movement");
    onClick("movement");
  };
  return (
    <>
      <nav className="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
        <div className="container-fluid">
          <span className="navbar-brand">Machado Lab</span>
          <div>
            <div className="navbar-nav">
              <a
                className={
                  page === "dashboard" ? "nav-link active" : "nav-link"
                }
                onClick={dashboardClick}
              >
                Dashboard
              </a>
              <a
                className={page === "movement" ? "nav-link active" : "nav-link"}
                href="#"
                onClick={movementClick}
              >
                Movements{" "}
              </a>
              <a
                className={
                  page === "population" ? "nav-link active" : "nav-link"
                }
                href="#"
                onClick={populationClick}
              >
                Population{" "}
              </a>
            </div>
          </div>
        </div>
      </nav>
    </>
  );
}
