package com.nordnet.batchs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.services.BatchStepExecutionService;

@RestController
@RequestMapping(value = "HistoriqueStep")
public class BatchStepExecutionController {

	@Autowired
	private BatchStepExecutionService batchStepExecutionService;

	/**
	 * 
	 * @param batchstepexecutiondto
	 * @return
	 */

	@RequestMapping(method = RequestMethod.POST, value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public BatchStepExecutionDTO create(@RequestBody BatchStepExecutionDTO batchstepexecutiondto) {

		BatchStepExecutionDTO createdBatchstepexecution = batchStepExecutionService
				.createHistory(batchstepexecutiondto);
		return createdBatchstepexecution;

	}

}
