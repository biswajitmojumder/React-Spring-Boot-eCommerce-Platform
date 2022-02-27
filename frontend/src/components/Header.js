import React from 'react'
import {Container, Navbar, Nav, NavDropdown} from 'react-bootstrap'
const Header = () => {
  return (
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
       
            <Container>
            <Navbar.Brand href="/">EShop</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="me-auto">
                <Nav.Link href="/features">Features</Nav.Link>
                <Nav.Link href="/pricing">Pricing</Nav.Link>
                </Nav>
                <Nav>
                <Nav.Link href="/cart"><i className='fas fa-shopping-cart'> </i>Cart</Nav.Link>
                <Nav.Link href="/signin" eventKey={2}>
                <i className='fas fa-user'> </i>
                            Sign in
                </Nav.Link>
                </Nav>
            </Navbar.Collapse>
            </Container>
        </Navbar>
  )
}

export default Header