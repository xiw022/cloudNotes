package com.happok.cloudnotes.system.manager.note;

import java.util.List;
import java.util.Map;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;

public interface IContentManager {

	public int saveContent(Content content);

	public List<Content> find(Map<String, Object> map);

	public int update(Content content);

	public int deleteContent(Content content);

}
