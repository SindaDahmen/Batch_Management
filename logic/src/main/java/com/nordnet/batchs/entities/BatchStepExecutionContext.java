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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * BatchStepExecutionContext generated by hbm2java
 */
@Entity
@Table(name = "batch_step_execution_context")
public class BatchStepExecutionContext implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stepExecutionId;
	private BatchStepExecution batchStepExecution;
	private String shortContext;
	private String serializedContext;

	public BatchStepExecutionContext() {
	}

	public BatchStepExecutionContext(BatchStepExecution batchStepExecution) {
		this.batchStepExecution = batchStepExecution;
	}

	public BatchStepExecutionContext(BatchStepExecution batchStepExecution, String shortContext,
			String serializedContext) {
		this.batchStepExecution = batchStepExecution;
		this.shortContext = shortContext;
		this.serializedContext = serializedContext;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "batchStepExecution"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "STEP_EXECUTION_ID", unique = true)
	public Integer getStepExecutionId() {
		return this.stepExecutionId;
	}

	public void setStepExecutionId(Integer stepExecutionId) {
		this.stepExecutionId = stepExecutionId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public BatchStepExecution getBatchStepExecution() {
		return this.batchStepExecution;
	}

	public void setBatchStepExecution(BatchStepExecution batchStepExecution) {
		this.batchStepExecution = batchStepExecution;
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
