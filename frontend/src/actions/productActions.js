import axios from 'axios'
import {
    PRODUCT_LIST_FAIL,
    PRODUCT_LIST_REQUEST,
    PRODUCT_LIST_SUCCESS,
} from '../constants/productConstants'


    const PRODUCTS_API_BASE_URL = "http://localhost:8080/api/products"


export const listProducts = () => async(dispatch) => {
    try {
        dispatch({type: PRODUCT_LIST_REQUEST})

        const {data} = await axios.get(PRODUCTS_API_BASE_URL)

        dispatch({
            type: PRODUCT_LIST_SUCCESS,
            payload: data
        })
    } catch (error) {
        dispatch({
            type: PRODUCT_LIST_FAIL,
            payload: error.response && error.response.data.message ? error.response.data.message :
            error.message
        })
    }
}