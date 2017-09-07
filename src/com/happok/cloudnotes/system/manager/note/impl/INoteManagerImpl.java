package com.happok.cloudnotes.system.manager.note.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.system.dao.note.INoteDao;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.manager.note.INoteManager;

@Component("noteManager")
public class INoteManagerImpl implements INoteManager{
	@Autowired
	private INoteDao noteDao;
	@Override
	public int saveNote(Note note) {
		// TODO Auto-generated method stub
		return noteDao.save(note);
	}
	@Override
	public List<Note> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return noteDao.findAll(map);
	}
	
	@Override
	public int updateNote(Note note) {
		return noteDao.change(note);
	}
	
	@Override
	public int deleteNote(Note note) {
		noteDao.delete(note);
		return noteDao.reorder(note);
	}
}
