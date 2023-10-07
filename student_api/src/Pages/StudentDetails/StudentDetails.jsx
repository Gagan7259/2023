import axios from "axios";
import React, { useEffect } from "react";
import {Link} from 'react-router-dom'
import "./lis.css";
const StudentDetails = () => {
  /*  let [Students, SetStudents] = React.useEffect([]);
  React.useEffect(() => {
    axios
      .get(`http://localhost:8082/students`)
      .then((response) => {
        SetStudents(response.data);
      })
      .catch((error) => {});
  }, []); */
  let [students, setstudents] = React.useState([]);
  useEffect(() => {
    axios
      .get("http://localhost:8082/students")
      .then((response) => {
        setstudents(response.data);
        console.log(students);
      })
      .catch(() => {});
  }, [students]);
  return (
    <section>
      <div className="container">
        <div className="row">
          <h2 className="stext">Student Deatails</h2>
          <div className="col">
            <table className="table">
              <thead className="theadd">
                <tr>
                  <th>Id</th>
                  <th>Name</th>
                  <th>Email</th>
                  <th>Age</th>
                  <th>School</th>
                  <th>About</th>
                  <th>Actions</th>
                </tr>
              </thead>
              <tbody className="tbodyy">
                {students.length > 0 ? (
                  <>
                    {students.map((student, index) => {
                      return (
                        <tr key={index}>
                          <td>{student.id}</td>
                          <td>{student.name}</td>
                          <td>{student.age}</td>
                          <td>{student.email}</td>
                          <td>{student.school}</td>
                          <td>{student.about}</td>
                          <td className="btnf">
                            <Link to={`/update/${student.id}`} className="ubtnn">
                              <span className="up">Update</span>
                            </Link>
                            <button className="dbtn"><span className="de">Delete</span></button>
                          </td>
                        </tr>
                      );
                    })}
                  </>
                ) : null}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </section>
  );
};

export default StudentDetails;
