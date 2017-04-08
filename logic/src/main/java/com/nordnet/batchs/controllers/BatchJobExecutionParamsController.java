package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionParamsDTO;
import com.nordnet.batchs.entities.BatchJobExecutionParams;
import com.nordnet.batchs.services.BatchJobExecutionParamsService;

@RestController
@RequestMapping(value = "batchJobExecutionParams")
public class BatchJobExecutionParamsController extends
		GenericRestController<BatchJobExecutionParams, BatchJobExecutionParamsDTO, BatchJobExecutionParamsService> {

	/**
	 * 
	 * @param service
	 */

	public BatchJobExecutionParamsController(BatchJobExecutionParamsService service) {
		super(service);
	}

}