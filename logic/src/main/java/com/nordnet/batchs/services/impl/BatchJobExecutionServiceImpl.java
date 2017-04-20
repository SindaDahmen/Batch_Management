package com.nordnet.batchs.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionRepository;
import com.nordnet.batchs.dtos.BatchDTO;
import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.entities.Batch;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.entities.BatchJobExecutionParams;
import com.nordnet.batchs.services.BatchJobExecutionContextService;
import com.nordnet.batchs.services.BatchJobExecutionParamsService;
import com.nordnet.batchs.services.BatchJobExecutionService;
import com.nordnet.batchs.services.BatchService;

@Service("BatchJobExecutionService")
public class BatchJobExecutionServiceImpl
		extends FwkGenericServiceImpl<BatchJobExecution, BatchJobExecutionDTO, BatchJobExecutionRepository>
		implements BatchJobExecutionService {

	@Autowired
	private BatchJobExecutionContextService batchJobExecutionContextService;

	@Autowired
	private BatchJobExecutionParamsService batchJobExecutionParamsService;

	@Autowired
	private BatchJobExecutionRepository batchJobExecutionRepository;

	@Autowired
	private BatchService batchService;

	/**
	 * 
	 * @param repository
	 */

	public BatchJobExecutionServiceImpl(BatchJobExecutionRepository repository) {
		super(repository);
	}

	/**
	 * 
	 */

	@Override
	public List<BatchJobExecutionDTO> listExecutionByBatch(Integer id) {
		List<BatchJobExecution> batchsjobexecution = this.batchJobExecutionRepository.findById(id);
		List<BatchJobExecutionDTO> result = convertToDTO(batchsjobexecution);
		return result;
	}

	@Override
	public BatchJobExecution convertToEntity(BatchJobExecutionDTO dto) {
		if (dto == null) {
			return null;
		}

		BatchJobExecution result = new BatchJobExecution();

		BeanUtils.copyProperties(dto, result);

		result.setStartTime(new Date());

		if (dto.getBatchDTO() != null) {

			Batch batch = batchService.convertToEntity(dto.getBatchDTO());

			result.setBatch(batch);
		}

		if (dto.getBatchJobExecutionContextDTO() != null) {
			BatchJobExecutionContext batchJobExecutionContext = batchJobExecutionContextService
					.convertToEntity(dto.getBatchJobExecutionContextDTO());
			result.setBatchJobExecutionContext(batchJobExecutionContext);
			batchJobExecutionContext.setBatchJobExecution(result);
		}

		if (dto.getBatchJobExecutionParamDTO() != null) {

			BatchJobExecutionParams batchJobExecutionParams = batchJobExecutionParamsService
					.convertToEntity(dto.getBatchJobExecutionParamDTO());
			result.setBatchJobExecutionParams(batchJobExecutionParams);
			batchJobExecutionParams.setBatchJobExecution(result);

		}

		return result;

	}

	/**
	 * 
	 */

	@Override
	public BatchJobExecutionDTO convertToDTO(BatchJobExecution entity) {
		if (entity == null) {
			return null;
		}

		BatchJobExecutionDTO result = new BatchJobExecutionDTO();
		BeanUtils.copyProperties(entity, result);

		if (entity.getBatch() != null) {
			BatchDTO batchDTO = batchService.convertToDTO(entity.getBatch());
			result.setBatchDTO(batchDTO);
		}

		if (entity.getBatchJobExecutionContext() != null) {
			BatchJobExecutionContextDTO batchJobExecutionContextDTO = batchJobExecutionContextService
					.convertToDTO(entity.getBatchJobExecutionContext());
			result.setBatchJobExecutionContextDTO(batchJobExecutionContextDTO);
		}

		return result;

	}

	@Override
	public BatchJobExecution updateHistory(Integer id) {
		BatchJobExecution batchJobExecution = batchJobExecutionRepository.findOne(id);
		batchJobExecution.setEndTime(new Date());
		BatchJobExecution result = batchJobExecutionRepository.save(batchJobExecution);
		return result;
	}

	@Override
	public BatchJobExecution getLastJobExecution(Integer batchId) {
		return batchJobExecutionRepository.getLastExecution(batchId);

	}

}
