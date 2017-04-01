package com.nordnet.batchs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionContextRepository;
import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.services.BatchJobExecutionContextService;

@Service("BatchJobExecutionContextService")
public class BatchJobExecutionContextServiceImpl implements BatchJobExecutionContextService {

	@Autowired
	private BatchJobExecutionContextRepository batchJobExecutionContextRepository;

	/**
	 * 
	 * @param batchjobexecutioncontextDTO
	 * @return
	 */

	@Override
	public BatchJobExecutionContext convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
			BatchJobExecutionContextDTO batchjobexecutioncontextDTO) {
		if (batchjobexecutioncontextDTO == null) {
			return null;
		}

		BatchJobExecutionContext result = new BatchJobExecutionContext();
		result.setJobExecutionId(batchjobexecutioncontextDTO.getJobExecutionId());
		result.setSerializedContext(batchjobexecutioncontextDTO.getSerializedContext());
		result.setShortContext(batchjobexecutioncontextDTO.getShortContext());
		batchJobExecutionContextRepository.save(result);
		return result;
	}

	/**
	 * 
	 * @param batchJobExecutionContext
	 * @return
	 */

	@Override
	public BatchJobExecutionContextDTO convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
			BatchJobExecutionContext batchJobExecutionContext) {
		if (batchJobExecutionContext == null) {
			return null;
		}

		BatchJobExecutionContextDTO result = new BatchJobExecutionContextDTO();
		result.setJobExecutionId(batchJobExecutionContext.getJobExecutionId());
		result.setSerializedContext(batchJobExecutionContext.getSerializedContext());
		result.setShortContext(batchJobExecutionContext.getShortContext());
		return result;
	}

}
