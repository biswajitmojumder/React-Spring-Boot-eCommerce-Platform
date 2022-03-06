import axios from 'axios'

import {USER_REQUEST,
    USER_SUCCESS,
    USER_FAIL,} from '../constants/userConstants'

export const listUsers = () => async(dispatch) => {
        const USERS_API_BASE_URL = "http://localhost:8080/api/login"
        try {
            dispatch({type: USER_REQUEST})
    
            const {data} = await axios.get(USERS_API_BASE_URL)
    
            dispatch({
                type: USER_SUCCESS,
                payload: data
            })
        } catch (error) {
            dispatch({
                type: USER_FAIL,
                payload: error.response && error.response.data.message ? error.response.data.message :
                error.message
            })
        }
    } 
    
export const listUserDetails = (id) => async(dispatch) => {
        try {
            dispatch({type: USER_REQUEST})
    
            const {data} = await axios.get(`http://localhost:8080/api/login/${id}`)
            console.log('data', data)
            dispatch({
                type: USER_SUCCESS,
                payload: data
            })
        } catch (error) {
            dispatch({
                type: USER_FAIL,
                payload: error.response && error.response.data.message ? error.response.data.message :
                error.message
            })
        }
}