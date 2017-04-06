package com.nordnet.batchs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.BatchJobExecutionService;

@RestController
@RequestMapping(value = "batchJobExecutions")
public class BatchJobExecutionController extends GenericRestController<BatchJobExecution, BatchJobExecutionDTO, BatchJobExecutionService> {


	public BatchJobExecutionController(BatchJobExecutionService service) {
		super(service);
	}

//	@Autowired
//	private BatchJobExecutionService batchJobExecutionService;
//
//	/**
//	 * 
//	 */
//
//	@RequestMapping(method = RequestMethod.POST, value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public BatchJobExecutionDTO create(@RequestBody BatchJobExecutionDTO batchjobexecutiondto) {
//
//		BatchJobExecutionDTO createdBatchjobexecution = batchJobExecutionService.createHistory(batchjobexecutiondto);
//		return createdBatchjobexecution;
//
//	}
//
//	/**
//	 * 
//	 * @param id
//	 */
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public void update(@PathVariable Long id) {
//		batchJobExecutionService.updateHistory(id);
//	}
}
