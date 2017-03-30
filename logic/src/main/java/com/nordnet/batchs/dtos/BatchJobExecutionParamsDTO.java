package com.nordnet.batchs.dtos;

import java.math.BigInteger;
import java.sql.Timestamp;

public class BatchJobExecutionParamsDTO {

	private Long jobExecutionId;

	private Timestamp dateVal;

	private double doubleVal;

	private String identifying;

	private String keyName;

	private BigInteger longVal;

	private String stringVal;

	private String typeCd;

	private BatchJobExecutionDTO batchJobExecutionDTO;

	public BatchJobExecutionParamsDTO() {

	}

	public Long getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Timestamp getDateVal() {
		return dateVal;
	}

	public void setDateVal(Timestamp dateVal) {
		this.dateVal = dateVal;
	}

	public double getDoubleVal() {
		return doubleVal;
	}

	public void setDoubleVal(double doubleVal) {
		this.doubleVal = doubleVal;
	}

	public String getIdentifying() {
		return identifying;
	}

	public void setIdentifying(String identifying) {
		this.identifying = identifying;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public BigInteger getLongVal() {
		return longVal;
	}

	public void setLongVal(BigInteger longVal) {
		this.longVal = longVal;
	}

	public String getStringVal() {
		return stringVal;
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}

	public String getTypeCd() {
		return typeCd;
	}

	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	public BatchJobExecutionDTO getBatchJobExecutionDTO() {
		return batchJobExecutionDTO;
	}

	public void setBatchJobExecutionDTO(BatchJobExecutionDTO batchJobExecutionDTO) {
		this.batchJobExecutionDTO = batchJobExecutionDTO;
	}

}
