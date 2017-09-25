package com.happok.cloudnotes.system.service.user.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.system.entity.user.User;
import com.happok.cloudnotes.system.manager.user.IUserManager;
import com.happok.cloudnotes.system.service.user.IUserService;

@Component("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserManager userManager;
	
	@Override
	public User save(User user) {
		userManager.save(user);
		return user;
	}

	@Override
	public User update(User user) {
		userManager.update(user);
		return user;
	}

	@Override
	public List<User> find(Map<String, Object> map) {
		return userManager.find(map);
	}

	@Override
	public User delete(User user) {
		userManager.delete(user);
		return user;
	}
	
}
