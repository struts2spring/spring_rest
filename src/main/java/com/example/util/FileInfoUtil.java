package com.example.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.domain.FileInformation;

public class FileInfoUtil {

	/**
	 * This method will provide all the files and directory as its tree.
	 * 
	 * @author Vijay Kumar Keshri
	 * 
	 * @since 18-Sep-2014
	 * 
	 * @param path
	 * @return List<FileInformation>
	 */
	public List<FileInformation> getFileTreeInfo(String path) {
		List<FileInformation> lst = new ArrayList<FileInformation>();
		if (path != null) {

			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles != null) {
				for (int i = 0; i < listOfFiles.length; i++) {
					FileInformation fileInformation = new FileInformation();
					fileInformation.setName(listOfFiles[i].getName());
					fileInformation.setId(i);
					fileInformation.setFullPath(listOfFiles[i].getAbsolutePath());
					fileInformation.setLastModified(new Date(listOfFiles[i].lastModified()));
					if (listOfFiles[i].isFile()) {
						double bytes = listOfFiles[i].length();
						double kilobytes = (bytes / 1024);
						fileInformation.setSize("" + kilobytes + " KB");
						fileInformation.setType("file");
						String[] filePermission = new String[3];
						File file=listOfFiles[i];
						fileInformation.setFilePermission(filePermission);
						if (file.canRead()) {
							filePermission[0] = "x";
						} else {
							filePermission[0] = "-";
						}
						if (file.canWrite()) {
							filePermission[1] = "x";
						} else {
							filePermission[1] = "-";
						}
						if (file.canExecute()) {
							filePermission[2] = "x";
						} else {
							filePermission[2] = "-";
						}
						fileInformation.setFilePermission(filePermission);
					} else {
						fileInformation.setType("Directory");
						fileInformation.setIsDirectory("d");
						List child = this.getFileTreeInfo(listOfFiles[i].getAbsolutePath());
						fileInformation.setChildren(child);
					}
					lst.add(fileInformation);
				}

			}
		}
		return lst;
	}

	public FileInformation getFileInfo(String absoluteFilePath) {
		FileInformation fileInformation = new FileInformation();
		if (absoluteFilePath != null) {
			File file = new File(absoluteFilePath);
			System.out.println(file.exists());
			if (file.exists()) {
				fileInformation.setName(file.getName());
				fileInformation.setId(1);
				fileInformation.setFullPath(file.getAbsolutePath());
				fileInformation.setLastModified(new Date(file.lastModified()));
				double bytes = file.length();
				double kilobytes = (bytes / 1024);
				fileInformation.setSize("" + kilobytes + " KB");
				fileInformation.setType("file");
				String[] filePermission = new String[3];
				fileInformation.setFilePermission(filePermission);
				if (file.canRead()) {
					filePermission[0] = "x";
				} else {
					filePermission[0] = "-";
				}
				if (file.canWrite()) {
					filePermission[1] = "x";
				} else {
					filePermission[1] = "-";
				}
				if (file.canExecute()) {
					filePermission[2] = "x";
				} else {
					filePermission[2] = "-";
				}
				fileInformation.setFilePermission(filePermission);
			}
		}

		return fileInformation;
	}

}
