import React from "react";
import { Link } from "react-router-dom";
const Navbar = () => {
  return (
    <nav
      className=" navbar  navbar-expand-lg "
      style={{
      
        backgroundColor: "rgba(0, 90, 100, .3)",
        fontWeight: 500,
        colorScheme: "#6b5b95",
      }}
    >
      <Link to="#" aria-disabled className="navbar-brand">
        Student Details
      </Link>
      <div className="ml-auto">
        <ul className="navbar-nav">
          <li className="nav-list">
            <Link className="nav-link" to="/admin">
              ADMIN
            </Link>
          </li>
          <li className="nav-list">
            <Link className="nav-link" to="/update">
              UPDATE
            </Link>
          </li>
          <li className="nav-list">
            <Link className="nav-link" to="/studentdetails">
              STUDENT-LIST
            </Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navbar;
