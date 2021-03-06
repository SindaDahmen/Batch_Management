package com.nordnet.batchs.dtos;

public class BatchStepExecutionContextDTO {

	private Integer stepExecutionId;

	private String serializedContext;

	private String shortContext;

	private BatchStepExecutionDTO batchStepExecutionDTO;

	public BatchStepExecutionContextDTO() {

	}

	public Integer getStepExecutionId() {
		return stepExecutionId;
	}

	public void setStepExecutionId(Integer stepExecutionId) {
		this.stepExecutionId = stepExecutionId;
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

	public BatchStepExecutionDTO getBatchStepExecutionDTO() {
		return batchStepExecutionDTO;
	}

	public void setBatchStepExecutionDTO(BatchStepExecutionDTO batchStepExecutionDTO) {
		this.batchStepExecutionDTO = batchStepExecutionDTO;
	}

}
