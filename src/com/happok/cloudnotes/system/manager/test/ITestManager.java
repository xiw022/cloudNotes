package com.happok.cloudnotes.system.manager.test;

import java.util.List;

import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.common.entity.Query;
import com.happok.cloudnotes.system.entity.test.Test;

public interface ITestManager {

	List<Test> listTest(Page<Test> page, Query search);
}
