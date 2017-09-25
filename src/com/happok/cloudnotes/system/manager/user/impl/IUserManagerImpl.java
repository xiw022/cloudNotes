package com.happok.cloudnotes.system.manager.user.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.happok.cloudnotes.system.dao.user.IUserDao;
import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.user.User;
import com.happok.cloudnotes.system.manager.user.IUserManager;

@Component("userManager")
public class IUserManagerImpl implements IUserManager{
	@Autowired
	private IUserDao userDao;
	@Override
    public int save(User user) {
    	return userDao.save(user);
    }
	@Override
	public int update(User user) {
		return userDao.update(user);
	}
	@Override
	public List<User> find(Map<String, Object> map) {
		return userDao.find(map);
	}
	@Override
	public int delete(User user) {
		return userDao.delete(user);
	}
}
