package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.BatchJobExecutionService;

@RestController
@RequestMapping(value = "batchJobExecution")
// @CrossOrigin(origins = "http://localhost:3000")
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
	 * @param id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public BatchJobExecutionDTO updateEndTime(@PathVariable("id") Integer id) {
		return batchJobExecutionService.updateEndTime(id);
	}

	@RequestMapping(value = "/batch/{batchId}", method = RequestMethod.GET)
	public List<BatchJobExecutionDTO> listAll(@PathVariable("batchId") Integer batchId) {
		if (batchId == null) {
			return listAll();
		}
		return batchJobExecutionService.listExecutionByBatch(batchId);
	}

	@RequestMapping(value = "/batch/{batchId}/last", method = RequestMethod.GET)
	public BatchJobExecutionDTO getLast(@PathVariable("batchId") Integer batchId) {
		return batchJobExecutionService.getLastJobExecution(batchId);
	}

}
