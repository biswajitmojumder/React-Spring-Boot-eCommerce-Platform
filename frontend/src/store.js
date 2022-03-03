import { createStore, combineReducers, applyMiddleware } from 'redux'
import thunk from 'redux-thunk'
import { composeWithDevTools } from 'redux-devtools-extension'
import {productListReducer, productdDetailsReducer} from './reducers/productListReducers'


const reducer = combineReducers({
  productList: productListReducer,
  productDetails: productdDetailsReducer,
})

const initialState={}

const middleware = [thunk]

const store = createStore(
  reducer,
  initialState,
  composeWithDevTools(applyMiddleware(...middleware))
)

export default store