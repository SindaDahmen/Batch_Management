package com.nordnet.batchs.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the tasklet database table.
 * 
 */
@Entity
@NamedQuery(name = "Tasklet.findAll", query = "SELECT t FROM Tasklet t")
public class Tasklet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// bi-directional many-to-one association to Step
	@OneToMany(mappedBy = "tasklet")
	private List<Step> steps;

	// bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name = "ref")
	private Bean bean;

	// bi-directional many-to-one association to Chunk
	@ManyToOne
	private Chunk chunk;

	public Tasklet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setTasklet(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setTasklet(null);

		return step;
	}

	public Bean getBean() {
		return this.bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public Chunk getChunk() {
		return this.chunk;
	}

	public void setChunk(Chunk chunk) {
		this.chunk = chunk;
	}

}