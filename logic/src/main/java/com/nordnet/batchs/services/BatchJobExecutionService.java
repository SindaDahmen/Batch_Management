package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;

public interface BatchJobExecutionService extends FwkGenericService<BatchJobExecution, BatchJobExecutionDTO> {

	/**
	 * 
	 * @param id
	 * @return
	 */

	BatchJobExecution updateHistory(Integer id);

	List<BatchJobExecutionDTO> listExecutionByBatch(Integer id);

}
