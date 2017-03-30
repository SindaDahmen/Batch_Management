package com.nordnet.batchs.dtos;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class BatchJobExecutionDTO {

	private Long jobExecutionId;

	private Timestamp createTime;

	private Date endTime;

	private String exitCode;

	private String exitMessage;

	private String jobConfigurationLocation;

	private Timestamp lastUpdated;

	private Date startTime;

	private String status;

	private BigInteger version;

	private BatchJobInstanceDTO batchJobInstanceDTO;

	private BatchDTO batchDTO;

	public BatchJobExecutionDTO() {

	}

	public Long getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
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

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
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

	public BigInteger getVersion() {
		return version;
	}

	public void setVersion(BigInteger version) {
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

}
