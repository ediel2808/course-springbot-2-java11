package com.soares.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soares.course.entites.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Ediel soares","daniduardo1545@gmail.com", "999999999","1234" );
		return ResponseEntity.ok().body(u);
		
		
	}
	
}
