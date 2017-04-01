package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;

public interface BatchJobExecutionContextService {

	BatchJobExecutionContext convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
			BatchJobExecutionContextDTO batchjobexecutioncontextDTO);

	BatchJobExecutionContextDTO convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
			BatchJobExecutionContext batchJobExecutionContext);
}
