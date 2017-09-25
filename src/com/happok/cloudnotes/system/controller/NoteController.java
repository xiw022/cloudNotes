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

import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.entity.user.User;
import com.happok.cloudnotes.system.service.note.INoteService;


@Controller
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	private INoteService noteService;
  
	@RequestMapping("/add")
	public String add(Note note, Model model) {
		System.out.println("go to add page");
		System.out.println("gagaga:" + note.getCreateUser());
		model.addAttribute("createUser", note.getCreateUser());
		return "note/add-note";
	}
	
	@RequestMapping("/save")
	public View save(Note note) {
		System.out.println("save");
		noteService.save(note);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request,Model model, Note note) {
		System.out.println("go to update page");
		model.addAttribute("createUser", note.getCreateUser());
		model.addAttribute("id", request.getParameter("id"));
		model.addAttribute("noteName", note.getNoteName());
		return "note/update-note";
	}
	
	@RequestMapping("/change")
	public View change(Note note, Model model) {
		System.out.println("change");
		noteService.update(note);
		model.addAttribute("createUser", note.getCreateUser());
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		System.out.println("delete");
		model.addAttribute("id", request.getParameter("id"));
		return "note/delete-note";
	}
	
	@RequestMapping("deleteNote")
	public View deleteNote(Note note){
		System.out.println("delete note");
		noteService.delete(note);
		return new RedirectView("/cloudnotes/note/list");
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list(HttpServletRequest request,Model model) {
		System.out.println(model.containsAttribute("createUser"));
		Map<String,Object> map = new HashMap<String,Object>();
		List<Note> notes = noteService.findAll(map);
		System.out.println("note number are" +notes.size());
		System.out.println("go to note list");
		model.addAttribute("notes", notes);
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(null != user ) model.addAttribute("createUser", user.getId());
		Map<String,Object> map2 = new HashMap<String,Object>();
    	map2.put("id", user.getId());
    	List<Note> result = noteService.find(map2);
    	model.addAttribute("notes", result);
		return "note/list";
	}
}
