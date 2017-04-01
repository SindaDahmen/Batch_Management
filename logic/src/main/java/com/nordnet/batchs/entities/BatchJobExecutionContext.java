package com.nordnet.batchs.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the batch_job_execution_context database table.
 * 
 */
@Entity
@Table(name = "batch_job_execution_context")
@NamedQuery(name = "BatchJobExecutionContext.findAll", query = "SELECT b FROM BatchJobExecutionContext b")
public class BatchJobExecutionContext implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_EXECUTION_ID")
	private Long jobExecutionId;

	@Column(name = "SERIALIZED_CONTEXT")
	private String serializedContext;

	@Column(name = "SHORT_CONTEXT")
	private String shortContext;

	// bi-directional one-to-one association to BatchJobExecution
	@OneToOne
	@JoinColumn(name = "JOB_EXECUTION_ID")
	private BatchJobExecution batchJobExecution;

	public BatchJobExecutionContext() {
	}

	public Long getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public String getSerializedContext() {
		return this.serializedContext;
	}

	public void setSerializedContext(String serializedContext) {
		this.serializedContext = serializedContext;
	}

	public String getShortContext() {
		return this.shortContext;
	}

	public void setShortContext(String shortContext) {
		this.shortContext = shortContext;
	}

	public BatchJobExecution getBatchJobExecution() {
		return this.batchJobExecution;
	}

	public void setBatchJobExecution(BatchJobExecution batchJobExecution) {
		this.batchJobExecution = batchJobExecution;
	}

}