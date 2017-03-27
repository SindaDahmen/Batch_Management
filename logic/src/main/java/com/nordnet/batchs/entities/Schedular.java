package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schedular database table.
 * 
 */
@Entity
@NamedQuery(name="Schedular.findAll", query="SELECT s FROM Schedular s")
public class Schedular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String cron;

	private String method;

	private String name;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	private Bean bean;

	public Schedular() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCron() {
		return this.cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
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

}