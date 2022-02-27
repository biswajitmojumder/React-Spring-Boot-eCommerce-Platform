import React from 'react'
import {LinkContainer} from 'react-router-bootstrap'
import {Container, Navbar, Nav} from 'react-bootstrap'
const Header = () => {
  return (
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
       
            <Container>
            <LinkContainer to='/'>
               <Navbar.Brand href="/">EShop</Navbar.Brand>
            </LinkContainer>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="me-auto">
                    <LinkContainer to='/features'>
                     <Nav.Link >Features</Nav.Link>
                   </LinkContainer>

                     <LinkContainer to='/pricing'>
                    <Nav.Link>Pricing</Nav.Link>
                   </LinkContainer>
               
                </Nav>
                <Nav>
                  <LinkContainer to='/cart'>
                  <Nav.Link><i className='fas fa-shopping-cart'> </i>Cart</Nav.Link>                   
                  </LinkContainer>

                <LinkContainer to='/signin'>
                <Nav.Link eventKey={2}>
                <i className='fas fa-user'> </i>
                            Sign in
                </Nav.Link>
                  </LinkContainer>

                </Nav>
            </Navbar.Collapse>
            </Container>
        </Navbar>
  )
}

export default Header