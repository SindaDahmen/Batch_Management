package com.nordnet.batchs.services;

import java.util.List;

import com.nordnet.batchs.dtos.BatchDTO;

public interface BatchService {

	public List<BatchDTO> listBatchesByProject(int projectId);

}
