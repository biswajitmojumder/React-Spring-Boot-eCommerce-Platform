package com.github.knastasov.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.knastasov.model.Products;

public interface ProductsRepository extends MongoRepository<Products, String> {
	List<Products> findByNameContaining(String name);
	
	List<Products> findByBrand(String brand);
		
}
