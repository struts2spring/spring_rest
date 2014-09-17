package com.example.domain;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FileInformation {

	private long id;
	private String content;

	public FileInformation() {
	}

	public FileInformation(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
