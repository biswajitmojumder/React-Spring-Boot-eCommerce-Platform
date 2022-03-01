import React, {useEffect,useState} from 'react'
import {Link,useParams} from 'react-router-dom'
import {Row, Col, Image, ListGroup, Card, Button} from 'react-bootstrap'
import Rating from '../components/Rating'
import axios from 'axios'
// import products from '../products'
import ProductService from '../services/ProductService'

const ProductScreen = () => {


    const [product, setProduct] = useState([])

    const PRODUCTS_API_BASE_URL = `http://localhost:8080/api/products/621dcfa277fa1c4ffecd30c5`


     useEffect(() => {
      const axiosProducts = async () => {
        const response =  await axios.get(PRODUCTS_API_BASE_URL);
   
        setProduct(response.data)

      }       
    axiosProducts();
    }, [])
  return (
    <div>
        <Link className='btn btn-dark my-3' to='/'> Go back
        </Link>

        <Row>
            <Col md={6}>
                <Image src={product.image} alt={product.name} fluid />
            </Col>

            <Col md={3}>
                <ListGroup>
                       <ListGroup.Item>
                       <h3>{product.name}</h3>
                       </ListGroup.Item>

                        <ListGroup.Item>
                            <Rating value={product.rating} text={`${product.numReviews} reviews`} />
                       </ListGroup.Item>

                       <ListGroup.Item>
                           Price: ${product.price}
                       </ListGroup.Item>

                       <ListGroup.Item>
                           Description: {product.description}
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
                                    <strong>${product.price} </strong>
                                </Col>
                            </Row>
                        </ListGroup.Item>


                        <ListGroup.Item>
                            <Row>
                                <Col>
                                    Status:
                                </Col>
                                  <Col>
                                    {product.countInStock > 0 ? 'In Stock' : 'Out of Stock'}
                                </Col>
                            </Row>
                        </ListGroup.Item>

                        <ListGroup.Item>
                            <Button 
                            className='btn-block' type='button'
                            disabled={product.countInStock ===0}>
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