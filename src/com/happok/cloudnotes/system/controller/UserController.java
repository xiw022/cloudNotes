/*
 * Arthur: Xiuhao Wang
 * Date: 9/1/17
 */
package com.happok.cloudnotes.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.entity.user.User;
import com.happok.cloudnotes.system.service.note.INoteService;
import com.happok.cloudnotes.system.service.user.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
  	@Autowired
	private IUserService userService;
  	
  	@Autowired
  	private INoteService noteService;

  	@RequestMapping(value = "/loginPage") 
  	public String loginPage(HttpServletRequest request,Model model){
  		return "user/login";
  	}
  	@RequestMapping(value = "/login")
  	public String login(User user, Model model,HttpServletRequest request) {
  	    Map<String,Object> map = new HashMap<String,Object>();
  	    //System.out.println(request.getParameter("userName"));
  	    map.put("userName", user.getUserName());
  	    map.put("userPassword", user.getUserPassword());
  	    for (Map.Entry entry : map.entrySet()) {
  	      System.out.println(entry.getKey() + ", " + entry.getValue());
    	}
        List<User> users = userService.find(map);
  		System.out.println("begin login");
        if(!users.isEmpty()) {
        	System.out.println("correct");
        	User a = users.get(0);
        	HttpSession session = request.getSession();
        	session.setAttribute("user", a);
        	model.addAttribute("createUser", a.getId());
        	Map<String,Object> map2 = new HashMap<String,Object>();
        	map2.put("id", a.getId());
        	List<Note> notes = noteService.find(map2);
        	model.addAttribute("notes", notes);
        	return "note/list";
        }
  		return "user/alert";
  	}
  	@RequestMapping(value = "/updatePage")
  	public String updatePage(HttpServletRequest request, Model model) {
  		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userPassword", user.getUserPassword());
		model.addAttribute("phone", user.getPhone());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("createUser", user.getId());
  		return "user/update";
  	}
  	
  	@RequestMapping(value = "/updatePageAlert")
  	public String updatePageAlert(HttpServletRequest request, Model model) {
  		System.out.println("shishao jinlai le");
  		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userPassword", user.getUserPassword());
		model.addAttribute("phone", user.getPhone());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("createUser", user.getId());
  		return "user/updateAlert";
  	}
  	@RequestMapping(value = "/alert")
  	public String alert(HttpServletRequest request, Model model) {
  		return "user/alert";
  	}
  	@RequestMapping(value = "/registerPage")
  	public String registerPage(HttpServletRequest request,Model model) {
  		return "user/register";
  	}
  	@RequestMapping(value = "/registerPageWithAlert")
  	public String registerPageWithAlert(HttpServletRequest request,Model model) {
  		return "user/registerAlert";
  	}
	
  	@RequestMapping(value = "/register")
 	public View register(User user) {
  		
  		if((user.getEmail().equals("")) || user.getPhone().equals("") ||
  				user.getUserName().equals("") || user.getUserPassword().equals("")) {
  			return new RedirectView("/cloudnotes/user/registerPageWithAlert"); 
  		}
  		userService.save(user);
  		return new RedirectView("/cloudnotes/user/loginPage");
  	}
  	
	@RequestMapping(value = "/insert")
	public String insert(User user) {
		userService.save(user);
		return "test/test";
	}
	
	@RequestMapping(value = "/update")
	public View update(User user, HttpServletRequest request) {
		HttpSession session = request.getSession();
    	session.setAttribute("user", user);
		if((user.getEmail().equals("")) || user.getPhone().equals("") ||
  				user.getUserName().equals("") || user.getUserPassword().equals("")) {
			return new RedirectView("/cloudnotes/user/updatePageAlert");
  		}
		userService.update(user);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping(value = "delete/")
	public String delete(User user) {
		userService.delete(user);
		return "test/test";
	}
}
