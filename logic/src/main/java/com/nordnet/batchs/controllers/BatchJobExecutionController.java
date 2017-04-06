package com.nordnet.batchs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.BatchJobExecutionService;

@RestController
@RequestMapping(value = "batchJobExecutions")
public class BatchJobExecutionController
		extends GenericRestController<BatchJobExecution, BatchJobExecutionDTO, BatchJobExecutionService> {

	@Autowired
	private BatchJobExecutionService batchJobExecutionService;

	/**
	 * 
	 * @param service
	 */

	public BatchJobExecutionController(BatchJobExecutionService service) {
		super(service);
	}

	/**
	 * 
	 * @param id
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable Integer id) {
		batchJobExecutionService.updateHistory(id);
	}
}
