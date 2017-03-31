package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.entities.Batch;

public interface BatchService {

	public List<BatchDTO> listBatchesByProject(int projectId);

	public List<BatchDTO> listBatchs();

	public BatchDTO listBatchesById(int batchId);

	public Batch createBatch(BatchDTO batchdto, int id);

	public boolean deleteBatchById(int batchId);

	public Batch updateBatch(BatchDTO batchDTO, int batchId);

	public List<Batch> convertBatchsDTOToBatch(List<BatchDTO> batchsDTO);

	public Batch convertBatchDTOToBatch(BatchDTO batchDTO);

	public BatchDTO convertBatchToBatchDTO(Batch batch);

	public List<BatchDTO> convertBatchsToBatchDTOS(List<Batch> batchs);
}
