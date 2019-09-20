package com.example.sba.service;

import com.example.sba.model.User;
import com.example.sba.model.UserLogin;

public interface UserService {

	User loginUser(String id);

	boolean registerUser(User user);
	public User getUpdateUser(User user);

	User getUser(int id);
}
