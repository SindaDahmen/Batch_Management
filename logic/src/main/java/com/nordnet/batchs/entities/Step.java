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
 * The persistent class for the step database table.
 * 
 */
@Entity
@NamedQuery(name = "Step.findAll", query = "SELECT s FROM Step s")
public class Step implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	// bi-directional many-to-one association to Listener
	@OneToMany(mappedBy = "step")
	private List<Listener> listeners;

	// bi-directional many-to-one association to Job
	@ManyToOne
	private Job job;

	// bi-directional many-to-one association to Step
	@ManyToOne
	@JoinColumn(name = "next_on_success")
	private Step step1;

	// bi-directional many-to-one association to Step
	@OneToMany(mappedBy = "step1")
	private List<Step> steps1;

	// bi-directional many-to-one association to Step
	@ManyToOne
	@JoinColumn(name = "next_on_fail")
	private Step step2;

	// bi-directional many-to-one association to Step
	@OneToMany(mappedBy = "step2")
	private List<Step> steps2;

	// bi-directional many-to-one association to Tasklet
	@ManyToOne
	private Tasklet tasklet;

	public Step() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Listener> getListeners() {
		return this.listeners;
	}

	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}

	public Listener addListener(Listener listener) {
		getListeners().add(listener);
		listener.setStep(this);

		return listener;
	}

	public Listener removeListener(Listener listener) {
		getListeners().remove(listener);
		listener.setStep(null);

		return listener;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Step getStep1() {
		return this.step1;
	}

	public void setStep1(Step step1) {
		this.step1 = step1;
	}

	public List<Step> getSteps1() {
		return this.steps1;
	}

	public void setSteps1(List<Step> steps1) {
		this.steps1 = steps1;
	}

	public Step addSteps1(Step steps1) {
		getSteps1().add(steps1);
		steps1.setStep1(this);

		return steps1;
	}

	public Step removeSteps1(Step steps1) {
		getSteps1().remove(steps1);
		steps1.setStep1(null);

		return steps1;
	}

	public Step getStep2() {
		return this.step2;
	}

	public void setStep2(Step step2) {
		this.step2 = step2;
	}

	public List<Step> getSteps2() {
		return this.steps2;
	}

	public void setSteps2(List<Step> steps2) {
		this.steps2 = steps2;
	}

	public Step addSteps2(Step steps2) {
		getSteps2().add(steps2);
		steps2.setStep2(this);

		return steps2;
	}

	public Step removeSteps2(Step steps2) {
		getSteps2().remove(steps2);
		steps2.setStep2(null);

		return steps2;
	}

	public Tasklet getTasklet() {
		return this.tasklet;
	}

	public void setTasklet(Tasklet tasklet) {
		this.tasklet = tasklet;
	}

}