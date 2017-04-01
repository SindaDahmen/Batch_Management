package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchJobExecutionParamsDTO;
import com.nordnet.batchs.entities.BatchJobExecutionParams;

public interface BatchJobExecutionParamsService {

	BatchJobExecutionParams convertBatchJobExecutionParamsDTOToBatchJobExecutionParams(
			BatchJobExecutionParamsDTO batchjobexecutionparamsDTO);

	BatchJobExecutionParamsDTO convertBatchJobExecutionParamsToBatchJobExecutionParamsDTO(
			BatchJobExecutionParams batchJobExecutionParams);

}
