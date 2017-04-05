package com.nordnet.batchs.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionRepository;
import com.nordnet.batchs.dtos.BatchJobExecutionContextDTO;
import com.nordnet.batchs.dtos.BatchJobExecutionDTO;
import com.nordnet.batchs.dtos.BatchJobExecutionParamsDTO;
import com.nordnet.batchs.dtos.BatchJobInstanceDTO;
import com.nordnet.batchs.entities.BatchJobExecution;
import com.nordnet.batchs.entities.BatchJobExecutionContext;
import com.nordnet.batchs.entities.BatchJobExecutionParams;
import com.nordnet.batchs.entities.BatchJobInstance;
import com.nordnet.batchs.services.BatchJobExecutionContextService;
import com.nordnet.batchs.services.BatchJobExecutionParamsService;
import com.nordnet.batchs.services.BatchJobExecutionService;
import com.nordnet.batchs.services.BatchJobInstanceService;

@Service("BatchJobExecutionService")
public class BatchJobExecutionServiceImpl implements BatchJobExecutionService {

	@Autowired
	private BatchJobExecutionRepository batchJobExecutionRepository;

	@Autowired
	private BatchJobExecutionContextService batchJobExecutionContextService;

	@Autowired
	private BatchJobExecutionParamsService batchJobExecutionParamsService;

	@Autowired
	private BatchJobInstanceService batchJobInstanceService;

	/**
	 * 
	 */

	@Override
	public BatchJobExecutionDTO createHistory(BatchJobExecutionDTO batchjobexecutiondto) {
		BatchJobExecution batchJobExecution = convertBatchJobExecutionDTOToBatchJobExecution(batchjobexecutiondto);
		batchJobExecution.setStartTime(new Date());
		BatchJobExecution savedBatchJobExecution = batchJobExecutionRepository.save(batchJobExecution);
		return convertBatchJobExecutionToBatchJobExecutionDTO(savedBatchJobExecution);
	}

	/**
	 * 
	 */

	@Override
	public BatchJobExecution updateHistory(Long id) {

		BatchJobExecution batchJobExecution = batchJobExecutionRepository.findOne(id);
		batchJobExecution.setEndTime(new Date());
		return this.batchJobExecutionRepository.save(batchJobExecution);

	}

	/**
	 * 
	 * @param batchjobexecution
	 * @return
	 */

	public BatchJobExecutionDTO convertBatchJobExecutionToBatchJobExecutionDTO(BatchJobExecution batchjobexecution) {
		if (batchjobexecution == null) {
			return null;
		}
		BatchJobExecutionDTO result = new BatchJobExecutionDTO();
		result.setJobExecutionId(batchjobexecution.getJobExecutionId());
		result.setCreateTime(batchjobexecution.getCreateTime());
		result.setExitCode(batchjobexecution.getExitCode());
		result.setExitMessage(batchjobexecution.getExitMessage());
		result.setJobConfigurationLocation(batchjobexecution.getJobConfigurationLocation());
		result.setLastUpdated(batchjobexecution.getLastUpdated());
		result.setStatus(batchjobexecution.getStatus());
		result.setVersion(batchjobexecution.getVersion());
		if (batchjobexecution.getBatchJobExecutionContext() != null) {
			BatchJobExecutionContextDTO batchJobExecutionContextDTO = convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
					batchjobexecution.getBatchJobExecutionContext());
			batchJobExecutionContextDTO.setJobExecutionId(batchjobexecution.getJobExecutionId());
			result.setBatchJobExecutionContextDTO(batchJobExecutionContextDTO);
		}
		if (batchjobexecution.getBatchJobExecutionParams() != null) {

			BatchJobExecutionParams batchJobExecutionParams = batchjobexecution.getBatchJobExecutionParams();
			batchJobExecutionParams.setJobExecutionId(batchjobexecution.getJobExecutionId());
			BatchJobExecutionParamsDTO batchJobExecutionParamsDTO = convertBatchJobExecutionParamsToBatchJobExecutionParamsDTO(
					batchjobexecution.getBatchJobExecutionParams());
			batchJobExecutionParamsDTO.setJobExecutionId(batchjobexecution.getJobExecutionId());
			result.setBatchJobExecutionParamDTO(batchJobExecutionParamsDTO);
		}
		// if (batchjobexecution.getBatchJobInstance() != null) {
		// BatchJobInstanceDTO batchJobInstanceDTO =
		// convertBatchJobInstanceToBatchJobInstanceDTO(
		// batchjobexecution.getBatchJobInstance());
		// result.setBatchJobInstanceDTO(batchJobInstanceDTO);
		// }
		return result;
	}

	/**
	 * 
	 * @param batchsJobExecutionDTO
	 * @return
	 */

	public List<BatchJobExecution> convertBatchsJobExecutionDTOToBatchJobExecution(
			List<BatchJobExecutionDTO> batchsJobExecutionDTO) {
		List<BatchJobExecution> result = new ArrayList<BatchJobExecution>();
		for (BatchJobExecutionDTO batchjobexecutionDTO : batchsJobExecutionDTO) {
			BatchJobExecution batchjobexecution = convertBatchJobExecutionDTOToBatchJobExecution(batchjobexecutionDTO);
			if (batchjobexecution != null) {
				result.add(batchjobexecution);
			}
		}
		return result;

	}

	/**
	 * 
	 * @param batchJobExecutionParams
	 * @return
	 */

	private BatchJobExecutionParamsDTO convertBatchJobExecutionParamsToBatchJobExecutionParamsDTO(
			BatchJobExecutionParams batchJobExecutionParams) {
		if (batchJobExecutionParams == null) {
			return null;
		}
		return batchJobExecutionParamsService
				.convertBatchJobExecutionParamsToBatchJobExecutionParamsDTO(batchJobExecutionParams);
	}

	/**
	 * 
	 * @param batchJobInstance
	 * @return
	 */

	private BatchJobInstanceDTO convertBatchJobInstanceToBatchJobInstanceDTO(BatchJobInstance batchJobInstance) {
		if (batchJobInstance == null) {
			return null;
		}
		return batchJobInstanceService.convertBatchJobInstanceToBatchJobInstanceDTO(batchJobInstance);
	}

	/**
	 * 
	 * @param batchJobExecutionContext
	 * @return
	 */

	private BatchJobExecutionContextDTO convertBatchJobExecutionContextToBatchJobExecutionContextDTO(
			BatchJobExecutionContext batchJobExecutionContext) {
		if (batchJobExecutionContext == null) {
			return null;
		}
		return batchJobExecutionContextService
				.convertBatchJobExecutionContextToBatchJobExecutionContextDTO(batchJobExecutionContext);
	}

	/**
	 * 
	 * @param batchJobExecutionContextDTO
	 * @return
	 */
	private BatchJobExecutionContext convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
			BatchJobExecutionContextDTO batchJobExecutionContextDTO) {
		if (batchJobExecutionContextDTO == null) {
			return null;
		}
		return batchJobExecutionContextService
				.convertBatchJobExecutionContextDTOToBatchJobExecutionContext(batchJobExecutionContextDTO);

	}

	/**
	 * 
	 * @param batchJobExecutionParamsDTO
	 * @return
	 */

	private BatchJobExecutionParams convertBatchJobExecutionParamsDTOToBatchJobExecutionParams(
			BatchJobExecutionParamsDTO batchJobExecutionParamsDTO) {
		if (batchJobExecutionParamsDTO == null) {
			return null;
		}
		return batchJobExecutionParamsService
				.convertBatchJobExecutionParamsDTOToBatchJobExecutionParams(batchJobExecutionParamsDTO);
	}

	/**
	 * 
	 * @param batchJobInstanceDTO
	 * @return
	 */

	private BatchJobInstance convertBatchJobInstanceDTOToBatchJobInstance(BatchJobInstanceDTO batchJobInstanceDTO) {
		if (batchJobInstanceDTO == null) {
			return null;
		}
		return batchJobInstanceService.convertBatchJobInstanceDTOToBatchJobInstance(batchJobInstanceDTO);
	}

	/**
	 * 
	 * \|||||||} * @param batchjobexecutionDTO
	 * 
	 * @return
	 */

	public BatchJobExecution convertBatchJobExecutionDTOToBatchJobExecution(BatchJobExecutionDTO batchjobexecutionDTO) {
		if (batchjobexecutionDTO == null) {
			return null;
		}
		BatchJobExecution result = new BatchJobExecution();
		// result.setJobExecutionId(batchjobexecutionDTO.getJobExecutionId());
		result.setCreateTime(batchjobexecutionDTO.getCreateTime());
		result.setExitCode(batchjobexecutionDTO.getExitCode());
		result.setExitMessage(batchjobexecutionDTO.getExitMessage());
		result.setJobConfigurationLocation(batchjobexecutionDTO.getJobConfigurationLocation());
		result.setLastUpdated(batchjobexecutionDTO.getLastUpdated());
		result.setStatus(batchjobexecutionDTO.getStatus());
		result.setVersion(batchjobexecutionDTO.getVersion());

		if (batchjobexecutionDTO.getBatchJobExecutionContextDTO() != null) {

			BatchJobExecutionContextDTO batchJobExecutionContextDTO = batchjobexecutionDTO
					.getBatchJobExecutionContextDTO();
			BatchJobExecutionContext batchJobExecutionContext = convertBatchJobExecutionContextDTOToBatchJobExecutionContext(
					batchJobExecutionContextDTO);
			result.setBatchJobExecutionContext(batchJobExecutionContext);
			batchJobExecutionContext.setBatchJobExecution(result);
		}

		if (batchjobexecutionDTO.getBatchJobExecutionParamDTO() != null) {

			BatchJobExecutionParamsDTO batchJobExecutionParamsDTO = batchjobexecutionDTO.getBatchJobExecutionParamDTO();
			BatchJobExecutionParams batchJobExecutionParams = convertBatchJobExecutionParamsDTOToBatchJobExecutionParams(
					batchJobExecutionParamsDTO);
			result.setBatchJobExecutionParams(batchJobExecutionParams);
			batchJobExecutionParams.setBatchJobExecution(result);

		}

		// if (batchjobexecutionDTO.getBatchJobInstanceDTO() != null) {
		// BatchJobInstance batchJobInstance =
		// convertBatchJobInstanceDTOToBatchJobInstance(
		// batchjobexecutionDTO.getBatchJobInstanceDTO());
		// result.setBatchJobInstance(batchJobInstance);
		//
		//
		// }

		return result;
	}

}
