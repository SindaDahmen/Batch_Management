package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.services.BatchJobExecutionContextService;

@RestController
@RequestMapping(value = "batchJobExecutionContext")
public class BatchJobExecutionContextController extends
		GenericRestController<BatchJobExecutionContext, BatchJobExecutionContextDTO, BatchJobExecutionContextService> {

	/**
	 * 
	 * @param service
	 */

	public BatchJobExecutionContextController(BatchJobExecutionContextService service) {
		super(service);
	}

}