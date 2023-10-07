import React from "react";
import "./admin.css";
const AdminComponent = () => {
  return (
    <section className="head_admin">
    
      <div className="container">
        <div className="row">
          <h2 className="head"> Enter Student details</h2>
          <div className="col">
            <form className="menu"  autoComplete="on">
              <div className="form-group">
                <input
                  className="form-control"
                  type="text"
                  placeholder="Enter Your Name"
                />
              </div>
              <div className="form-group">
                <input
                  className="form-control"
                  type="text"
                 
                  placeholder="Enter Your Email"
                />
              </div>
              <div className="form-group">
                <input
                  className="form-control"
                  type="text"
                  placeholder="Enter Your Age"
                />
              </div>
              <div className="form-group">
                <input
                  className="form-control"
                  type="text"
                  placeholder="Enter Your School"
                />
              </div>
              <div className="form-group">
                <input
                  className="form-control"
                  type="text"
                  placeholder="Tell Me Your About"
                />
              </div>
              <div>
                <button className="btnt" type="button">Add Student</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
  );
};

export default AdminComponent;
