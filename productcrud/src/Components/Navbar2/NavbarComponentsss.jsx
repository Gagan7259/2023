import React from "react";

function NavbarComponentsss() {
  return (
    <nav className="navbar bg-primary navbar-primary expand-lg ">
      <a className="navbar-brand" href="/">
        Cart
      </a>
      <div className="collapse navbar-collapse ">
        <ul className="navbar-nav mr-auto">
          <li className="nav-list active">
            {" "}
            <a className="nav-link" href="home">
              Product
            </a>{" "}
          </li>
          <li className="nav-list">
            {" "}
            <a className="nav-link" href="home">
              Product-List
            </a>{" "}
          </li>
          <li className="nav-list">
            {" "}
            <a className="nav-link" href="home">
              Update
            </a>{" "}
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default NavbarComponentsss;
