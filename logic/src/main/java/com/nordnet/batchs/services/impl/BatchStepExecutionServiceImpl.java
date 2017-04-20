package com.nordnet.batchs.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchStepExecutionRepository;
import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.entities.BatchStepExecution;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
import com.nordnet.batchs.services.BatchJobExecutionService;
import com.nordnet.batchs.services.BatchStepExecutionContextService;
import com.nordnet.batchs.services.BatchStepExecutionService;

@Service("BatchStepExecutionService")
public class BatchStepExecutionServiceImpl
		extends FwkGenericServiceImpl<BatchStepExecution, BatchStepExecutionDTO, BatchStepExecutionRepository>
		implements BatchStepExecutionService {

	@Autowired
	private BatchStepExecutionContextService batchStepExecutionContextService;

	@Autowired
	private BatchStepExecutionRepository batchStepExecutionRepository;

	@Autowired
	private BatchJobExecutionService batchJobExecutionService;

	/**
	 * 
	 * @param repository
	 */

	public BatchStepExecutionServiceImpl(BatchStepExecutionRepository repository) {
		super(repository);

	}

	/**
	 * 
	 */
	@Override
	public BatchStepExecution convertToEntity(BatchStepExecutionDTO dto) {
		if (dto == null) {
			return null;
		}

		BatchStepExecution result = new BatchStepExecution();

		BeanUtils.copyProperties(dto, result);
		result.setStartTime(new Date());

		if (dto.getBatchJobExecutionDTO() != null) {
			BatchJobExecution batchJobExecution = batchJobExecutionService
					.convertToEntity(dto.getBatchJobExecutionDTO());
			result.setBatchJobExecution(batchJobExecution);
		}
		if (dto.getBatchStepExecutionContextDTO() != null) {
			BatchStepExecutionContext batchStepExecutionContext = batchStepExecutionContextService
					.convertToEntity(dto.getBatchStepExecutionContextDTO());
			result.setBatchStepExecutionContext(batchStepExecutionContext);
			batchStepExecutionContext.setBatchStepExecution(result);
		}

		return result;
	}

	/**
	 * 
	 */

	@Override
	public BatchStepExecutionDTO convertToDTO(BatchStepExecution entity) {
		if (entity == null) {
			return null;
		}

		BatchStepExecutionDTO result = new BatchStepExecutionDTO();
		BeanUtils.copyProperties(entity, result);

		if (entity.getBatchJobExecution() != null) {
			BatchJobExecutionDTO batchJobExecutionDTO = batchJobExecutionService
					.convertToDTO(entity.getBatchJobExecution());
			result.setBatchJobExecutionDTO(batchJobExecutionDTO);
		}

		if (entity.getBatchStepExecutionContext() != null) {
			BatchStepExecutionContextDTO batchStepExecutionContextDTO = batchStepExecutionContextService
					.convertToDTO(entity.getBatchStepExecutionContext());
			result.setBatchStepExecutionContextDTO(batchStepExecutionContextDTO);
		}

		return result;

	}

	@Override
	public List<BatchStepExecutionDTO> listStepsByBatchExecution(Integer jobExecutionId) {
		List<BatchStepExecution> steps = this.batchStepExecutionRepository.findByJobExecutionId(jobExecutionId);
		List<BatchStepExecutionDTO> result = convertToDTO(steps);
		return result;
	}

	@Override
	public BatchStepExecution updateEndTime(Integer batchStepExecutionId) {
		BatchStepExecution batchStepExecution = batchStepExecutionRepository.findOne(batchStepExecutionId);
		batchStepExecution.setEndTime(new Date());
		BatchStepExecution result = batchStepExecutionRepository.save(batchStepExecution);
		return result;

	}

}
