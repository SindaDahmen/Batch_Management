package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.BatchJobExecutionService;

@RestController
@RequestMapping(value = "batchJobExecution")
@CrossOrigin(origins = "http://localhost:3000")
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

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "Executions/{batchId}", method = RequestMethod.GET)
	public List<BatchJobExecutionDTO> listAll(@PathVariable Integer batchId) {
		if (batchId == null) {
			return listAll();
		}
		return batchJobExecutionService.listExecutionByBatch(batchId);
	}

	// @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "lastbatchJobExecutions/{batchId}", method = RequestMethod.GET)
	public BatchJobExecution getLast(@PathVariable Integer batchId) {

		return batchJobExecutionService.getLastJobExecution(batchId);
	}

}
