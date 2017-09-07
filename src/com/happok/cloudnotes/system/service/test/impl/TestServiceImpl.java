package com.happok.cloudnotes.system.service.test.impl;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.common.entity.Query;
import com.happok.cloudnotes.system.entity.test.Test;
import com.happok.cloudnotes.system.manager.test.ITestManager;
import com.happok.cloudnotes.system.service.test.ITestService;

@Component("testService")
public class TestServiceImpl implements ITestService{

	@Autowired
	private ITestManager testManager;
	@Override
	public Page<Test> listUser(Map<String, Object> params) {
		Query form = new Query(params);
		Page<Test> page = new Page<>(form);
		testManager.listTest(page, form);
		return page;
	}

}
