package com.example.domain;

import java.util.Date;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FileInformation {

	private long id;
	private String name;
	private String type;
	private Date lastModified;

	public FileInformation() {
	}

	public FileInformation(long id, String content) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "FileInformation [id=" + id + ", name=" + name + ", type=" + type + ", lastModified=" + lastModified + "]";
	}

}
