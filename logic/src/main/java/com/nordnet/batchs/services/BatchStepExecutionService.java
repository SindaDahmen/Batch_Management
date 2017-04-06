package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;

public interface BatchStepExecutionService {

	/**
	 * 
	 * @param batchstepexecutionDTO
	 * @return
	 */

	BatchStepExecution convertBatchStepExecutionDTOToBatchStepExecution(BatchStepExecutionDTO batchstepexecutionDTO);

	/**
	 * 
	 * @param batchstepexecution
	 * @return
	 */

	BatchStepExecutionDTO convertBatchStepExecutionToBatchStepExecutionDTO(BatchStepExecution batchstepexecution);

	/**
	 * 
	 * @param batchstepexecutiondto
	 * @return
	 */

	BatchStepExecutionDTO createHistory(BatchStepExecutionDTO batchstepexecutiondto);

	/**
	 * 
	 * @param JobExecutionId
	 * @return
	 */

	List<BatchStepExecutionDTO> listStepsByBatch(Long JobExecutionId);

	/**
	 * 
	 * @param steps
	 * @return
	 */

	List<BatchStepExecutionDTO> convertBatchStepExecutionToBatchStepExecutionDTOS(List<BatchStepExecution> steps);

	/**
	 * 
	 * @param stepsDTO
	 * @return
	 */

	List<BatchStepExecution> convertBatchStepExecutionDTOSToBatchStepExecution(List<BatchStepExecutionDTO> stepsDTO);

}
