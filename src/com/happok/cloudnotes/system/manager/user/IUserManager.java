package com.happok.cloudnotes.system.manager.user;

import java.util.List;
import java.util.Map;

import com.happok.cloudnotes.system.entity.user.User;

public interface IUserManager {
	int save(User user);

	int update(User user);

	List<User> find(Map<String, Object> map);

	int delete(User user);
}
