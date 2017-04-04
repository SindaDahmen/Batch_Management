package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;

public interface BatchJobExecutionService {

	BatchJobExecutionDTO createHistory(BatchJobExecutionDTO batchjobexecutiondto);

	BatchJobExecution updateHistory(Long id);

}
