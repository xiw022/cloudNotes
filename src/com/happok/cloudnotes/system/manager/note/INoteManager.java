package com.happok.cloudnotes.system.manager.note;

import java.util.List;
import java.util.Map;

import com.happok.cloudnotes.system.entity.note.Note;

public interface INoteManager {

	public int saveNote(Note note);
	
	List<Note> findAll(Map<String,Object> map);

	public int updateNote(Note note);

	int deleteNote(Note note);
}
