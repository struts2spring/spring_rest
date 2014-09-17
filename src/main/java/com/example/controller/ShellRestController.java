package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Command;
import com.example.domain.FileInformation;
import com.example.service.ShellService;

@RestController
@RequestMapping("/")
public class ShellRestController {

	@Autowired
	private ShellService shellService;
	private Logger logger = LoggerFactory.getLogger(ShellRestController.class);

	@RequestMapping(value = "/shell/{command}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<FileInformation> getBook(@PathVariable("command") String cmd) {
		logger.debug("Provider has received request to get command: " + cmd);
		System.out.println(cmd);

		return shellService.listAll(cmd);
	}

	@RequestMapping(value = "/command/cmd", method = RequestMethod.POST, headers="Accept=application/xml, application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<FileInformation> getAllFlies(@RequestBody Command command) {
		logger.debug("Provider has received request to get command: " + command);
		System.out.println(command);

		return shellService.listAll("");
	}
}
