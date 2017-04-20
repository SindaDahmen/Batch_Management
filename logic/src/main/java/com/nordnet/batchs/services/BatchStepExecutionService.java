package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;

public interface BatchStepExecutionService extends FwkGenericService<BatchStepExecution, BatchStepExecutionDTO> {

	/**
	 * 
	 * @param jobExecutionId
	 * @return
	 */
	List<BatchStepExecutionDTO> listStepsByBatchExecution(Integer jobExecutionId);

	/**
	 * 
	 * @param batchStepExecutionId
	 * @return
	 */
	BatchStepExecution updateEndTime(Integer id);

}