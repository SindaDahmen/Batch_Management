package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;

public interface ProjectService {

	public Project convertProjectDTOToProject(ProjectDTO projectDTO);
}
