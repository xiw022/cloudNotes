package com.happok.cloudnotes.system.dao.test;

import org.mybatis.spring.annotation.MapperScan;

import com.happok.cloudnotes.common.dao.BaseMapper;
import com.happok.cloudnotes.system.entity.test.Test;

@MapperScan
public interface ITestDao extends BaseMapper<Test>{

	
}
