package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;

public interface BatchJobExecutionContextService {

	/**
	 * 
	 * @param batchjobexecutioncontextDTO
	 * @return
	 */

	BatchJobExecutionContext convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
			BatchJobExecutionContextDTO batchjobexecutioncontextDTO);

	/**
	 * 
	 * @param batchJobExecutionContext
	 * @return
	 */

	BatchJobExecutionContextDTO convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
			BatchJobExecutionContext batchJobExecutionContext);
}
