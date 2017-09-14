package com.happok.cloudnotes.system.service.note;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.happok.cloudnotes.common.entity.Page;
import com.happok.cloudnotes.common.entity.Query;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.entity.test.Test;
import com.happok.cloudnotes.system.manager.note.INoteManager;
public interface INoteService {

	Note save(Note note);
	
	List<Note> findAll(Map<String,Object> map);

	Note update(Note note);

	Note delete(Note note);

	List<Note> find(Map<String, Object> map);
	
}
