package com.nordnet.batchs.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

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
 * The persistent class for the batch_job_execution_params database table.
 * 
 */
@Entity
@Table(name = "batch_job_execution_params")
@NamedQuery(name = "BatchJobExecutionParams.findAll", query = "SELECT b FROM BatchJobExecutionParams b")
public class BatchJobExecutionParams implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long jobExecutionId;

	@Column(name = "DATE_VAL")
	private Timestamp dateVal;

	@Column(name = "DOUBLE_VAL")
	private double doubleVal;

	private String identifying;

	@Column(name = "KEY_NAME")
	private String keyName;

	@Column(name = "LONG_VAL")
	private BigInteger longVal;

	@Column(name = "STRING_VAL")
	private String stringVal;

	@Column(name = "TYPE_CD")
	private String typeCd;

	// bi-directional one-to-one association to BatchJobExecution
	@OneToOne
	@JoinColumn(name = "JOB_EXECUTION_ID")
	private BatchJobExecution batchJobExecution;

	public BatchJobExecutionParams() {
	}

	public Long getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Timestamp getDateVal() {
		return this.dateVal;
	}

	public void setDateVal(Timestamp dateVal) {
		this.dateVal = dateVal;
	}

	public double getDoubleVal() {
		return this.doubleVal;
	}

	public void setDoubleVal(double doubleVal) {
		this.doubleVal = doubleVal;
	}

	public String getIdentifying() {
		return this.identifying;
	}

	public void setIdentifying(String identifying) {
		this.identifying = identifying;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public BigInteger getLongVal() {
		return this.longVal;
	}

	public void setLongVal(BigInteger longVal) {
		this.longVal = longVal;
	}

	public String getStringVal() {
		return this.stringVal;
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}

	public String getTypeCd() {
		return this.typeCd;
	}

	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	public BatchJobExecution getBatchJobExecution() {
		return this.batchJobExecution;
	}

	public void setBatchJobExecution(BatchJobExecution batchJobExecution) {
		this.batchJobExecution = batchJobExecution;
	}

}