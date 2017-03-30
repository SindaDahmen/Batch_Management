package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the job database table.
 * 
 */
@Entity
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	private Bean bean;

	//bi-directional many-to-one association to Step
	@OneToMany(mappedBy="job")
	private List<Step> steps;

	public Job() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean getBean() {
		return this.bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public List<Step> getSteps() {
		return this.steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public Step addStep(Step step) {
		getSteps().add(step);
		step.setJob(this);

		return step;
	}

	public Step removeStep(Step step) {
		getSteps().remove(step);
		step.setJob(null);

		return step;
	}

}