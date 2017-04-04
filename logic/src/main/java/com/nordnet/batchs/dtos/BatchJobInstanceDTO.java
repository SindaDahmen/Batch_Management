package com.nordnet.batchs.dtos;

public class BatchJobInstanceDTO {

	private Long jobInstanceId;

	private String jobKey;

	private String jobName;

	private Long version;

	BatchJobExecutionDTO batchJobExecutionsDTO;

	public BatchJobInstanceDTO() {

	}

	public Long getJobInstanceId() {
		return jobInstanceId;
	}

	public void setJobInstanceId(Long jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
	}

	public String getJobKey() {
		return jobKey;
	}

	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public BatchJobExecutionDTO getBatchJobExecutionsDTO() {
		return batchJobExecutionsDTO;
	}

	public void setBatchJobExecutionsDTO(BatchJobExecutionDTO batchJobExecutionsDTO) {
		this.batchJobExecutionsDTO = batchJobExecutionsDTO;
	}

}
