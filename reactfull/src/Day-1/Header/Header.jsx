import React from "react";
import "./header.css";
function Header(props) {
  console.log(props);
  return <div>Header Component ,{props.name}{props.color}</div>;
}

export default Header;
