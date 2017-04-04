package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;

public interface BatchService {

	List<BatchDTO> listBatchesByProject(int projectId);

	List<BatchDTO> listBatchs();

	BatchDTO listBatchesById(int batchId);

	/**
	 * 
	 * @param batchDTO
	 * @return
	 */
	BatchDTO createBatch(BatchDTO batchDTO);

	/**
	 * 
	 * -- * @param batchId
	 * 
	 * @return
	 */
	boolean deleteBatchById(int batchId);

	/**
	 * 
	 * @param batchDTO
	 * @return
	 */
	BatchDTO updateBatch(BatchDTO batchDTO);

	List<Batch> convertBatchsDTOToBatch(List<BatchDTO> batchsDTO);

	Batch convertBatchDTOToBatch(BatchDTO batchDTO);

	BatchDTO convertBatchToBatchDTO(Batch batch);

	List<BatchDTO> convertBatchsToBatchDTOS(List<Batch> batchs);
}
