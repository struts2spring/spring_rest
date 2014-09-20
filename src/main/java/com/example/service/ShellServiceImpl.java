package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.FileInformation;
import com.example.util.FileInfoUtil;

@Component
public class ShellServiceImpl implements ShellService {

	/**
	 * This method list all the file and directory for the given path.
	 * 
	 * @author Vijay Kumar Keshri
	 * 
	 * @param command
	 * @return List<FileInformation>
	 */
	@Override
	public List<FileInformation> listAll(String path) {

		List<FileInformation> fileList = new ArrayList<FileInformation>();

		if (path != null) {
			FileInfoUtil fileInfoUtil = new FileInfoUtil();
			fileList = fileInfoUtil.getFileTreeInfo(path);

		}
		return fileList;
	}

	/**
	 * This method give the file information if file path provided.
	 * 
	 * @author Vijay Kumar Keshri
	 * 
	 * @param fileNameWithAbsolutePath
	 * @return FileInformation
	 */
	@Override
	public FileInformation getFileInfo(String fileNameWithAbsolutePath) {
		FileInformation fileInformation=new FileInformation();
		if (fileNameWithAbsolutePath != null) {
			FileInfoUtil fileInfoUtil = new FileInfoUtil();
			try {
				fileInformation = fileInfoUtil.getFileInfo(fileNameWithAbsolutePath);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return fileInformation;
	}
	
	
}
