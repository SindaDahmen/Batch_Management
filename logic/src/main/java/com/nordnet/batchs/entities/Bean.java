package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bean database table.
 * 
 */
@Entity
@NamedQuery(name="Bean.findAll", query="SELECT b FROM Bean b")
public class Bean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="class")
	private String class_;

	private String name;

	//bi-directional many-to-one association to BatchJobExecution
	@OneToMany(mappedBy="bean")
	private List<BatchJobExecution> batchJobExecutions;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	//bi-directional many-to-one association to Chunk
	@OneToMany(mappedBy="bean1")
	private List<Chunk> chunks1;

	//bi-directional many-to-one association to Chunk
	@OneToMany(mappedBy="bean2")
	private List<Chunk> chunks2;

	//bi-directional many-to-one association to Chunk
	@OneToMany(mappedBy="bean3")
	private List<Chunk> chunks3;

	//bi-directional many-to-one association to Job
	@OneToMany(mappedBy="bean")
	private List<Job> jobs;

	//bi-directional many-to-one association to Listener
	@OneToMany(mappedBy="bean")
	private List<Listener> listeners;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="bean1")
	private List<Property> properties1;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="bean2")
	private List<Property> properties2;

	//bi-directional many-to-one association to Schedular
	@OneToMany(mappedBy="bean")
	private List<Schedular> schedulars;

	//bi-directional many-to-one association to Tasklet
	@OneToMany(mappedBy="bean")
	private List<Tasklet> tasklets;

	public Bean() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BatchJobExecution> getBatchJobExecutions() {
		return this.batchJobExecutions;
	}

	public void setBatchJobExecutions(List<BatchJobExecution> batchJobExecutions) {
		this.batchJobExecutions = batchJobExecutions;
	}

	public BatchJobExecution addBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().add(batchJobExecution);
		batchJobExecution.setBean(this);

		return batchJobExecution;
	}

	public BatchJobExecution removeBatchJobExecution(BatchJobExecution batchJobExecution) {
		getBatchJobExecutions().remove(batchJobExecution);
		batchJobExecution.setBean(null);

		return batchJobExecution;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Chunk> getChunks1() {
		return this.chunks1;
	}

	public void setChunks1(List<Chunk> chunks1) {
		this.chunks1 = chunks1;
	}

	public Chunk addChunks1(Chunk chunks1) {
		getChunks1().add(chunks1);
		chunks1.setBean1(this);

		return chunks1;
	}

	public Chunk removeChunks1(Chunk chunks1) {
		getChunks1().remove(chunks1);
		chunks1.setBean1(null);

		return chunks1;
	}

	public List<Chunk> getChunks2() {
		return this.chunks2;
	}

	public void setChunks2(List<Chunk> chunks2) {
		this.chunks2 = chunks2;
	}

	public Chunk addChunks2(Chunk chunks2) {
		getChunks2().add(chunks2);
		chunks2.setBean2(this);

		return chunks2;
	}

	public Chunk removeChunks2(Chunk chunks2) {
		getChunks2().remove(chunks2);
		chunks2.setBean2(null);

		return chunks2;
	}

	public List<Chunk> getChunks3() {
		return this.chunks3;
	}

	public void setChunks3(List<Chunk> chunks3) {
		this.chunks3 = chunks3;
	}

	public Chunk addChunks3(Chunk chunks3) {
		getChunks3().add(chunks3);
		chunks3.setBean3(this);

		return chunks3;
	}

	public Chunk removeChunks3(Chunk chunks3) {
		getChunks3().remove(chunks3);
		chunks3.setBean3(null);

		return chunks3;
	}

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public Job addJob(Job job) {
		getJobs().add(job);
		job.setBean(this);

		return job;
	}

	public Job removeJob(Job job) {
		getJobs().remove(job);
		job.setBean(null);

		return job;
	}

	public List<Listener> getListeners() {
		return this.listeners;
	}

	public void setListeners(List<Listener> listeners) {
		this.listeners = listeners;
	}

	public Listener addListener(Listener listener) {
		getListeners().add(listener);
		listener.setBean(this);

		return listener;
	}

	public Listener removeListener(Listener listener) {
		getListeners().remove(listener);
		listener.setBean(null);

		return listener;
	}

	public List<Property> getProperties1() {
		return this.properties1;
	}

	public void setProperties1(List<Property> properties1) {
		this.properties1 = properties1;
	}

	public Property addProperties1(Property properties1) {
		getProperties1().add(properties1);
		properties1.setBean1(this);

		return properties1;
	}

	public Property removeProperties1(Property properties1) {
		getProperties1().remove(properties1);
		properties1.setBean1(null);

		return properties1;
	}

	public List<Property> getProperties2() {
		return this.properties2;
	}

	public void setProperties2(List<Property> properties2) {
		this.properties2 = properties2;
	}

	public Property addProperties2(Property properties2) {
		getProperties2().add(properties2);
		properties2.setBean2(this);

		return properties2;
	}

	public Property removeProperties2(Property properties2) {
		getProperties2().remove(properties2);
		properties2.setBean2(null);

		return properties2;
	}

	public List<Schedular> getSchedulars() {
		return this.schedulars;
	}

	public void setSchedulars(List<Schedular> schedulars) {
		this.schedulars = schedulars;
	}

	public Schedular addSchedular(Schedular schedular) {
		getSchedulars().add(schedular);
		schedular.setBean(this);

		return schedular;
	}

	public Schedular removeSchedular(Schedular schedular) {
		getSchedulars().remove(schedular);
		schedular.setBean(null);

		return schedular;
	}

	public List<Tasklet> getTasklets() {
		return this.tasklets;
	}

	public void setTasklets(List<Tasklet> tasklets) {
		this.tasklets = tasklets;
	}

	public Tasklet addTasklet(Tasklet tasklet) {
		getTasklets().add(tasklet);
		tasklet.setBean(this);

		return tasklet;
	}

	public Tasklet removeTasklet(Tasklet tasklet) {
		getTasklets().remove(tasklet);
		tasklet.setBean(null);

		return tasklet;
	}

}