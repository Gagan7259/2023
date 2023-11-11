import './app.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import NavbarComponent from './Components/Navbar/Navbarcomponent';
function App() {
  return (
    <BrowserRouter >
      <NavbarComponent />
      <Routes>
        <Route />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
