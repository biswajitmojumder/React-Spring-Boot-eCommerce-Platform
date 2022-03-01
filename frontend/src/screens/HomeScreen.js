import React,{useState, useEffect} from 'react'
import Product from '../components/Product'
import {Row, Col} from 'react-bootstrap'
//import products from '../products'
import axios from 'axios'
const HomeScreen = () => {

     const [products, setProducts] = useState([])
    const PRODUCTS_API_BASE_URL = "http://localhost:8080/api/products"


     useEffect(() => {
      const axiosProducts = async () => {
        const response =   await axios.get(PRODUCTS_API_BASE_URL);
   
        setProducts(response.data)

      }       
    axiosProducts();
    }, [])



  return (
    <>
        <h1>Latest Products </h1>
        <Row>

        {/* {products.name} */}
            {products.map(product =>
           
                <Col key={product._id} sm={12} md={6} lg={4} xl={3}>
                <Product product={product}/>      
          </Col>
            )}
        </Row>
    </>
  )
}

export default HomeScreen