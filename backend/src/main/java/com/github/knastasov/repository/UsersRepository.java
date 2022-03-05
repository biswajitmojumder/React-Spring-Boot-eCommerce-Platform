package com.github.knastasov.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.knastasov.model.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

	List<Users> findByName(String name);

	List<Users> findByEmail(String email);

}
