package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	private String name;

	@Column(name="services_url")
	private String servicesUrl;

	@Column(name="swagger_url")
	private String swaggerUrl;

	private String version;

	//bi-directional many-to-one association to Batch
	@OneToMany(mappedBy="project")
	private List<Batch> batches;

	//bi-directional many-to-one association to Bean
	@OneToMany(mappedBy="project")
	private List<Bean> beans;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServicesUrl() {
		return this.servicesUrl;
	}

	public void setServicesUrl(String servicesUrl) {
		this.servicesUrl = servicesUrl;
	}

	public String getSwaggerUrl() {
		return this.swaggerUrl;
	}

	public void setSwaggerUrl(String swaggerUrl) {
		this.swaggerUrl = swaggerUrl;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Batch> getBatches() {
		return this.batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	public Batch addBatch(Batch batch) {
		getBatches().add(batch);
		batch.setProject(this);

		return batch;
	}

	public Batch removeBatch(Batch batch) {
		getBatches().remove(batch);
		batch.setProject(null);

		return batch;
	}

	public List<Bean> getBeans() {
		return this.beans;
	}

	public void setBeans(List<Bean> beans) {
		this.beans = beans;
	}

	public Bean addBean(Bean bean) {
		getBeans().add(bean);
		bean.setProject(this);

		return bean;
	}

	public Bean removeBean(Bean bean) {
		getBeans().remove(bean);
		bean.setProject(null);

		return bean;
	}

}