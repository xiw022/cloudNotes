package com.happok.cloudnotes.system.service.note;

import java.util.List;
import java.util.Map;

import com.happok.cloudnotes.system.entity.note.Content;
import com.happok.cloudnotes.system.entity.note.Note;

public interface IContentService {

	Content save(Content content);

	List<Content> find(Map<String, Object> map);

	Content update(Content content);

	Content delete(Content content);

	List<Content> findByID(Map<String, Object> map);

}
