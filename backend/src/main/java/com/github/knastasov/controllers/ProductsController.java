package com.github.knastasov.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.knastasov.model.Products;
import com.github.knastasov.repository.ProductsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductsController {

	@Autowired
	ProductsRepository productsRepository;

	@GetMapping("/products")
	public ResponseEntity<List<Products>> getAllProductss(@RequestParam(required = false) String brand) {
//		http://localhost:8080/api/products
		try {
			List<Products> products = new ArrayList<Products>();
			if (brand == null)
				productsRepository.findAll().forEach(products::add);
			else
				productsRepository.findByBrand(brand).forEach(products::add);
			if (products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable("id") String id) {
		Optional<Products> productsData = productsRepository.findById(id);
		if (productsData.isPresent()) {
			return new ResponseEntity<>(productsData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/products")
	public ResponseEntity<Products> createProducts(@RequestBody Products products) {
		try {
			Products _tutorial = productsRepository.save(new Products(null,products.getName(), products.getImage(),
					products.getBrand(), products.getCategory(), products.getPrice(), products.getCountInStock(),
					products.getRating(), products.getNumReviews()));

			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
//		{
//		    "name" : "Postman",
//		    "image" :"postimg",
//		    "brand" :"brand",
//		    "category" :"category",
//		    "price" :"123",
//		    "countInStock" :"4",
//		    "rating" :"3",
//		    "numReviews" :"2"
//		}

	}

	@PutMapping("/products/{id}")
	public ResponseEntity<Products> updateProducts(@PathVariable("id") String id, @RequestBody Products products) {

		Optional<Products> productsData = productsRepository.findById(id);
		if (productsData.isPresent()) {
			Products _tutorial = productsData.get();
			_tutorial.setName(products.getName());
			_tutorial.setImage(products.getImage());
			_tutorial.setBrand(products.getBrand());
			_tutorial.setCategory(products.getCategory());
			_tutorial.setPrice(products.getPrice());
			_tutorial.setCountInStock(products.getCountInStock());
			_tutorial.setRating(products.getRating());
			_tutorial.setNumReviews(products.getNumReviews());

			return new ResponseEntity<>(productsRepository.save(_tutorial), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<HttpStatus> deleteProducts(@PathVariable("id") String id) {
		try {
			productsRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/products")
	public ResponseEntity<HttpStatus> deleteAllProductss() {
		try {
			productsRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/products/brand")
	public ResponseEntity<List<Products>> findByBrand(String brand) {
		try {
			List<Products> products = productsRepository.findByBrand(brand);
			if (products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/login")
	public ResponseEntity<List<Products>> login(String brand) {
		try {
			List<Products> products = productsRepository.findByBrand(brand);
			if (products.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
