package com.nordnet.batchs.entities;

// Generated 24 mars 2017 10:30:00 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * BatchJobExecutionContext generated by hbm2java
 */
@Entity
@Table(name = "batch_job_execution_context")
public class BatchJobExecutionContext implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long jobExecutionId;
	private BatchJobExecution batchJobExecution;
	private String shortContext;
	private String serializedContext;

	public BatchJobExecutionContext() {
	}

	public BatchJobExecutionContext(BatchJobExecution batchJobExecution) {
		this.batchJobExecution = batchJobExecution;
	}

	public BatchJobExecutionContext(BatchJobExecution batchJobExecution, String shortContext,
			String serializedContext) {
		this.batchJobExecution = batchJobExecution;
		this.shortContext = shortContext;
		this.serializedContext = serializedContext;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "batchJobExecution"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "JOB_EXECUTION_ID", unique = true)
	public long getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	@Cascade(CascadeType.ALL)
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public BatchJobExecution getBatchJobExecution() {
		return this.batchJobExecution;
	}

	public void setBatchJobExecution(BatchJobExecution batchJobExecution) {
		this.batchJobExecution = batchJobExecution;
	}

	@Column(name = "SHORT_CONTEXT", length = 2500)
	public String getShortContext() {
		return this.shortContext;
	}

	public void setShortContext(String shortContext) {
		this.shortContext = shortContext;
	}

	@Column(name = "SERIALIZED_CONTEXT", length = 2500)
	public String getSerializedContext() {
		return this.serializedContext;
	}

	public void setSerializedContext(String serializedContext) {
		this.serializedContext = serializedContext;
	}

}
