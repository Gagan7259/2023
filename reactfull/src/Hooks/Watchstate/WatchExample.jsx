import React, { useState } from "react";

function WatchExample() {
  const [Watches, Setwatches] = useState([]);
  const [inputText, SetInpiutText] = useState("");

  function addWatch() {
    Setwatches((pretext) => {
      return [...pretext, { text: inputText, id: Math.random() }];
    });
  }

  return (
    <div>
      <h3>Watch Listr</h3>
      <div>
        <label>Add Watch</label>
        <input
          type="text"
          style={{ display: "block" }}
          name="add-watch"
          value={inputText}
          id="add-watch"
          onClick={(e) => {
            SetInpiutText(e.target.value);
          }}
        />
        <button onClick={addWatch}>Add Watch</button>
      </div>
      <ul>
        {Watches.map((watch) => (
          <li key={watch.id}>{{ watch, title }}</li>
        ))}
      </ul>
    </div>
  );
}

export default WatchExample;
