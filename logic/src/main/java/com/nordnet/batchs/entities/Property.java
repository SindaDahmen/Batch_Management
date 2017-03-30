package com.nordnet.batchs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the property database table.
 * 
 */
@Entity
@NamedQuery(name="Property.findAll", query="SELECT p FROM Property p")
public class Property implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@Lob
	private String value;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="ref")
	private Bean bean1;

	//bi-directional many-to-one association to Bean
	@ManyToOne
	@JoinColumn(name="bean_id")
	private Bean bean2;

	public Property() {
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
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

}