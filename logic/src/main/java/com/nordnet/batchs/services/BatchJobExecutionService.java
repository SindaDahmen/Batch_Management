package com.nordnet.batchs.services;

import com.nordnet.batchs.entities.BatchJobExecution;

public interface BatchJobExecutionService {

	String createHistory();

	BatchJobExecution updateHistory(long id);

}
