package com.nordnet.batchs.services.impl;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;

public class ProjectServiceImpl {

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

}
