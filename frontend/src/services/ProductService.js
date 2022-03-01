import axios from 'axios'
import React from 'react'

const PRODUCTS_API_BASE_URL = "http://localhost:8080/api/products"

const ProductService = () => {


     const getProducts = () => {
        return axios.get(PRODUCTS_API_BASE_URL);
    }

 
}

export default ProductService