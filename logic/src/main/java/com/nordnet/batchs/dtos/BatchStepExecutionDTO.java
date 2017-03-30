package com.nordnet.batchs.dtos;

import java.math.BigInteger;
import java.sql.Timestamp;

public class BatchStepExecutionDTO {

	private Long stepExecutionId;

	private BigInteger commitCount;

	private Timestamp endTime;

	private String exitCode;

	private String exitMessage;

	private BigInteger filterCount;

	private Timestamp lastUpdated;

	private BigInteger processSkipCount;

	private BigInteger readCount;

	private BigInteger readSkipCount;

	private BigInteger rollbackCount;

	private Timestamp startTime;

	private String status;

	private String stepName;

	private BigInteger version;

	private BigInteger writeCount;

	private BigInteger writeSkipCount;

	private BatchJobExecutionDTO batchJobExecutionDTO;

	private BatchStepExecutionContextDTO batchStepExecutionContextDTO;

	public BatchStepExecutionDTO() {

	}

	public Long getStepExecutionId() {
		return stepExecutionId;
	}

	public void setStepExecutionId(Long stepExecutionId) {
		this.stepExecutionId = stepExecutionId;
	}

	public BigInteger getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(BigInteger commitCount) {
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

	public BigInteger getFilterCount() {
		return filterCount;
	}

	public void setFilterCount(BigInteger filterCount) {
		this.filterCount = filterCount;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public BigInteger getProcessSkipCount() {
		return processSkipCount;
	}

	public void setProcessSkipCount(BigInteger processSkipCount) {
		this.processSkipCount = processSkipCount;
	}

	public BigInteger getReadCount() {
		return readCount;
	}

	public void setReadCount(BigInteger readCount) {
		this.readCount = readCount;
	}

	public BigInteger getReadSkipCount() {
		return readSkipCount;
	}

	public void setReadSkipCount(BigInteger readSkipCount) {
		this.readSkipCount = readSkipCount;
	}

	public BigInteger getRollbackCount() {
		return rollbackCount;
	}

	public void setRollbackCount(BigInteger rollbackCount) {
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

	public BigInteger getVersion() {
		return version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public BigInteger getWriteCount() {
		return writeCount;
	}

	public void setWriteCount(BigInteger writeCount) {
		this.writeCount = writeCount;
	}

	public BigInteger getWriteSkipCount() {
		return writeSkipCount;
	}

	public void setWriteSkipCount(BigInteger writeSkipCount) {
		this.writeSkipCount = writeSkipCount;
	}

	public BatchJobExecutionDTO getBatchJobExecutionDTO() {
		return batchJobExecutionDTO;
	}

	public void setBatchJobExecutionDTO(BatchJobExecutionDTO batchJobExecutionDTO) {
		this.batchJobExecutionDTO = batchJobExecutionDTO;
	}

	public BatchStepExecutionContextDTO getBatchStepExecutionContextDTO() {
		return batchStepExecutionContextDTO;
	}

	public void setBatchStepExecutionContextDTO(BatchStepExecutionContextDTO batchStepExecutionContextDTO) {
		this.batchStepExecutionContextDTO = batchStepExecutionContextDTO;
	}

}
