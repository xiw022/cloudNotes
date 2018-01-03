/*
 * Arthur: Xiuhao Wang
 * Date: 9/1/17
 */
package com.happok.cloudnotes.system.dao.user;
import java.util.List;
import java.util.Map;

import com.happok.cloudnotes.system.entity.user.User;

public interface IUserDao {
	int update(User user);

	int delete(User user);
	
	int save(User user);

	List<User> find(Map<String, Object> map);
}
