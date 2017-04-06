package com.nordnet.batchs.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.ProjectRepository;
import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.ProjectService;

@Service("ProjectService")
public class ProjectServiceImpl extends FwkGenericServiceImpl<Project, ProjectDTO, ProjectRepository> implements ProjectService {

	public ProjectServiceImpl(ProjectRepository repository) {
		super(repository);
	}

	@Override
	public Project convertToEntity(ProjectDTO projectDTO) {
		if (projectDTO == null) {
			return null;
		}

		Project result = new Project();
		BeanUtils.copyProperties(projectDTO, result);
		return result;
	}

	@Override
	public ProjectDTO convertToDTO(Project project) {
		if (project == null) {
			return null;
		}

		ProjectDTO result = new ProjectDTO();
		BeanUtils.copyProperties(project, result);
		return result;
	}

}