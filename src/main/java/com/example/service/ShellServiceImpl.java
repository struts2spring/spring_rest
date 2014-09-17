package com.example.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.FileInformation;

@Component
public class ShellServiceImpl implements ShellService {

	@Override
	public List<FileInformation> listAll(String command) {

		// TODO Auto-generated method stub
		List<FileInformation> lst = new ArrayList<FileInformation>();
		// for (long i = 1; i < 10; i++) {
		//
		// lst.add(new FileInformation(i, "" + i));
		// }

		// Directory path here
		if(command!=null && !command.equals("")){
			
		}
		String path = ".";
		
		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		if (listOfFiles != null) {
			for (int i = 0; i < listOfFiles.length; i++) {

				if (listOfFiles[i].isFile()) {
					files = listOfFiles[i].getName();
					System.out.println(files);
				}
			}
		}

		return lst;
	}

}
