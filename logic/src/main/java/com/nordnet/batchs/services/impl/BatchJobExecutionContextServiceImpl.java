package com.nordnet.batchs.services.impl;

import org.springframework.stereotype.Service;

import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.services.BatchJobExecutionContextService;

@Service("BatchJobExecutionContextService")
public class BatchJobExecutionContextServiceImpl implements BatchJobExecutionContextService {

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

		result.setSerializedContext(batchjobexecutioncontextDTO.getSerializedContext());

		result.setShortContext(batchjobexecutioncontextDTO.getShortContext());

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
		result.setSerializedContext(batchJobExecutionContext.getSerializedContext());
		result.setShortContext(batchJobExecutionContext.getShortContext());

		return result;
	}

}
