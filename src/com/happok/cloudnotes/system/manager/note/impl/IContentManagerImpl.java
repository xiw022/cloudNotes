package com.happok.cloudnotes.system.manager.note.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.happok.cloudnotes.system.dao.note.IContentDao;
import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;
import com.happok.cloudnotes.system.manager.note.IContentManager;

@Component("contentManager")
public class IContentManagerImpl implements IContentManager{
	@Autowired
	private IContentDao contentDao;
	@Override
	public int saveContent(Content content) {
		return contentDao.save(content);
	}
	@Override
	public List<Content> find(Map<String, Object> map) {
		return contentDao.find(map);
	}
	@Override
	public int update(Content content) {
		return contentDao.update(content);
	}
	@Override
	public int deleteContent(Content content) {
		return contentDao.delete(content);
	}
}
