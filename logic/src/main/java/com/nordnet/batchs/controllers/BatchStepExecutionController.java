package com.nordnet.batchs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;
import com.nordnet.batchs.services.BatchStepExecutionService;

@RestController
@RequestMapping(value = "batchStepExecutions")
public class BatchStepExecutionController
		extends GenericRestController<BatchStepExecution, BatchStepExecutionDTO, BatchStepExecutionService> {

	@Autowired
	private BatchStepExecutionService batchStepExecutionService;

	public BatchStepExecutionController(BatchStepExecutionService service) {
		super(service);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable Integer id) {
		batchStepExecutionService.updateHistoryStep(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<BatchStepExecutionDTO> listAll(
			@RequestParam(value = "JobExecutionId", required = false) Integer JobExecutionId) {
		if (JobExecutionId == null) {
			return listAll();
		}
		return batchStepExecutionService.HistoriqueStepsByBatchExecution(JobExecutionId);
	}

}
