import {USER_REQUEST,USER_SUCCESS,USER_FAIL} from '../constants/userConstants'

export const userReducer = (state ={users:[]}, action) => {
    switch(action.type) {
        case USER_REQUEST:
             return {loading: true, users: []}
        case USER_SUCCESS:
            return {loading: false, users: action.payload}
        case USER_FAIL:
            return {
                loading: false, error: action.payload
            }
            default:
            return state
    }
}