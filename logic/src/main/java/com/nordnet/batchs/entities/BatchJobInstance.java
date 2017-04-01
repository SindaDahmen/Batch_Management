package com.nordnet.batchs.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the batch_job_instance database table.
 * 
 */
@Entity
@Table(name = "batch_job_instance")
@NamedQuery(name = "BatchJobInstance.findAll", query = "SELECT b FROM BatchJobInstance b")
public class BatchJobInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JOB_INSTANCE_ID")
	private Long jobInstanceId;

	@Column(name = "JOB_KEY")
	private String jobKey;

	@Column(name = "JOB_NAME")
	private String jobName;

	private BigInteger version;

	// bi-directional many-to-one association to BatchJobExecution
	@OneToMany(mappedBy = "batchJobInstance")
	private List<BatchJobExecution> batchJobExecutions;

	public BatchJobInstance() {
	}

	public Long getJobInstanceId() {
		return this.jobInstanceId;
	}

	public void setJobInstanceId(Long jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
	}

	public String getJobKey() {
		return this.jobKey;
	}

	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public BigInteger getVersion() {
		return this.version;
	}

	public void setVersion(BigInteger version) {
		this.version = version;
	}

	public List<BatchJobExecution> getBatchJobExecutions() {
		return this.batchJobExecutions;
	}

	public void setBatchJobExecutions(List<BatchJobExecution> batchJobExecutions) {
		this.batchJobExecutions = batchJobExecutions;
	}

	public BatchJobExecution addBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().add(batchJobExecution);
		batchJobExecution.setBatchJobInstance(this);

		return batchJobExecution;
	}

	public BatchJobExecution removeBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().remove(batchJobExecution);
		batchJobExecution.setBatchJobInstance(null);

		return batchJobExecution;
	}

}