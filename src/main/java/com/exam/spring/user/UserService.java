package com.exam.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private UserInterface ui;
	
	public User showById(int id) {
		return ui.findById(id).get();
}
}