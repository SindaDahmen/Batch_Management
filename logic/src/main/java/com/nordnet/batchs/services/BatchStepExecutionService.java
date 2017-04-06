package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;

public interface BatchStepExecutionService extends FwkGenericService<BatchStepExecution, BatchStepExecutionDTO> {

	/**
	 * 
	 * @param JobExecutionId
	 * @return
	 */

	List<BatchStepExecutionDTO> HistoriqueStepsByBatch(Integer jobExecutionId);

	/**
	 * 
	 * @param id
	 * @return
	 */

	BatchStepExecution updateHistoryStep(Integer id);

}