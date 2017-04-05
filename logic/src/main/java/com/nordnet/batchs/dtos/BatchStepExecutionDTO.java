package com.nordnet.batchs.dtos;

import java.sql.Timestamp;
import java.util.Date;

public class BatchStepExecutionDTO {

	private Long stepExecutionId;

	private Long commitCount;

	private Timestamp endTime;

	private String exitCode;

	private String exitMessage;

	private Long filterCount;

	private Date lastUpdated;

	private Long processSkipCount;

	private Long readCount;

	private Long readSkipCount;

	private Long rollbackCount;

	private Timestamp startTime;

	private String status;

	private String stepName;

	private Long version;

	private Long writeCount;

	private Long writeSkipCount;

	// private BatchJobExecutionDTO batchJobExecutionDTO;

	private BatchStepExecutionContextDTO batchStepExecutionContextDTO;

	public BatchStepExecutionDTO() {

	}

	public Long getStepExecutionId() {
		return stepExecutionId;
	}

	public void setStepExecutionId(Long stepExecutionId) {
		this.stepExecutionId = stepExecutionId;
	}

	public Long getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(Long commitCount) {
		this.commitCount = commitCount;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
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

	public Long getFilterCount() {
		return filterCount;
	}

	public void setFilterCount(Long filterCount) {
		this.filterCount = filterCount;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Long getProcessSkipCount() {
		return processSkipCount;
	}

	public void setProcessSkipCount(Long processSkipCount) {
		this.processSkipCount = processSkipCount;
	}

	public Long getReadCount() {
		return readCount;
	}

	public void setReadCount(Long readCount) {
		this.readCount = readCount;
	}

	public Long getReadSkipCount() {
		return readSkipCount;
	}

	public void setReadSkipCount(Long readSkipCount) {
		this.readSkipCount = readSkipCount;
	}

	public Long getRollbackCount() {
		return rollbackCount;
	}

	public void setRollbackCount(Long rollbackCount) {
		this.rollbackCount = rollbackCount;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getWriteCount() {
		return writeCount;
	}

	public void setWriteCount(Long writeCount) {
		this.writeCount = writeCount;
	}

	public Long getWriteSkipCount() {
		return writeSkipCount;
	}

	public void setWriteSkipCount(Long writeSkipCount) {
		this.writeSkipCount = writeSkipCount;
	}

	// public BatchJobExecutionDTO getBatchJobExecutionDTO() {
	// return batchJobExecutionDTO;
	// }
	//
	// public void setBatchJobExecutionDTO(BatchJobExecutionDTO
	// batchJobExecutionDTO) {
	// this.batchJobExecutionDTO = batchJobExecutionDTO;
	// }

	public BatchStepExecutionContextDTO getBatchStepExecutionContextDTO() {
		return batchStepExecutionContextDTO;
	}

	public void setBatchStepExecutionContextDTO(BatchStepExecutionContextDTO batchStepExecutionContextDTO) {
		this.batchStepExecutionContextDTO = batchStepExecutionContextDTO;
	}

}
