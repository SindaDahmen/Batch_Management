package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobInstanceDTO;
import com.nordnet.batchs.entities.BatchJobInstance;
import com.nordnet.batchs.services.BatchJobInstanceService;

@RestController
@RequestMapping(value = "batchJobInstances")
public class BatchJobInstanceController extends GenericRestController<BatchJobInstance, BatchJobInstanceDTO, BatchJobInstanceService> {

	/**
	 * 
	 * @param service
	 */
	public BatchJobInstanceController(BatchJobInstanceService service) {
		super(service);
	}
	
}