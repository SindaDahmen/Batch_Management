package com.nordnet.batchs.services;

import com.nordnet.batchs.dtos.BatchJobInstanceDTO;
import com.nordnet.batchs.entities.BatchJobInstance;

public interface BatchJobInstanceService {

	BatchJobInstance convertBatchJobInstanceDTOToBatchJobInstance(BatchJobInstanceDTO batchJobInstanceDTO);

	BatchJobInstanceDTO convertBatchJobInstanceToBatchJobInstanceDTO(BatchJobInstance batchJobInstance);

}
