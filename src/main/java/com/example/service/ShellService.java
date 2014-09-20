package com.example.service;

import java.util.List;

import com.example.domain.FileInformation;

public interface ShellService {

	/**
	 * This method list all the file and directory for the given path.
	 * 
	 * @author Vijay Kumar Keshri
	 * 
	 * @param command
	 * @return List<FileInformation>
	 */
	List<FileInformation> listAll(String command);

	/**
	 * This method give the file information if file path provided.
	 * 
	 * @author Vijay Kumar Keshri
	 * 
	 * @param fileNameWithAbsolutePath
	 * @return FileInformation
	 */
	FileInformation getFileInfo(String fileNameWithAbsolutePath);
}
