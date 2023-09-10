import React from "react";
import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";

function HeaderComponent() {
  return;
  <Navbar collapseOnSelect expand="lg" className="bgcolor">
    <Container>
      <Navbar.Brand href="#home">PortFolio</Navbar.Brand>
      <Navbar.Toggle aria-controls="responsive-navbar-nav" />
      <Navbar.Collapse id="responsive-navbar-nav" />
      <Nav className="me-auto">
<Nav.Link href="#About"></Nav.Link>
      </Nav>
    </Container>
  </Navbar>;
}

export default HeaderComponent;
