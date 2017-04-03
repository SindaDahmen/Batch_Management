package com.nordnet.batchs.entities;

import static javax.persistence.GenerationType.IDENTITY;

// Generated 24 mars 2017 10:30:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
// import javax.persistence.Version;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "project")
public class Project {

	private Integer id;
	private String version;
	private String name;
	private String description;
	private String servicesUrl;
	private String swaggerUrl;
	private Set<Bean> beans = new HashSet<Bean>(0);
	private Set<Batch> batches = new HashSet<Batch>(0);

	public Project() {
	}

	public Project(String name) {
		this.name = name;
	}

	public Project(String name, String description, String servicesUrl, String swaggerUrl, Set<Bean> beans,
			Set<Batch> batches) {
		this.name = name;
		this.description = description;
		this.servicesUrl = servicesUrl;
		this.swaggerUrl = swaggerUrl;
		// this.beans = beans;
		this.batches = batches;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// @Version
	@Column(name = "version", length = 45)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "services_url")
	public String getServicesUrl() {
		return this.servicesUrl;
	}

	public void setServicesUrl(String servicesUrl) {
		this.servicesUrl = servicesUrl;
	}

	@Column(name = "swagger_url")
	public String getSwaggerUrl() {
		return this.swaggerUrl;
	}

	public void setSwaggerUrl(String swaggerUrl) {
		this.swaggerUrl = swaggerUrl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Bean> getBeans() {
		return this.beans;
	}

	public void setBeans(Set<Bean> beans) {
		this.beans = beans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Batch> getBatches() {
		return this.batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}

}