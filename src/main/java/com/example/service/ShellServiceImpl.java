package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.FileInformation;
import com.example.util.FileInfoUtil;

@Component
public class ShellServiceImpl implements ShellService {

	@Override
	public List<FileInformation> listAll(String path) {

		List<FileInformation> fileList = new ArrayList<FileInformation>();

		if (path != null) {
			FileInfoUtil fileInfoUtil = new FileInfoUtil();
			fileList = fileInfoUtil.getFileTreeInfo(path);

		}
		return fileList;
	}

	@Override
	public FileInformation getFileInfo(String fileNameWithAbsolutePath) {
		FileInformation fileInformation=new FileInformation();
		if (fileNameWithAbsolutePath != null) {
			FileInfoUtil fileInfoUtil = new FileInfoUtil();
			fileInformation = fileInfoUtil.getFileInfo(fileNameWithAbsolutePath);

		}
		return fileInformation;
	}
	
	
}
