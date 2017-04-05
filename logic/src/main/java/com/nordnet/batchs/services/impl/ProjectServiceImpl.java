package com.nordnet.batchs.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.ProjectRepository;
import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	/**
	 * 
	 */

	@Override
	public List<Project> listProject() {
		List<Project> project = (List<Project>) this.projectRepository.findAll();
		return project;
	}

	/**
	 * 
	 */
	@Override
	public Project convertProjectDTOToProject(ProjectDTO projectDTO) {
		if (projectDTO == null) {
			return null;
		}

		Project result = new Project();
		result.setId(projectDTO.getId());
		result.setName(projectDTO.getName());
		result.setDescription(projectDTO.getDescription());
		result.setServicesUrl(projectDTO.getServicesUrl());
		result.setSwaggerUrl(projectDTO.getSwaggerUrl());
		result.setVersion(projectDTO.getVersion());
		return result;
	}

	/**
	 * 
	 */

	@Override
	public ProjectDTO convertProjectToProjectDTO(Project project) {
		if (project == null) {
			return null;
		}

		ProjectDTO result = new ProjectDTO();
		result.setId(project.getId());
		result.setName(project.getName());
		result.setDescription(project.getDescription());
		result.setServicesUrl(project.getServicesUrl());
		result.setSwaggerUrl(project.getSwaggerUrl());
		result.setVersion(project.getVersion());
		return result;
	}

}
