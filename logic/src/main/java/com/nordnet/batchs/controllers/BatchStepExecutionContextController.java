package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
import com.nordnet.batchs.services.BatchStepExecutionContextService;

@RestController
@RequestMapping(value = "batchStepExecutionContext")
public class BatchStepExecutionContextController extends
		GenericRestController<BatchStepExecutionContext, BatchStepExecutionContextDTO, BatchStepExecutionContextService> {

	/**
	 * 
	 * @param service
	 */
	public BatchStepExecutionContextController(BatchStepExecutionContextService service) {
		super(service);
	}

}
