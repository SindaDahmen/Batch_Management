package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chunk database table.
 * 
 */
@Entity
@NamedQuery(name="Chunk.findAll", query="SELECT c FROM Chunk c")
public class Chunk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="commit_interval")
	private int commitInterval;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="processor")
	private Bean bean1;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="reader")
	private Bean bean2;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="writer")
	private Bean bean3;

	//bi-directional many-to-one association to Tasklet
	@OneToMany(mappedBy="chunk")
	private List<Tasklet> tasklets;

	public Chunk() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommitInterval() {
		return this.commitInterval;
	}

	public void setCommitInterval(int commitInterval) {
		this.commitInterval = commitInterval;
	}

	public Bean getBean1() {
		return this.bean1;
	}

	public void setBean1(Bean bean1) {
		this.bean1 = bean1;
	}

	public Bean getBean2() {
		return this.bean2;
	}

	public void setBean2(Bean bean2) {
		this.bean2 = bean2;
	}

	public Bean getBean3() {
		return this.bean3;
	}

	public void setBean3(Bean bean3) {
		this.bean3 = bean3;
	}

	public List<Tasklet> getTasklets() {
		return this.tasklets;
	}

	public void setTasklets(List<Tasklet> tasklets) {
		this.tasklets = tasklets;
	}

	public Tasklet addTasklet(Tasklet tasklet) {
		getTasklets().add(tasklet);
		tasklet.setChunk(this);

		return tasklet;
	}

	public Tasklet removeTasklet(Tasklet tasklet) {
		getTasklets().remove(tasklet);
		tasklet.setChunk(null);

		return tasklet;
	}

}