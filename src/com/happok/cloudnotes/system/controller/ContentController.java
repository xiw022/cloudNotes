/*
 * Arthur: Xiuhao Wang
 * Date: 9/1/17
 */
package com.happok.cloudnotes.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.service.note.IContentService;

@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private IContentService contentService;

	@RequestMapping("addContent")
	public String addContent(HttpServletRequest request, Model model){
		System.out.println("add content");
		model.addAttribute("id", request.getParameter("id"));
		return "note/add-content";
	}
	
	@RequestMapping("saveContent")
	public View saveContent(Content content) {
		System.out.println("save content");
		System.out.println(content.getContentId());
		contentService.save(content);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping("showContent")
	public String showContent(HttpServletRequest request, Model model){
	  System.out.println("show content");
	  model.addAttribute("id", request.getParameter("id"));
	  Map<String,Object> map = new HashMap<String,Object>();
	  map.put("id", request.getParameter("id"));
          List<Content> content = contentService.find(map);
          for(Content c:content) {
            System.out.println(c.getContentId());
          }
          System.out.println("contents total are" +content.size());
	  model.addAttribute("content", content);
	  return "note/show-content";
	}
	
	@RequestMapping("/updateContent")
	public String updateContent(HttpServletRequest request,Model model, Content content) {
		System.out.println("update content");
		model.addAttribute("contentId", content.getContentId());
		model.addAttribute("id", request.getParameter("id"));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", request.getParameter("id"));
		List<Content> contents = contentService.findByID(map);
		for(Content c:contents){
			model.addAttribute("content", c.getContent());
		}
		return "note/update-content";
	}
	
	@RequestMapping("/changeContent")
	public View changeContent(Content content, HttpServletRequest request) {
		System.out.println("changeContent");
		contentService.update(content);
		return new RedirectView("/cloudnotes/content/showContent?id="+request.getParameter("contentId"));
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("go to delete page");
		model.addAttribute("id", request.getParameter("id"));
		model.addAttribute("contentId", request.getParameter("contentId"));
		return "note/delete-content";
	}
	
	@RequestMapping("/deleteContent")
	public View deleteContent(Content content, HttpServletRequest request) {
		System.out.println("delete");
		contentService.delete(content);
		return new RedirectView("/cloudnotes/content/showContent?id="+request.getParameter("contentId"));
	}
}
