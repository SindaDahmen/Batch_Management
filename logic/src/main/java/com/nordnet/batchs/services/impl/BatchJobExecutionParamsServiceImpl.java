package com.nordnet.batchs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordnet.batchs.daos.BatchJobExecutionParamsRepository;
import com.nordnet.batchs.dtos.BatchJobExecutionParamsDTO;
import com.nordnet.batchs.entities.BatchJobExecutionParams;
import com.nordnet.batchs.services.BatchJobExecutionParamsService;

@Service("BatchJobExecutionParamsService")
public class BatchJobExecutionParamsServiceImpl implements BatchJobExecutionParamsService {

	@Autowired
	private BatchJobExecutionParamsRepository batchJobExecutionParamsRepository;

	/**
	 * 
	 */

	@Override
	public BatchJobExecutionParams convertBatchJobExecutionParamsDTOToBatchJobExecutionParams(
			BatchJobExecutionParamsDTO batchjobexecutionparamsDTO) {
		if (batchjobexecutionparamsDTO == null) {
			return null;
		}

		BatchJobExecutionParams result = new BatchJobExecutionParams();
		// result.setJobExecutionId(batchjobexecutionparamsDTO.getJobExecutionId());
		result.setDateVal(batchjobexecutionparamsDTO.getDateVal());
		result.setDoubleVal(batchjobexecutionparamsDTO.getDoubleVal());
		result.setIdentifying(batchjobexecutionparamsDTO.getIdentifying());
		result.setKeyName(batchjobexecutionparamsDTO.getKeyName());
		result.setLongVal(batchjobexecutionparamsDTO.getLongVal());
		result.setLongVal(batchjobexecutionparamsDTO.getLongVal());
		result.setStringVal(batchjobexecutionparamsDTO.getStringVal());
		result.setTypeCd(batchjobexecutionparamsDTO.getTypeCd());
		batchJobExecutionParamsRepository.save(result);
		return result;
	}

	/**
	 * 
	 */

	@Override
	public BatchJobExecutionParamsDTO convertBatchJobExecutionParamsToBatchJobExecutionParamsDTO(
			BatchJobExecutionParams batchJobExecutionParams) {
		if (batchJobExecutionParams == null) {
			return null;
		}

		BatchJobExecutionParamsDTO result = new BatchJobExecutionParamsDTO();
		result.setJobExecutionId(batchJobExecutionParams.getJobExecutionId());
		result.setDateVal(batchJobExecutionParams.getDateVal());
		result.setDoubleVal(batchJobExecutionParams.getDoubleVal());
		result.setIdentifying(batchJobExecutionParams.getIdentifying());
		result.setKeyName(batchJobExecutionParams.getKeyName());
		result.setLongVal(batchJobExecutionParams.getLongVal());
		result.setLongVal(batchJobExecutionParams.getLongVal());
		result.setStringVal(batchJobExecutionParams.getStringVal());
		result.setTypeCd(batchJobExecutionParams.getTypeCd());
		return result;
	}

}
