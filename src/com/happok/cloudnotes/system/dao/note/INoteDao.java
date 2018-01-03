/*
 * Arthur: Xiuhao Wang
 * Date: 9/1/17
 */
package com.happok.cloudnotes.system.dao.note;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.happok.cloudnotes.common.dao.BaseMapper;
import com.happok.cloudnotes.system.entity.note.Note;
@MapperScan
public interface INoteDao extends BaseMapper<Note>{

	List<Note> findAll(Map<String,Object> map);
	
	int save(Map<String,Object> map);

	int change(Note note);
	
	int delete(Note note);
	
	int reorder(Note note);

	List<Note> find(Map<String, Object> map);
}
