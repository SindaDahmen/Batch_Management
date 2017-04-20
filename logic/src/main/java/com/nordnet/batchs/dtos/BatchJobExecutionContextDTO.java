package com.nordnet.batchs.dtos;

public class BatchJobExecutionContextDTO {

	private Integer jobExecutionId;

	private String serializedContext;

	private String shortContext;

	private BatchJobExecutionDTO batchJobExecutionDTO;

	public BatchJobExecutionContextDTO() {
		
	}

	public Integer getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Integer jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public String getSerializedContext() {
		return serializedContext;
	}

	public void setSerializedContext(String serializedContext) {
		this.serializedContext = serializedContext;
	}

	public String getShortContext() {
		return shortContext;
	}

	public void setShortContext(String shortContext) {
		this.shortContext = shortContext;
	}

	public BatchJobExecutionDTO getBatchJobExecutionDTO() {
		return batchJobExecutionDTO;
	}

	public void setBatchJobExecutionDTO(BatchJobExecutionDTO batchJobExecutionDTO) {
		this.batchJobExecutionDTO = batchJobExecutionDTO;
	}

}
