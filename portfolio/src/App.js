import { BrowserRouter, Route, Routes } from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.min.css';
import NavbarComponent from './Components/Navbar/NavbarComponent';

function App() {
  return (
    <BrowserRouter>
      <NavbarComponent />
      <Routes>
        <Route path='' />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
