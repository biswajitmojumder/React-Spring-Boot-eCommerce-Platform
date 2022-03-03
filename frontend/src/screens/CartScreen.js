import React, {useEffect} from 'react'
import {Link,useParams,useSearchParams } from 'react-router-dom'
import {useDispatch, useSelector} from 'react-redux'
import {Row, Col, ListGroup, Image, Form, Button, Card} from 'react-bootstrap'
import Message from '../components/Message'
import { addToCart,removeFromCart } from './../actions/cartActions';


const CartScreen = () => {
      const productId = useParams();
    const [searchParams] = useSearchParams();

    console.log('searchParams ',searchParams)
    
    console.log('productId ',productId)

    

    const qty = 3

    // const qty = useParams();
    // const qty = searchParams.get('qty') ? Number(searchParams.get('qty').split('=')[1]) : 1
    // const qty = 1
    console.log('qty ' ,qty)

    const dispatch = useDispatch()

    const cart = useSelector(state => state.cart)
    console.log('cart ' ,cart)

    const {cartItems} = cart
    //add to cart button not adding items in carItems Reducer
        console.log('cartItems ' ,cartItems)


    useEffect(() => {
      if(productId) {
        dispatch(addToCart(productId.id, qty))
      }
    },[dispatch, productId, qty])
    // console.log(qty)

  return (
    <div>CartScreen</div>
  )
}

export default CartScreen