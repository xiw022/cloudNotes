/*
 * Arthur: Xiuhao Wang
 * Date: 9/1/17
 */
package com.happok.cloudnotes.system.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.happok.cloudnotes.system.service.test.ITestService;


@Controller
@RequestMapping("/test")
public class LoginController {
	
	@Autowired
	private ITestService testService;

	@RequestMapping(value = "/test")
	public String index(Map<String, Object> params,Model model){
		params.put("pageNumber", "1");
		params.put("pageSize", "10");
		System.out.println("go to test page");
		model.addAttribute("list", testService.listUser(params));
		return "test/test";
	}
}
