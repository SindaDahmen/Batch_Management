package com.nordnet.batchs.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.ProjectRepository;
import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.BatchService;
import com.nordnet.batchs.services.ProjectService;

@Service("ProjectService")
public class ProjectServiceImpl extends FwkGenericServiceImpl<Project, ProjectDTO, ProjectRepository>
		implements ProjectService {

	@Autowired
	private BatchService batchService;

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
		result.setCreateTime(new Date());
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

	@Override
	public List<ProjectDTO> listProject() {
		List<ProjectDTO> projects = this.getAll();
		for (int i = 0; i < projects.size(); i++) {

			Integer projectId = (projects.get(i)).getId();
			System.out.println(projectId);
			List<BatchDTO> batches = batchService.listBatchesByProject(projectId);

			projects.get(i).setBatchdto(batches);
		}
		return projects;

	}
}