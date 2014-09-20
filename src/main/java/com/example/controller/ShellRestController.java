package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	/**
	 * This method handles single file info.
	 * 
	 * @author vijay kumar keshri
	 * @since 20-Sep-2014
	 * 
	 * @param command
	 * @return
	 */
	@RequestMapping(value = "/shell/command", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public FileInformation getFileInfo(@RequestBody Command command) {
		logger.debug("Provider has received request to get command: " + command);
		System.out.println(command);

		return shellService.getFileInfo(command.getValue());
	}

	/**
	 * This method provide information of a directory as a tree.
	 * 
	 * @author vijay kumar keshri
	 * @since 20-Sep-2014
	 * 
	 * @param command
	 * @return
	 */
	@RequestMapping(value = "/command/cmd", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<FileInformation> getAllFlies(@RequestBody Command command) {
		logger.debug("Provider has received request to get command: " + command);
		System.out.println(command);

		return shellService.listAll(command.getValue());
	}
}
