import React,{ useEffect} from 'react'
import {useDispatch, useSelector} from 'react-redux'
import Product from '../components/Product'
import {Row, Col} from 'react-bootstrap'
import { listProducts } from './../actions/productActions';

//import products from '../products'
// import axios from 'axios'
const HomeScreen = () => {

  const dispatch = useDispatch()
  const productList = useSelector(state => state.productList)
  const {loading, error, products} = productList


     useEffect(() => {
       dispatch(listProducts())
      // const axiosProducts = async () => {
      //   const response = await axios.get(PRODUCTS_API_BASE_URL);
   
      //   setProducts(response.data)

      // }       
      //   axiosProducts();
    }, [dispatch])

  

  return (
    <>
        <h1>Latest Products </h1>
        {loading ? <h2>Loading...</h2> : <h3>{error} </h3>}
        <Row>
            {products.map(product =>  
                <Col key={product.id} sm={12} md={6} lg={4} xl={3}>
                <Product product={product}/>   
                     {/* <h6>{product.id}</h6>    */}
          </Col>
            )}
        </Row>
    </>
  )
}

export default HomeScreen