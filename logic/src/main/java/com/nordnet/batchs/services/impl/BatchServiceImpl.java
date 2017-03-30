package com.nordnet.batchs.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchRepository;
import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;
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

	/**
	 * 
	 * @param batchs
	 * @return
	 */
	private List<BatchDTO> convertBatchsToBatchDTOS(List<Batch> batchs) {
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
	private BatchDTO convertBatchToBatchDTO(Batch batch) {
		if (batch == null) {
			return null;
		}
		BatchDTO result = new BatchDTO();
		result.setId(batch.getId());
		result.setHttpVerb(batch.getHttpVerb());
		result.setDescription(batch.getDescription());
		return result;
	}

}
