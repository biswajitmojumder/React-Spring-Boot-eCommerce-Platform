import Header from './components/Header';
import Footer from './components/Footer';
import HomeScreen from './screens/HomeScreen';
import ProductScreen from './screens/ProductScreen';
import {Container} from 'react-bootstrap'
import CartScreen from './screens/CartScreen';

import {
  Routes,
  Route
} from "react-router-dom";


function App() {
  return (
    <div>
      <Header/>
      <main className='py-3'>
      <Container>
           <Routes>
             <Route path="/" element={<HomeScreen />} exact/>
             <Route path="/product/:id" element={<ProductScreen />} />

               <Route path="/cart" element={<CartScreen />} />

            <Route path="/cart/:id/">
            <Route path=":qty" element={<CartScreen />} />
            <Route path="" element={<CartScreen />} />
          </Route>

           </Routes>
      </Container>
      </main>
      <Footer/>  
  </div>
  );
}

export default App;
