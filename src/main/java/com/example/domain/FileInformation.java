package com.example.domain;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FileInformation {

	private long id;
	/**
	 * Name of the file
	 */
	private String name;

	/**
	 * This field contain type of file.
	 */
	private String type;

	/**
	 * This field contain full path of the files / directory.
	 */
	private String fullPath;

	/**
	 * calculating the size if it is a file / directory.
	 */
	private String size;

	/**
	 * It is a flag for giving information that it is a file or a directory. The
	 * posilbe values is <b>d</b> if direcotry. or null if it is a file.
	 */
	private String isDirectory;

	/**
	 * Last modified information of directory / file.
	 */
	private Date lastModified;

	private List<Object> children;

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

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getIsDirectory() {
		return isDirectory;
	}

	public void setIsDirectory(String isDirectory) {
		this.isDirectory = isDirectory;
	}

	public List<Object> getChildren() {
		return children;
	}

	public void setChildren(List<Object> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "FileInformation [id=" + id + ", name=" + name + ", type=" + type + ", fullPath=" + fullPath + ", size=" + size
				+ ", isDirectory=" + isDirectory + ", lastModified=" + lastModified + ", children=" + children + "]";
	}

}
