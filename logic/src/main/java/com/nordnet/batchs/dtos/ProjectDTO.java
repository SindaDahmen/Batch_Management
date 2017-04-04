package com.nordnet.batchs.dtos;

public class ProjectDTO {

	private Integer id;

	private String description;

	private String name;

	private String servicesUrl;

	private String swaggerUrl;

	private String version;

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

}
