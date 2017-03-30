package com.nordnet.batchs.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionRepository;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.services.BatchJobExecutionService;

@Service("BatchJobExecutionService")
public class BatchJobExecutionServiceImpl implements BatchJobExecutionService {

	@Autowired
	private BatchJobExecutionRepository batchJobExecutionRepository;

	@Override
	public String createHistory() {
		BatchJobExecution batchJobExecution = new BatchJobExecution();
		batchJobExecution.setStartTime(new Date());
		batchJobExecutionRepository.save(batchJobExecution);
		String batchJobExecutionId = String.valueOf(batchJobExecution.getJobExecutionId());
		return batchJobExecutionId;

	}

	@Override
	public BatchJobExecution updateHistory(long id) {

		BatchJobExecution batchJobExecution = batchJobExecutionRepository.findOne(id);
		batchJobExecution.setEndTime(new Date());
		// batchJobExecution.setStatus(status);
		return this.batchJobExecutionRepository.save(batchJobExecution);

	}

}
