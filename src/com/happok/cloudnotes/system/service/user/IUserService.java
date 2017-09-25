package com.happok.cloudnotes.system.service.user;

import java.util.Map;
import com.happok.cloudnotes.system.entity.user.User;
import java.util.List;

public interface IUserService {

	User save(User user);

	User update(User user);
   
	List<User> find(Map<String, Object> map);

	User delete(User user);
}
