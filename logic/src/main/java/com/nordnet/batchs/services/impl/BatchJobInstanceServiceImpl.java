package com.nordnet.batchs.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobInstanceRepository;
import com.nordnet.batchs.dtos.BatchJobInstanceDTO;
import com.nordnet.batchs.entities.BatchJobInstance;
import com.nordnet.batchs.services.BatchJobInstanceService;

@Service("BatchJobInstanceService")
public class BatchJobInstanceServiceImpl extends FwkGenericServiceImpl<BatchJobInstance, BatchJobInstanceDTO, BatchJobInstanceRepository> 
	implements BatchJobInstanceService {

	/**
	 * 
	 * @param repository
	 */
	public BatchJobInstanceServiceImpl(BatchJobInstanceRepository repository) {
		super(repository);
	}

	@Override
	public BatchJobInstance convertToEntity(BatchJobInstanceDTO dto) {
		if (dto == null) {
			return null;
		}

		BatchJobInstance result = new BatchJobInstance();
		BeanUtils.copyProperties(dto, result);
		
		return result;
	}

	@Override
	public BatchJobInstanceDTO convertToDTO(BatchJobInstance entity) {
		if (entity == null) {
			return null;
		}

		BatchJobInstanceDTO result = new BatchJobInstanceDTO();
		BeanUtils.copyProperties(entity, result);
		
		return result;
	}
 


}
