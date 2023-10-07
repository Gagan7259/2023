import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Navbar from "../Componets/Navbar/Navbar";
import AdminComponent from "./Admin/AdminComponent";
import StudentDetails from "./StudentDetails/StudentDetails";
import UpdateComponent from "./Update/UpdateComponent";
function RouterConfig() {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/admin" element={<AdminComponent />} />
        <Route path="/update" element={<UpdateComponent/>}/>
        <Route path="/update/:id" element={<UpdateComponent />} />
        <Route path="/studentdetails" element={<StudentDetails />} />
      </Routes>
    </Router>
  );
}

export default RouterConfig;
