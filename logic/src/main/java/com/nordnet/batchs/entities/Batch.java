package com.nordnet.batchs.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the batch database table.
 * 
 */

@Entity
@NamedQuery(name = "Batch.findAll", query = "SELECT b FROM Batch b")
public class Batch implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String description;

	@Column(name = "http_verb")
	private String httpVerb;

	private String name;

	private String parameters;

	private String url;

	// bi-directional many-to-one association to Project
	@ManyToOne(fetch = FetchType.LAZY)
	private Project project;

	// bi-directional many-to-one association to BatchJobExecution
	@OneToMany(mappedBy = "batch")
	private List<BatchJobExecution> batchJobExecutions;

	public Batch() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHttpVerb() {
		return this.httpVerb;
	}

	public void setHttpVerb(String httpVerb) {
		this.httpVerb = httpVerb;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<BatchJobExecution> getBatchJobExecutions() {
		return this.batchJobExecutions;
	}

	public void setBatchJobExecutions(List<BatchJobExecution> batchJobExecutions) {
		this.batchJobExecutions = batchJobExecutions;
	}

	public BatchJobExecution addBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().add(batchJobExecution);
		batchJobExecution.setBatch(this);

		return batchJobExecution;
	}

	public BatchJobExecution removeBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().remove(batchJobExecution);
		batchJobExecution.setBatch(null);

		return batchJobExecution;
	}

}