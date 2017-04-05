package com.nordnet.batchs.services.impl;

import java.util.ArrayList;
import java.util.List;

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
public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepository batchRepository;

	@Autowired
	private ProjectService projectService;

	/**
	 * 
	 */

	@Override
	public List<BatchDTO> listBatchesByProject(int projectId) {
		List<Batch> batchs = this.batchRepository.findByProjectId(projectId);
		List<BatchDTO> result = convertBatchsToBatchDTOS(batchs);
		return result;
	}

	/**
	 * 
	 */

	@Override
	public List<BatchDTO> listBatchs() {
		List<Batch> batchs = (List<Batch>) this.batchRepository.findAll();
		List<BatchDTO> result = convertBatchsToBatchDTOS(batchs);
		return result;
	}

	/**
	 * 
	 */

	@Override
	public BatchDTO listBatchesById(int batchId) {
		Batch bat = this.batchRepository.findOne(batchId);
		BatchDTO batch = convertBatchToBatchDTO(bat);
		return batch;
	}

	/**
	 * 
	 */

	@Override
	public BatchDTO createBatch(BatchDTO batchdto) {
		Batch batch = convertBatchDTOToBatch(batchdto);
		Batch savedBatch = batchRepository.save(batch);
		return convertBatchToBatchDTO(savedBatch);
	}

	/**
	 * 
	 */

	@Override
	public boolean deleteBatchById(int batchId) {
		batchRepository.delete(batchId);
		return true;

	}

	/**
	 * 
	 */

	@Override
	public BatchDTO updateBatch(BatchDTO batchdto) {
		Batch batch = convertBatchDTOToBatch(batchdto);
		Batch savedBatch = batchRepository.save(batch);
		return convertBatchToBatchDTO(savedBatch);

	}

	/**
	 * 
	 * @param batchs
	 * @return
	 */

	public List<BatchDTO> convertBatchsToBatchDTOS(List<Batch> batchs) {
		List<BatchDTO> result = new ArrayList<BatchDTO>();
		for (Batch batch : batchs) {
			BatchDTO batchDTO = convertBatchToBatchDTO(batch);
			if (batchDTO != null) {
				result.add(batchDTO);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param batch
	 * @return
	 */

	public BatchDTO convertBatchToBatchDTO(Batch batch) {
		if (batch == null) {
			return null;
		}
		BatchDTO result = new BatchDTO();
		result.setId(batch.getId());
		result.setHttpVerb(batch.getHttpVerb());
		result.setDescription(batch.getDescription());
		result.setName(batch.getName());
		result.setParameters(batch.getParameters());
		result.setUrl(batch.getUrl());
		if (batch.getProject() != null) {
			ProjectDTO projectDTO = convertProjectToProjectDTO(batch.getProject());
			result.setProjectDTO(projectDTO);

		}
		return result;

	}

	/**
	 * 
	 * @param project
	 * @return
	 */

	private ProjectDTO convertProjectToProjectDTO(Project project) {
		if (project == null) {
			return null;
		}
		return projectService.convertProjectToProjectDTO(project);
	}

	/**
	 * 
	 */

	public List<Batch> convertBatchsDTOToBatch(List<BatchDTO> batchsDTO) {
		List<Batch> result = new ArrayList<Batch>();
		for (BatchDTO batchDTO : batchsDTO) {
			Batch batch = convertBatchDTOToBatch(batchDTO);
			if (batch != null) {
				result.add(batch);
			}
		}
		return result;

	}

	/**
	 * 
	 */

	public Batch convertBatchDTOToBatch(BatchDTO batchDTO) {
		if (batchDTO == null) {
			return null;
		}

		Batch result = new Batch();
		result.setId(batchDTO.getId());
		result.setHttpVerb(batchDTO.getHttpVerb());
		result.setDescription(batchDTO.getDescription());
		result.setName(batchDTO.getName());
		result.setParameters(batchDTO.getParameters());
		result.setUrl(batchDTO.getUrl());
		if (batchDTO.getProjectDTO() != null) {
			Project project = convertProjectDTOToProject(batchDTO.getProjectDTO());
			result.setProject(project);
			// project.getBatches().add(result);

		}

		return result;
	}

	/**
	 * 
	 * @param projectDTO
	 * @return
	 */

	private Project convertProjectDTOToProject(ProjectDTO projectDTO) {
		if (projectDTO == null) {
			return null;
		}
		return projectService.convertProjectDTOToProject(projectDTO);
	}

}
