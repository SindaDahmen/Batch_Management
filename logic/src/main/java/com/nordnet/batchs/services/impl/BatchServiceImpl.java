package com.nordnet.batchs.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchRepository;
import com.nordnet.batchs.daos.ProjectRepository;
import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;
import com.nordnet.batchs.entities.Project;
import com.nordnet.batchs.services.BatchService;

@Service("BatchService")
public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepository batchRepository;

	@Override
	public List<BatchDTO> listBatchesByProject(int projectId) {
		List<Batch> batchs = this.batchRepository.findByProjectId(projectId);
		List<BatchDTO> result = convertBatchsToBatchDTOS(batchs);
		return result;
	}

	@Override
	public List<BatchDTO> listBatchs() {
		List<Batch> batchs = (List<Batch>) this.batchRepository.findAll();
		List<BatchDTO> result = convertBatchsToBatchDTOS(batchs);
		return result;
	}

	@Override
	public BatchDTO listBatchesById(int batchId) {
		Batch bat = this.batchRepository.findOne(batchId);
		BatchDTO batch = convertBatchToBatchDTO(bat);
		return batch;
	}

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Batch createBatch(BatchDTO batchdto, int projectId) {

		Project project = projectRepository.findOne(projectId);
		Batch batch = convertBatchDTOToBatch(batchdto);
		batch.setDescription(batchdto.getDescription());
		batch.setHttpVerb(batchdto.getHttpVerb());
		batch.setName(batchdto.getName());
		batch.setParameters(batchdto.getParameters());
		batch.setUrl(batchdto.getUrl());
		batch.setProject(project);

		// Batch batch = convertBatchDTOToBatch(batchdto);

		Batch bat = batchRepository.save(batch);
		return bat;
	}

	@Override
	public boolean deleteBatchById(int batchId) {
		batchRepository.delete(batchId);
		return true;

	}

	@Override
	public Batch updateBatch(BatchDTO batchdto, int batchId) {
		Batch batch = convertBatchDTOToBatch(batchdto);
		// batch.setProject(batch.getProject());

		Batch bat = batchRepository.findOne(batchId);
		bat.setDescription(batch.getDescription());
		bat.setHttpVerb(batch.getHttpVerb());
		bat.setName(batch.getName());
		bat.setParameters(batch.getParameters());
		bat.setUrl(batch.getUrl());
		Batch b = batchRepository.save(bat);
		return b;

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

		return result;
	}

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

		return result;
	}

}
