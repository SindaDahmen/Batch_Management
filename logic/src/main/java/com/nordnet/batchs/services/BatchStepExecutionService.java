package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;

public interface BatchStepExecutionService {

	BatchStepExecution convertBatchStepExecutionDTOToBatchStepExecution(BatchStepExecutionDTO batchstepexecutionDTO);

	BatchStepExecutionDTO convertBatchStepExecutionToBatchStepExecutionDTO(BatchStepExecution batchstepexecution);

	BatchStepExecutionDTO createHistory(BatchStepExecutionDTO batchstepexecutiondto);
}
