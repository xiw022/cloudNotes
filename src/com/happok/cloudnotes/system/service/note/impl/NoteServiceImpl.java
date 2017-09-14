package com.happok.cloudnotes.system.service.note.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.common.entity.Query;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.entity.test.Test;
import com.happok.cloudnotes.system.manager.note.INoteManager;
import com.happok.cloudnotes.system.manager.test.ITestManager;
import com.happok.cloudnotes.system.service.note.INoteService;

@Component("noteService")
public class NoteServiceImpl implements INoteService{
	@Autowired
	private INoteManager noteManager;
	@Override
	public Note save(Note note) {
		noteManager.saveNote(note);
		return note;
	}
	@Override
	public List<Note> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return noteManager.findAll(map);
	}
	
	@Override
	public List<Note> find(Map<String, Object> map) {
		return noteManager.find(map);
	}
	@Override
	public Note update(Note note) {
		// TODO Auto-generated method stub 
	    noteManager.updateNote(note);
	    return note;
	}
	
	@Override
	public Note delete(Note note) {
		noteManager.deleteNote(note);
		return note;
	}
}
