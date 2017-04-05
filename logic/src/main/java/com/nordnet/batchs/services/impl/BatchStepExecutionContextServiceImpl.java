package com.nordnet.batchs.services.impl;

import org.springframework.stereotype.Service;

import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
import com.nordnet.batchs.services.BatchStepExecutionContextService;

@Service("BatchStepExecutionContextService")
public class BatchStepExecutionContextServiceImpl implements BatchStepExecutionContextService {

	/**
	 * 
	 * @param batchstepexecutioncontextDTO
	 * @return
	 */

	@Override
	public BatchStepExecutionContext convertBatchStepExecutionContextDTOToBatchStepExecutionContext(
			BatchStepExecutionContextDTO batchstepexecutioncontextDTO) {
		if (batchstepexecutioncontextDTO == null) {
			return null;
		}

		BatchStepExecutionContext result = new BatchStepExecutionContext();

		result.setSerializedContext(batchstepexecutioncontextDTO.getSerializedContext());

		result.setShortContext(batchstepexecutioncontextDTO.getShortContext());

		return result;
	}

	/**
	 * 
	 * @param batchJobExecutionContext
	 * @return
	 */

	@Override
	public BatchStepExecutionContextDTO convertBatchStepExecutionContextToBatchStepExecutionContextDTO(
			BatchStepExecutionContext batchStepExecutionContext) {
		if (batchStepExecutionContext == null) {
			return null;
		}

		BatchStepExecutionContextDTO result = new BatchStepExecutionContextDTO();
		result.setSerializedContext(batchStepExecutionContext.getSerializedContext());
		result.setShortContext(batchStepExecutionContext.getShortContext());

		return result;
	}

}
