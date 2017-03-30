package com.nordnet.batchs.dtos;

public class BatchDTO {

	private int id;

	private String description;

	private String httpVerb;

	private String name;

	private String parameters;

	private String url;

	private ProjectDTO project;

	public BatchDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public ProjectDTO getProject() {
		return project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}
}
