import React, {useEffect,useState} from 'react'
import {Link,useParams} from 'react-router-dom'
import {Row, Col, Image, ListGroup, Card, Button} from 'react-bootstrap'
import Rating from '../components/Rating'
import axios from 'axios'
// import products from '../products'
import ProductService from '../services/ProductService'

const ProductScreen = ({name,brand,category,countInStock,id,image,numReviews,price,rating,description}) => {

    //   const {id} = useParams();



    // const product = products.find(p => p._id ===id)
  return (
    <div>
        <Link className='btn btn-dark my-3' to='/'> Go back
        </Link>

        <Row>
            <Col md={6}>
                <Image src={image} alt={name} fluid />
            </Col>

            <Col md={3}>
                <ListGroup>
                       <ListGroup.Item>
                       <h3>{name}</h3>
                       </ListGroup.Item>

                        <ListGroup.Item>
                            <Rating value={rating} text={`${numReviews} reviews`} />
                       </ListGroup.Item>

                       <ListGroup.Item>
                           Price: ${price}
                       </ListGroup.Item>

                       <ListGroup.Item>
                           Description: {description}
                       </ListGroup.Item>
                </ListGroup>
            </Col>

            <Col md={3}>
                <Card>
                    <ListGroup variant='flush'>
                        <ListGroup.Item>
                            <Row>
                                <Col>
                                    Price:
                                </Col>

                                  <Col>
                                    <strong>${price} </strong>
                                </Col>
                            </Row>
                        </ListGroup.Item>


                        <ListGroup.Item>
                            <Row>
                                <Col>
                                    Status:
                                </Col>
                                  <Col>
                                    {countInStock > 0 ? 'In Stock' : 'Out of Stock'}
                                </Col>
                            </Row>
                        </ListGroup.Item>

                        <ListGroup.Item>
                            <Button 
                            className='btn-block' type='button'
                            disabled={countInStock ===0}>
                                Add to cart
                            </Button>
                        </ListGroup.Item>


                     </ListGroup>
                </Card>
            </Col>
        </Row>
    </div>
  )
}

export default ProductScreen