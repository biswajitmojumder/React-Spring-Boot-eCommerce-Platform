import React from 'react'
import {Form,Button} from 'react-bootstrap'
import {Link} from 'react-router-dom'

const LoginScreen = () => {
  return (
    <div>
        <Form>
        <h1>Login </h1>
        <Form.Group className="mb-3" controlId="formBasicEmail">
            <Form.Label>Email address</Form.Label>
            <Form.Control type="email" placeholder="Enter email" />
            <Form.Text className="text-muted">
            We'll never share your email with anyone else.
            </Form.Text>
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPassword">
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" placeholder="Password" />
        </Form.Group>
        <Form.Group className="mb-3" controlId="formBasicCheckbox">
            <Form.Check type="checkbox" label="Remember me" />
        </Form.Group>
        <Button variant="primary" type="submit">
            Login
        </Button>
        <hr/>

        <Form.Group className="mb-3" controlId="formBasicRegister">
            <Form.Label>Not a member? <Link to={`/register`}>Sign up
                             </Link></Form.Label>
                   
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicRegister">
            <Form.Label>Forgot password? <Link to={`/passwordReset`}>Reset password
                             </Link></Form.Label>
                   
        </Form.Group>

        </Form>
    
    
    </div>
  )
}

export default LoginScreen