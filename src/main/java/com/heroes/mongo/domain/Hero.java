package com.heroes.mongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Hero implements Serializable{

	private static final long serialVersionUID = -5666249927370184317L;
	
	private String id;
	private String name;
	private Integer power;
	
	public Hero() {	
	}

	public Hero(String id, String name, Integer power) {
		super();
		this.id = id;
		this.name = name;
		this.power = power;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
