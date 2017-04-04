package com.nordnet.batchs.dtos;

import java.util.Date;

public class BatchJobExecutionDTO {

	private Long jobExecutionId;

	private Date createTime;

	private Date endTime;

	private String exitCode;

	private String exitMessage;

	private String jobConfigurationLocation;

	private Date lastUpdated;

	private Date startTime;

	private String status;

	private Long version;

	private BatchJobInstanceDTO batchJobInstanceDTO;

	private BatchDTO batchDTO;

	private BatchJobExecutionContextDTO batchJobExecutionContextDTO;

	private BatchJobExecutionParamsDTO batchJobExecutionParamDTO;

	public BatchJobExecutionDTO() {

	}

	public Long getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExitCode() {
		return exitCode;
	}

	public void setExitCode(String exitCode) {
		this.exitCode = exitCode;
	}

	public String getExitMessage() {
		return exitMessage;
	}

	public void setExitMessage(String exitMessage) {
		this.exitMessage = exitMessage;
	}

	public String getJobConfigurationLocation() {
		return jobConfigurationLocation;
	}

	public void setJobConfigurationLocation(String jobConfigurationLocation) {
		this.jobConfigurationLocation = jobConfigurationLocation;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public BatchJobInstanceDTO getBatchJobInstanceDTO() {
		return batchJobInstanceDTO;
	}

	public void setBatchJobInstanceDTO(BatchJobInstanceDTO batchJobInstanceDTO) {
		this.batchJobInstanceDTO = batchJobInstanceDTO;
	}

	public BatchDTO getBatchDTO() {
		return batchDTO;
	}

	public void setBatchDTO(BatchDTO batchDTO) {
		this.batchDTO = batchDTO;
	}

	public BatchJobExecutionContextDTO getBatchJobExecutionContextDTO() {
		return batchJobExecutionContextDTO;
	}

	public void setBatchJobExecutionContextDTO(BatchJobExecutionContextDTO batchJobExecutionContextDTO) {
		this.batchJobExecutionContextDTO = batchJobExecutionContextDTO;
	}

	public BatchJobExecutionParamsDTO getBatchJobExecutionParamDTO() {
		return batchJobExecutionParamDTO;
	}

	public void setBatchJobExecutionParamDTO(BatchJobExecutionParamsDTO batchJobExecutionParamDTO) {
		this.batchJobExecutionParamDTO = batchJobExecutionParamDTO;
	}

}
