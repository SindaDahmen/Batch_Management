package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;

public interface ProjectService {

	/**
	 * 
	 * @return
	 */
	List<Project> listProject();

	/**
	 * 
	 * @param projectDTO
	 * @return
	 */
	Project convertProjectDTOToProject(ProjectDTO projectDTO);

	/**
	 * 
	 * @param project
	 * @return
	 */
	ProjectDTO convertProjectToProjectDTO(Project project);
}
