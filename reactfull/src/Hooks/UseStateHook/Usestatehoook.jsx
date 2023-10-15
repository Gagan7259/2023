import React from "react";
import { useState } from "react";
function Usestatehoook() {
  const [Count, SetCount] = useState(0);

  const IncrementHandler = () => {
    SetCount(Count + 1);
    console.log(SetCount);
  };

  return <button onClick={IncrementHandler}>click it</button>;
}

export default Usestatehoook;
