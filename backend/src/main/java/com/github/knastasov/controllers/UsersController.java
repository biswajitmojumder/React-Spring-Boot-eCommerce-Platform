package com.github.knastasov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.knastasov.model.Products;
import com.github.knastasov.model.Users;
import com.github.knastasov.repository.UsersRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	UsersRepository userRepository;
	
	@GetMapping("/login")
	public ResponseEntity<List<Users>> login(String email) {
		try {
			List<Users> users = userRepository.findByEmail(email);
			if (users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<Users> createProducts(@RequestBody Users users) {
		try {
//			this.name = name;
//			this.email = email;
//			this.password = password;
//			this.isAdmin = isAdmin;
//			this.time = time;
			Users _user = userRepository.save(new Users(users.getName(), users.getEmail(), users.getPassword(), users.getIsAdmin(), users.getTime()));

			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
   }
	
	@DeleteMapping("/login/{id}")
	public ResponseEntity<HttpStatus> deleteProducts(@PathVariable("id") String id) {
		try {
			userRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	

}
