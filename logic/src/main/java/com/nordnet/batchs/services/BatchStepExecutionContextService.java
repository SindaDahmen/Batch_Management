package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.entities.BatchStepExecutionContext;

public interface BatchStepExecutionContextService {

	/**
	 * 
	 * @param batchstepexecutioncontextDTO
	 * @return
	 */

	BatchStepExecutionContext convertBatchStepExecutionContextDTOToBatchStepExecutionContext(
			BatchStepExecutionContextDTO batchstepexecutioncontextDTO);

	/**
	 * 
	 * @param batchStepExecutionContext
	 * @return
	 */

	BatchStepExecutionContextDTO convertBatchStepExecutionContextToBatchStepExecutionContextDTO(
			BatchStepExecutionContext batchStepExecutionContext);

}
