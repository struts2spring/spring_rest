package com.example.service;

import java.util.List;

import com.example.domain.FileInformation;

public interface ShellService {

	/**
	 * 
	 * @param command
	 * @return
	 */
	List<FileInformation> listAll(String command);

	/**
	 * 
	 * @param fileNameWithAbsolutePath
	 * @return
	 */
	FileInformation getFileInfo(String fileNameWithAbsolutePath);
}
