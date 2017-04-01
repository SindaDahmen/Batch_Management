package com.nordnet.batchs.controllers;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GET
	@RequestMapping(value = "listproject", method = RequestMethod.GET)
	public List<Project> listingProject() {
		List<Project> project = projectService.listProject();
		return project;
	}

}
