package com.example.service;

import java.util.List;

import com.example.domain.FileInformation;

public interface ShellService {

	List<FileInformation> listAll(String command);

}
