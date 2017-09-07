package com.happok.cloudnotes.system.entity.note;

import java.io.Serializable;
import java.util.Date;
public class Note implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1945991759158619110L;

	//id
	private Long id;
	
	//note_name
	private String noteName;
  
	//create_user
	private Long createUser;
	
	//create_time
	private Date createTime;
	
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoteName() {
		return noteName;
	}

	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	//tb_d_note id note_name create_user create_time

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
