package com.nordnet.batchs.dtos;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProjectDTO {

	private Integer id;

	private String description;

	private String name;

	private String servicesUrl;

	private String swaggerUrl;

	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:dd")
	private Date createTime;

	private String version;

	private List<BatchDTO> batchdto;

	public List<BatchDTO> getBatchdto() {
		return batchdto;
	}

	public void setBatchdto(List<BatchDTO> batchdto) {
		this.batchdto = batchdto;
	}

	public ProjectDTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServicesUrl() {
		return servicesUrl;
	}

	public void setServicesUrl(String servicesUrl) {
		this.servicesUrl = servicesUrl;
	}

	public String getSwaggerUrl() {
		return swaggerUrl;
	}

	public void setSwaggerUrl(String swaggerUrl) {
		this.swaggerUrl = swaggerUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
