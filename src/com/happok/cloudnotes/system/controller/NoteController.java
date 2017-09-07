package com.happok.cloudnotes.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.service.note.IContentService;
import com.happok.cloudnotes.system.service.note.INoteService;


@Controller
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	private INoteService noteService;
  
	@RequestMapping("/add")
	public String add(Note note) {
		System.out.println("通往添加页面");
		return "note/add-note";
	}
	
	@RequestMapping("/save")
	public View save(Note note) {
		System.out.println("保存");
		noteService.save(note);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model) {
		System.out.println("前往update页面");
		model.addAttribute("id", request.getParameter("id"));
		return "note/update-note";
	}
	
	@RequestMapping("/change")
	public View change(Note note) {
		System.out.println("change");
		noteService.update(note);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		System.out.println("前往删除确认页面");
		model.addAttribute("id", request.getParameter("id"));
		return "note/delete-note";
	}
	
	@RequestMapping("deleteNote")
	public View deleteNote(Note note){
		System.out.println("删除");
		noteService.delete(note);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list(HttpServletRequest request,Model model) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		List<Note> notes = noteService.findAll(map);
		System.out.println("笔记本数是" +notes.size());
		System.out.println("进入笔记本列表");
		model.addAttribute("notes", notes);
		return "note/list";
	}
}
