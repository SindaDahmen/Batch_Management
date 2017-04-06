package com.nordnet.batchs.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchStepExecutionContextRepository;
import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
import com.nordnet.batchs.services.BatchStepExecutionContextService;

@Service("BatchStepExecutionContextService")
public class BatchStepExecutionContextServiceImpl extends
		FwkGenericServiceImpl<BatchStepExecutionContext, BatchStepExecutionContextDTO, BatchStepExecutionContextRepository>
		implements BatchStepExecutionContextService {

	/**
	 * 
	 * @param repository
	 */

	public BatchStepExecutionContextServiceImpl(BatchStepExecutionContextRepository repository) {
		super(repository);

	}

	/**
	 * 
	 */

	@Override
	public BatchStepExecutionContext convertToEntity(BatchStepExecutionContextDTO dto) {

		if (dto == null) {
			return null;
		}

		BatchStepExecutionContext result = new BatchStepExecutionContext();
		BeanUtils.copyProperties(dto, result);
		return result;

	}

	/**
	 * 
	 */

	@Override
	public BatchStepExecutionContextDTO convertToDTO(BatchStepExecutionContext entity) {
		if (entity == null) {
			return null;
		}

		BatchStepExecutionContextDTO result = new BatchStepExecutionContextDTO();
		BeanUtils.copyProperties(entity, result);
		return result;

	}

	// /**
	// *
	// * @param batchstepexecutioncontextDTO
	// * @return
	// */
	//
	// @Override
	// public BatchStepExecutionContext
	// convertBatchStepExecutionContextDTOToBatchStepExecutionContext(
	// BatchStepExecutionContextDTO batchstepexecutioncontextDTO) {
	// if (batchstepexecutioncontextDTO == null) {
	// return null;
	// }
	//
	// BatchStepExecutionContext result = new BatchStepExecutionContext();
	//
	// result.setSerializedContext(batchstepexecutioncontextDTO.getSerializedContext());
	//
	// result.setShortContext(batchstepexecutioncontextDTO.getShortContext());
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
	// public BatchStepExecutionContextDTO
	// convertBatchStepExecutionContextToBatchStepExecutionContextDTO(
	// BatchStepExecutionContext batchStepExecutionContext) {
	// if (batchStepExecutionContext == null) {
	// return null;
	// }
	//
	// BatchStepExecutionContextDTO result = new BatchStepExecutionContextDTO();
	// result.setSerializedContext(batchStepExecutionContext.getSerializedContext());
	// result.setShortContext(batchStepExecutionContext.getShortContext());
	//
	// return result;
	// }

}
