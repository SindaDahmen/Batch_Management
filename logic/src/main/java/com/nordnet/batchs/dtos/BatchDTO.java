package com.nordnet.batchs.dtos;

public class BatchDTO {

	private Integer id;

	private String description;

	private String httpVerb;

	private String name;

	private String parameters;

	private String url;

	private ProjectDTO projectDTO;

	public BatchDTO() {
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

	public String getHttpVerb() {
		return httpVerb;
	}

	public void setHttpVerb(String httpVerb) {
		this.httpVerb = httpVerb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ProjectDTO getProjectDTO() {
		return projectDTO;
	}

	public void setProjectDTO(ProjectDTO projectDTO) {
		this.projectDTO = projectDTO;
	}
}
