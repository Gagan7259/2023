import Axios from "axios";
import React, { useEffect } from "react";
import { useParams } from "react-router-dom";
function UpdateComponent() {
  const { id } = useParams();
  /* const {values,SetValues}=useState();
   */ useEffect(() => {
    Axios.get('http://localhost:8082/students/'+id)
      .then((response) => {
        console.log(response.data);
      })
      .catch((error)=>{
      });
  }, [id]);
  return (
    <div className=" d-flex w-100vh justify-content-center align-items-center mt-10">
      <div className="w-50 border bg-secondary text-white p-5">
        <form>
          <div>
            <label>Name:</label>
            <input type="text" name="name" className="form-control" />
          </div>
          <div>
            <label>Age:</label>
            <input type="number" name="age" className="form-control" />
          </div>
          <div>
            <label>Email:</label>
            <input type="text" name="email" className="form-control" />
          </div>
          <div>
            <label>School:</label>
            <input type="text" name="school" className="form-control" />
          </div>
          <div>
            <label>About:</label>
            <input type="text" name="about" className="form-control" />
          </div>
          <br />
          <button className="btn btn-info">Update</button>
        </form>{" "}
      </div>
    </div>
  );
}

export default UpdateComponent;
