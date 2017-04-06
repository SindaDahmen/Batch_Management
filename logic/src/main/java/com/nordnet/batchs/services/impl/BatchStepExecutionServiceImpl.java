package com.nordnet.batchs.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchStepExecutionRepository;
import com.nordnet.batchs.dtos.BatchStepExecutionContextDTO;
import com.nordnet.batchs.dtos.BatchStepExecutionDTO;
import com.nordnet.batchs.entities.BatchStepExecution;
import com.nordnet.batchs.entities.BatchStepExecutionContext;
import com.nordnet.batchs.services.BatchStepExecutionContextService;
import com.nordnet.batchs.services.BatchStepExecutionService;

@Service("BatchStepExecutionService")
public class BatchStepExecutionServiceImpl implements BatchStepExecutionService {

	@Autowired
	private BatchStepExecutionContextService batchStepExecutionContextService;

	@Autowired
	private BatchStepExecutionRepository batchStepExecutionRepository;

	/**
	 * 
	 */

	@Override
	public BatchStepExecutionDTO createHistory(BatchStepExecutionDTO batchstepexecutiondto) {
		BatchStepExecution batchStepExecution = convertBatchStepExecutionDTOToBatchStepExecution(batchstepexecutiondto);
		batchStepExecution.setStartTime(new Date());
		BatchStepExecution savedBatchStepExecution = batchStepExecutionRepository.save(batchStepExecution);
		return convertBatchStepExecutionToBatchStepExecutionDTO(savedBatchStepExecution);
	}

	/**
	 * 
	 */

	@Override
	public List<BatchStepExecutionDTO> listStepsByBatch(Long JobExecutionId) {
		List<BatchStepExecution> steps = this.batchStepExecutionRepository.findByJobExecutionId(JobExecutionId);
		List<BatchStepExecutionDTO> result = convertBatchStepExecutionToBatchStepExecutionDTOS(steps);
		return result;
	}

	/**
	 * 
	 * @param steps
	 * @return
	 */

	public List<BatchStepExecutionDTO> convertBatchStepExecutionToBatchStepExecutionDTOS(
			List<BatchStepExecution> steps) {
		List<BatchStepExecutionDTO> result = new ArrayList<BatchStepExecutionDTO>();
		for (BatchStepExecution step : steps) {
			BatchStepExecutionDTO batchStepExecutionDTO = convertBatchStepExecutionToBatchStepExecutionDTO(step);
			if (batchStepExecutionDTO != null) {
				result.add(batchStepExecutionDTO);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param stepsDTO
	 * @return
	 */

	public List<BatchStepExecution> convertBatchStepExecutionDTOSToBatchStepExecution(
			List<BatchStepExecutionDTO> stepsDTO) {
		List<BatchStepExecution> result = new ArrayList<BatchStepExecution>();
		for (BatchStepExecutionDTO stepDTO : stepsDTO) {
			BatchStepExecution batchStepExecution = convertBatchStepExecutionDTOToBatchStepExecution(stepDTO);
			if (batchStepExecution != null) {
				result.add(batchStepExecution);
			}
		}
		return result;

	}

	/**
	 * 
	 */

	public BatchStepExecution convertBatchStepExecutionDTOToBatchStepExecution(
			BatchStepExecutionDTO batchstepexecutionDTO) {

		if (batchstepexecutionDTO == null) {
			return null;
		}

		BatchStepExecution result = new BatchStepExecution();
		// result.setStepExecutionId(batchstepexecutionDTO.getStepExecutionId());
		result.setVersion(batchstepexecutionDTO.getVersion());
		result.setStepName(batchstepexecutionDTO.getStepName());
		result.setStatus(batchstepexecutionDTO.getStatus());
		result.setCommitCount(batchstepexecutionDTO.getCommitCount());
		result.setReadCount(batchstepexecutionDTO.getReadCount());
		result.setStatus(batchstepexecutionDTO.getStatus());
		result.setVersion(batchstepexecutionDTO.getVersion());
		result.setReadCount(batchstepexecutionDTO.getReadCount());
		result.setFilterCount(batchstepexecutionDTO.getFilterCount());
		result.setWriteCount(batchstepexecutionDTO.getWriteCount());
		result.setReadSkipCount(batchstepexecutionDTO.getReadSkipCount());
		result.setWriteSkipCount(batchstepexecutionDTO.getWriteSkipCount());
		result.setProcessSkipCount(batchstepexecutionDTO.getProcessSkipCount());
		result.setRollbackCount(batchstepexecutionDTO.getRollbackCount());
		result.setExitCode(batchstepexecutionDTO.getExitCode());
		result.setExitMessage(batchstepexecutionDTO.getExitMessage());
		result.setLastUpdated(batchstepexecutionDTO.getLastUpdated());
		result.setExitMessage(batchstepexecutionDTO.getExitMessage());

		if (batchstepexecutionDTO.getBatchStepExecutionContextDTO() != null) {

			BatchStepExecutionContextDTO batchStepExecutionContextDTO = batchstepexecutionDTO
					.getBatchStepExecutionContextDTO();
			BatchStepExecutionContext batchStepExecutionContext = convertBatchStepExecutionContextDTOToBatchStepExecutionContext(
					batchStepExecutionContextDTO);
			result.setBatchStepExecutionContext(batchStepExecutionContext);
			batchStepExecutionContext.setBatchStepExecution(result);
		}

		return result;

	}

	/**
	 * 
	 * @param batchStepExecutionContext
	 * @return
	 */

	private BatchStepExecutionContextDTO convertBatchStepExecutionContextToBatchStepExecutionContextDTO(
			BatchStepExecutionContext batchStepExecutionContext) {
		if (batchStepExecutionContext == null) {
			return null;
		}
		return batchStepExecutionContextService
				.convertBatchStepExecutionContextToBatchStepExecutionContextDTO(batchStepExecutionContext);
	}

	/**
	 * 
	 * @param batchStepExecutionContextDTO
	 * @return
	 */

	private BatchStepExecutionContext convertBatchStepExecutionContextDTOToBatchStepExecutionContext(
			BatchStepExecutionContextDTO batchStepExecutionContextDTO) {
		if (batchStepExecutionContextDTO == null) {
			return null;
		}
		return batchStepExecutionContextService
				.convertBatchStepExecutionContextDTOToBatchStepExecutionContext(batchStepExecutionContextDTO);

	}

	/**
	 * 
	 */

	public BatchStepExecutionDTO convertBatchStepExecutionToBatchStepExecutionDTO(
			BatchStepExecution batchstepexecution) {

		if (batchstepexecution == null) {
			return null;
		}

		BatchStepExecutionDTO result = new BatchStepExecutionDTO();
		result.setStepExecutionId(batchstepexecution.getStepExecutionId());
		result.setVersion(batchstepexecution.getVersion());
		result.setStepName(batchstepexecution.getStepName());
		result.setStatus(batchstepexecution.getStatus());
		result.setCommitCount(batchstepexecution.getCommitCount());
		result.setReadCount(batchstepexecution.getReadCount());
		result.setStatus(batchstepexecution.getStatus());
		result.setVersion(batchstepexecution.getVersion());
		result.setReadCount(batchstepexecution.getReadCount());
		result.setFilterCount(batchstepexecution.getFilterCount());
		result.setWriteCount(batchstepexecution.getWriteCount());
		result.setReadSkipCount(batchstepexecution.getReadSkipCount());
		result.setWriteSkipCount(batchstepexecution.getWriteSkipCount());
		result.setProcessSkipCount(batchstepexecution.getProcessSkipCount());
		result.setRollbackCount(batchstepexecution.getRollbackCount());
		result.setExitCode(batchstepexecution.getExitCode());
		result.setExitMessage(batchstepexecution.getExitMessage());
		result.setLastUpdated(batchstepexecution.getLastUpdated());

		if (batchstepexecution.getBatchStepExecutionContext() != null) {
			BatchStepExecutionContext batchStepExecutionContext = batchstepexecution.getBatchStepExecutionContext();
			batchStepExecutionContext.setStepExecutionId(batchstepexecution.getStepExecutionId());
			BatchStepExecutionContextDTO batchStepExecutionContextDTO = convertBatchStepExecutionContextToBatchStepExecutionContextDTO(
					batchstepexecution.getBatchStepExecutionContext());
			batchStepExecutionContextDTO.setStepExecutionId(batchstepexecution.getStepExecutionId());
			result.setBatchStepExecutionContextDTO(batchStepExecutionContextDTO);
		}

		return result;

	}

}
