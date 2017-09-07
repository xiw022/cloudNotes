package com.happok.cloudnotes.system.dao.note;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.happok.cloudnotes.common.dao.BaseMapper;
import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;

@MapperScan
public interface IContentDao extends BaseMapper<Content>{

	List<Content> find(Map<String, Object> map);
	
	int update(Content content);

	int delete(Content content);
}
