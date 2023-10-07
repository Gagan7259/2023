import './App.css';
import Header from './Day-1/Header/Header';
import Main from './Day-1/Main/Main';
import Sidebar from './Day-1/Sidebar/Sidebar';




function App() {
  return (
    <>
      <Header  name="Gagan" color="purple"/>
      <Sidebar  greet="Hey Good Morning"/>
      <Main content="Hey Its Main Guy In react Page" />

    </>)

}

export default App;
