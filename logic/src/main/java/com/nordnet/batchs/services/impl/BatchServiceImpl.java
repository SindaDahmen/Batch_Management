package com.nordnet.batchs.services.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchRepository;
import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.dtos.ProjectDTO;
import com.nordnet.batchs.entities.Batch;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.BatchService;
import com.nordnet.batchs.services.ProjectService;

@Service("BatchService")
public class BatchServiceImpl extends FwkGenericServiceImpl<Batch, BatchDTO, BatchRepository> implements BatchService {

	@Autowired
	private BatchRepository batchRepository;

	@Autowired
	private ProjectService projectService;

	/**
	 * 
	 * @param repository
	 */
	public BatchServiceImpl(BatchRepository repository) {
		super(repository);
	}

	@Override
	public List<BatchDTO> listBatchesByProject(int projectId) {
		List<Batch> batchs = this.batchRepository.findByProjectId(projectId);
		List<BatchDTO> result = convertToDTO(batchs);
		return result;
	}

	@Override
	public Batch convertToEntity(BatchDTO batchDTO) {
		if (batchDTO == null) {
			return null;
		}

		Batch result = new Batch();
		BeanUtils.copyProperties(batchDTO, result);

		if (batchDTO.getProjectDTO() != null) {
			Project project = projectService.convertToEntity(batchDTO.getProjectDTO());
			result.setProject(project);
		}

		return result;
	}

	@Override
	public BatchDTO convertToDTO(Batch batch) {
		if (batch == null) {
			return null;
		}

		BatchDTO result = new BatchDTO();
		BeanUtils.copyProperties(batch, result);

		if (batch.getProject() != null) {
			ProjectDTO projectDTO = projectService.convertToDTO(batch.getProject());
			result.setProjectDTO(projectDTO);
		}
		return result;

	}

}
