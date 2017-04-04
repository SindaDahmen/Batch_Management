package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@RestController
@RequestMapping(value = "projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Project> listingProject() {
		List<Project> project = projectService.listProject();
		return project;
	}

}
