package com.nordnet.batchs.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionContextRepository;
import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.services.BatchJobExecutionContextService;

@Service("BatchJobExecutionContextService")
public class BatchJobExecutionContextServiceImpl extends
		FwkGenericServiceImpl<BatchJobExecutionContext, BatchJobExecutionContextDTO, BatchJobExecutionContextRepository>
		implements BatchJobExecutionContextService {

	public BatchJobExecutionContextServiceImpl(BatchJobExecutionContextRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BatchJobExecutionContext convertToEntity(BatchJobExecutionContextDTO dto) {
		if (dto == null) {
			return null;
		}

		BatchJobExecutionContext result = new BatchJobExecutionContext();
		BeanUtils.copyProperties(dto, result);
		return result;

	}

	@Override
	public BatchJobExecutionContextDTO convertToDTO(BatchJobExecutionContext entity) {

		if (entity == null) {
			return null;
		}

		BatchJobExecutionContextDTO result = new BatchJobExecutionContextDTO();
		BeanUtils.copyProperties(entity, result);
		return result;
	}

	/**
	 * 
	 * @param batchjobexecutioncontextDTO
	 * @return
	 */

	// @Override
	// public BatchJobExecutionContext
	// convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
	// BatchJobExecutionContextDTO batchjobexecutioncontextDTO) {
	// if (batchjobexecutioncontextDTO == null) {
	// return null;
	// }
	//
	// BatchJobExecutionContext result = new BatchJobExecutionContext();
	//
	// result.setSerializedContext(batchjobexecutioncontextDTO.getSerializedContext());
	//
	// result.setShortContext(batchjobexecutioncontextDTO.getShortContext());
	//
	// return result;
	// }
	//
	// /**
	// *
	// * @param batchJobExecutionContext
	// * @return
	// */
	//
	// @Override
	// public BatchJobExecutionContextDTO
	// convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
	// BatchJobExecutionContext batchJobExecutionContext) {
	// if (batchJobExecutionContext == null) {
	// return null;
	// }
	//
	// BatchJobExecutionContextDTO result = new BatchJobExecutionContextDTO();
	// result.setSerializedContext(batchJobExecutionContext.getSerializedContext());
	// result.setShortContext(batchJobExecutionContext.getShortContext());
	//
	// return result;
	// }

}
