package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@RestController
@RequestMapping(value = "projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController extends GenericRestController<Project, ProjectDTO, ProjectService> {

	/**
	 * 
	 * @param service
	 */

	@Autowired
	private ProjectService projectService;

	public ProjectController(ProjectService service) {
		super(service);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public List<ProjectDTO> listAll() {
		return projectService.listProject();
	}

}
