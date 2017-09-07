package com.happok.cloudnotes.system.service.note.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.manager.note.IContentManager;
import com.happok.cloudnotes.system.service.note.IContentService;

@Service("contentService")
public class ContentService implements IContentService{
	@Autowired
	private IContentManager contentManager;
	
	@Override
	public Content save(Content content) {
		contentManager.saveContent(content);
		return content;
	}
	
	@Override
	public List<Content> find(Map<String, Object> map) {
		return contentManager.find(map);
	}
	
	@Override
	public Content update(Content content){
		contentManager.update(content);
		return content;
	}
	
	@Override
	public Content delete(Content content) {
		contentManager.deleteContent(content);
		return content;
	}
}
