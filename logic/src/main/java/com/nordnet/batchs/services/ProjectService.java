package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;

public interface ProjectService extends FwkGenericService<Project, ProjectDTO> {

	List<ProjectDTO> listProject();

}
