package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the listener database table.
 * 
 */
@Entity
@NamedQuery(name="Listener.findAll", query="SELECT l FROM Listener l")
public class Listener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Step
	@ManyToOne
	private Step step;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="ref")
	private Bean bean;

	public Listener() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Step getStep() {
		return this.step;
	}

	public void setStep(Step step) {
		this.step = step;
	}

	public Bean getBean() {
		return this.bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

}