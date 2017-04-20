package com.nordnet.batchs.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BatchJobExecutionParamsDTO {

	private Integer jobExecutionId;

	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:dd")
	private Date dateVal;

	private double doubleVal;

	private Character identifying;

	private String keyName;

	private Long longVal;

	private String stringVal;

	private String typeCd;

	private BatchJobExecutionDTO batchJobExecutionDTO;

	public BatchJobExecutionParamsDTO() {

	}

	public Integer getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Integer jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public Date getDateVal() {
		return dateVal;
	}

	public void setDateVal(Date dateVal) {
		this.dateVal = dateVal;
	}

	public double getDoubleVal() {
		return doubleVal;
	}

	public void setDoubleVal(double doubleVal) {
		this.doubleVal = doubleVal;
	}

	public Character getIdentifying() {
		return identifying;
	}

	public void setIdentifying(Character identifying) {
		this.identifying = identifying;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Long getLongVal() {
		return longVal;
	}

	public void setLongVal(Long longVal) {
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
