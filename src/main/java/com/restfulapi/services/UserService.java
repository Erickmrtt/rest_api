package com.restfulapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.domain.User;
import com.restfulapi.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
	}
}
