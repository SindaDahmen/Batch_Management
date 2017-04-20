package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@RestController
@RequestMapping(value = "projects")
// @CrossOrigin(origins = "http://localhost:3000")
public class ProjectController extends GenericRestController<Project, ProjectDTO, ProjectService> {

	/**
	 * 
	 * @param service
	 */
	public ProjectController(ProjectService service) {
		super(service);
	}

}
