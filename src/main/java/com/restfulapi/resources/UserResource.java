package com.restfulapi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
	User erick = new User("Erick Teixeira", "erick@gmail.com", "12/05/1999", "108.788.676-78", "29/03/2021", "Butantan");
	User maria = new User("Maria Luzieta", "maria@gmail.com", "19/09/1992", "309.377.160-90", "29/03/2021", "Harvard");
	
	List<User> list = new ArrayList<>();
	list.addAll(Arrays.asList(maria, erick));
	return ResponseEntity.ok().body(list);
	}
}
