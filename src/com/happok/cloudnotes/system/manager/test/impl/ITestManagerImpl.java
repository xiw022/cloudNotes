package com.happok.cloudnotes.system.manager.test.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.common.entity.Query;
import com.happok.cloudnotes.system.dao.test.ITestDao;
import com.happok.cloudnotes.system.entity.test.Test;
import com.happok.cloudnotes.system.manager.test.ITestManager;

@Component("testManager")
public class ITestManagerImpl implements ITestManager {

	@Autowired
	private ITestDao testDao;
	@Override
	public List<Test> listTest(Page<Test> page, Query search) {
		// TODO Auto-generated method stub
		return testDao.listForPage(page, search);
	}

}
