import React from 'react'
import {Form,Button} from 'react-bootstrap'
import {Link} from 'react-router-dom'
const RegisterScreen = () => {
  return (
    <div>
       
        <Form>
                <h3>Sign Up</h3>

                <Form.Group className="mb-3" controlId="formFirstName">
                    <Form.Label>First name</Form.Label>
                    <Form.Control type="text" placeholder="First name" />
                </Form.Group>

         

         
                <Form.Group className="mb-3" controlId="formLastName">
                    <Form.Label>Last name</Form.Label>
                    <Form.Control type="text" placeholder="Last name" />
                </Form.Group>


                <Form.Group className="mb-3" controlId="formEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" />
                    <Form.Text className="text-muted">
                    We'll never share your email with anyone else.
                    </Form.Text>
               </Form.Group>

                <Form.Group className="mb-3" controlId="formPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" />
                </Form.Group>
            
                <Button variant="primary" type="submit">
                Sign Up
                </Button>
              
                <p className="forgot-password text-right">
                    Already registered? <Link to={`/login`}>Login
                             </Link>
                </p>
            </Form>
    </div>
  )
}

export default RegisterScreen