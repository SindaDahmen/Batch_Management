package com.nordnet.batchs.controllers;

//import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.services.BatchJobExecutionService;

@RestController
@RequestMapping(value = "HistoriqueJob")
public class BatchJobExecutionController {

	// @Autowired
	// private BatchRepository batchRepository;

	@Autowired
	private BatchJobExecutionService batchJobExecutionService;

	/**
	 * 
	 */

	@RequestMapping(method = RequestMethod.POST, value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public BatchJobExecutionDTO create(@RequestBody BatchJobExecutionDTO batchjobexecutiondto) {

		BatchJobExecutionDTO createdBatchjobexecution = batchJobExecutionService.createHistory(batchjobexecutiondto);
		return createdBatchjobexecution;

	}

	/**
	 * 
	 * @param id
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable Long id) {
		batchJobExecutionService.updateHistory(id);
	}
}
