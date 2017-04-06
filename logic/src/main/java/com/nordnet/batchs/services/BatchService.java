package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;

public interface BatchService extends FwkGenericService<Batch, BatchDTO> {

	/**
	 * 
	 * @param projectId
	 * @return
	 */
	List<BatchDTO> listBatchesByProject(Integer projectId);

}
