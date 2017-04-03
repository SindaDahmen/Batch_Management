package com.nordnet.batchs.entities;

// Generated 24 mars 2017 10:30:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Step generated by hbm2java
 */
@Entity
@Table(name = "step")
public class Step implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Step stepByNextOnFail;
	private Job job;
	private Tasklet tasklet;
	private Step stepByNextOnSuccess;
	private String name;
	private Set<Step> stepsForNextOnSuccess = new HashSet<Step>(0);
	private Set<Listener> listeners = new HashSet<Listener>(0);
	private Set<Step> stepsForNextOnFail = new HashSet<Step>(0);

	public Step() {
	}

	public Step(int id, Job job, Tasklet tasklet) {
		this.id = id;
		this.job = job;
		this.tasklet = tasklet;
	}

	public Step(int id, Step stepByNextOnFail, Job job, Tasklet tasklet, Step stepByNextOnSuccess, String name,
			Set<Step> stepsForNextOnSuccess, Set<Listener> listeners, Set<Step> stepsForNextOnFail) {
		this.id = id;
		this.stepByNextOnFail = stepByNextOnFail;
		this.job = job;
		this.tasklet = tasklet;
		this.stepByNextOnSuccess = stepByNextOnSuccess;
		this.name = name;
		this.stepsForNextOnSuccess = stepsForNextOnSuccess;
		this.listeners = listeners;
		this.stepsForNextOnFail = stepsForNextOnFail;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "next_on_fail")
	public Step getStepByNextOnFail() {
		return this.stepByNextOnFail;
	}

	public void setStepByNextOnFail(Step stepByNextOnFail) {
		this.stepByNextOnFail = stepByNextOnFail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id", nullable = false)
	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tasklet_id", nullable = false)
	public Tasklet getTasklet() {
		return this.tasklet;
	}

	public void setTasklet(Tasklet tasklet) {
		this.tasklet = tasklet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "next_on_success")
	public Step getStepByNextOnSuccess() {
		return this.stepByNextOnSuccess;
	}

	public void setStepByNextOnSuccess(Step stepByNextOnSuccess) {
		this.stepByNextOnSuccess = stepByNextOnSuccess;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stepByNextOnSuccess")
	public Set<Step> getStepsForNextOnSuccess() {
		return this.stepsForNextOnSuccess;
	}

	public void setStepsForNextOnSuccess(Set<Step> stepsForNextOnSuccess) {
		this.stepsForNextOnSuccess = stepsForNextOnSuccess;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "step")
	public Set<Listener> getListeners() {
		return this.listeners;
	}

	public void setListeners(Set<Listener> listeners) {
		this.listeners = listeners;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stepByNextOnFail")
	public Set<Step> getStepsForNextOnFail() {
		return this.stepsForNextOnFail;
	}

	public void setStepsForNextOnFail(Set<Step> stepsForNextOnFail) {
		this.stepsForNextOnFail = stepsForNextOnFail;
	}

}
