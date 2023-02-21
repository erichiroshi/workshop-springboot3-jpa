package br.com.erichiroshi.course.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erichiroshi.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	User u1 = new User(1L, "Maria", "maria@gmail.com", "123456789", "123456");
	User u2 = new User(2L, "José", "jose@gmail.com", "987654321", "987654");
	List<User> users = new ArrayList<>();

	@GetMapping("id")
	public ResponseEntity<User> findId() {

		return ResponseEntity.ok(u1);
	}

	@GetMapping
	public ResponseEntity<List<User>> findAll() {

		users.addAll(Arrays.asList(u1, u2));

		return ResponseEntity.ok(users);
	}

}