import React from "react";
import './side.css'
function Sidebar  (props)  {
  console.log(props)
  return <div className="side">Sidebar Component {props.greet}</div>;
};

export default Sidebar;
