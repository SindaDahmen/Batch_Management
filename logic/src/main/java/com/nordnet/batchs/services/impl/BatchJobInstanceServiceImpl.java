package com.nordnet.batchs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobInstanceRepository;
import com.nordnet.batchs.dtos.BatchJobInstanceDTO;
import com.nordnet.batchs.entities.BatchJobInstance;
import com.nordnet.batchs.services.BatchJobInstanceService;

@Service("BatchJobInstanceService")
public class BatchJobInstanceServiceImpl implements BatchJobInstanceService {

	@Autowired
	private BatchJobInstanceRepository batchJobInstanceRepository;

	/**
	 * 
	 */

	@Override
	public BatchJobInstance convertBatchJobInstanceDTOToBatchJobInstance(BatchJobInstanceDTO batchJobInstanceDTO) {
		if (batchJobInstanceDTO == null) {
			return null;
		}

		BatchJobInstance result = new BatchJobInstance();
		result.setJobInstanceId(batchJobInstanceDTO.getJobInstanceId());
		result.setJobKey(batchJobInstanceDTO.getJobKey());
		result.setJobName(batchJobInstanceDTO.getJobName());
		result.setVersion(batchJobInstanceDTO.getVersion());
		batchJobInstanceRepository.save(result);
		return result;
	}

	/**
	 * 
	 */

	@Override
	public BatchJobInstanceDTO convertBatchJobInstanceToBatchJobInstanceDTO(BatchJobInstance batchJobInstance) {
		if (batchJobInstance == null) {
			return null;
		}

		BatchJobInstanceDTO result = new BatchJobInstanceDTO();
		result.setJobInstanceId(batchJobInstance.getJobInstanceId());
		result.setJobKey(batchJobInstance.getJobKey());
		result.setJobName(batchJobInstance.getJobName());
		result.setVersion(batchJobInstance.getVersion());
		return result;
	}

}
