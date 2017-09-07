package com.happok.cloudnotes.system.service.test;

import java.util.Map;


import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.system.entity.test.Test;

public interface ITestService {

	Page<Test> listUser(Map<String, Object> params);
}
