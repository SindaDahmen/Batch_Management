package com.nordnet.batchs.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the batch_job_execution database table.
 * 
 */
@Entity
@Table(name = "batch_job_execution")
@NamedQuery(name = "BatchJobExecution.findAll", query = "SELECT b FROM BatchJobExecution b")
public class BatchJobExecution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_EXECUTION_ID")
	private Long jobExecutionId;

	@Column(name = "CREATE_TIME")
	private Timestamp createTime;

	@Column(name = "END_TIME")
	private Date endTime;

	@Column(name = "EXIT_CODE")
	private String exitCode;

	@Column(name = "EXIT_MESSAGE")
	private String exitMessage;

	@Column(name = "JOB_CONFIGURATION_LOCATION")
	private String jobConfigurationLocation;

	@Column(name = "LAST_UPDATED")
	private Timestamp lastUpdated;

	@Column(name = "START_TIME")
	private Date startTime;

	private String status;

	private BigInteger version;

	// bi-directional many-to-one association to BatchJobInstance
	@ManyToOne
	@JoinColumn(name = "JOB_INSTANCE_ID")
	private BatchJobInstance batchJobInstance;

	// bi-directional many-to-one association to Batch
	@ManyToOne
	private Batch batch;

	// bi-directional many-to-one association to Bean
	@ManyToOne
	private Bean bean;

	// bi-directional one-to-one association to BatchJobExecutionContext
	@OneToOne(mappedBy = "batchJobExecution")
	private BatchJobExecutionContext batchJobExecutionContext;

	// bi-directional one-to-one association to BatchJobExecutionParam
	@OneToOne(mappedBy = "batchJobExecution")
	private BatchJobExecutionParams batchJobExecutionParam;

	// bi-directional many-to-one association to BatchStepExecution
	@OneToMany(mappedBy = "batchJobExecution")
	private List<BatchStepExecution> batchStepExecutions;

	public BatchJobExecution() {
	}

	public Long getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExitCode() {
		return this.exitCode;
	}

	public void setExitCode(String exitCode) {
		this.exitCode = exitCode;
	}

	public String getExitMessage() {
		return this.exitMessage;
	}

	public void setExitMessage(String exitMessage) {
		this.exitMessage = exitMessage;
	}

	public String getJobConfigurationLocation() {
		return this.jobConfigurationLocation;
	}

	public void setJobConfigurationLocation(String jobConfigurationLocation) {
		this.jobConfigurationLocation = jobConfigurationLocation;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigInteger getVersion() {
		return this.version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public BatchJobInstance getBatchJobInstance() {
		return this.batchJobInstance;
	}

	public void setBatchJobInstance(BatchJobInstance batchJobInstance) {
		this.batchJobInstance = batchJobInstance;
	}

	public Batch getBatch() {
		return this.batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Bean getBean() {
		return this.bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public BatchJobExecutionContext getBatchJobExecutionContext() {
		return this.batchJobExecutionContext;
	}

	public void setBatchJobExecutionContext(BatchJobExecutionContext batchJobExecutionContext) {
		this.batchJobExecutionContext = batchJobExecutionContext;
	}

	public BatchJobExecutionParams getBatchJobExecutionParam() {
		return this.batchJobExecutionParam;
	}

	public void setBatchJobExecutionParam(BatchJobExecutionParams batchJobExecutionParam) {
		this.batchJobExecutionParam = batchJobExecutionParam;
	}

	public List<BatchStepExecution> getBatchStepExecutions() {
		return this.batchStepExecutions;
	}

	public void setBatchStepExecutions(List<BatchStepExecution> batchStepExecutions) {
		this.batchStepExecutions = batchStepExecutions;
	}

	public BatchStepExecution addBatchStepExecution(BatchStepExecution batchStepExecution) {
		getBatchStepExecutions().add(batchStepExecution);
		batchStepExecution.setBatchJobExecution(this);

		return batchStepExecution;
	}

	public BatchStepExecution removeBatchStepExecution(BatchStepExecution batchStepExecution) {
		getBatchStepExecutions().remove(batchStepExecution);
		batchStepExecution.setBatchJobExecution(null);

		return batchStepExecution;
	}

}