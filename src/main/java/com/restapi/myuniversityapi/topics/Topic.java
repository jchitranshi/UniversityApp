package com.restapi.myuniversityapi.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Topic {
	
	@Id 
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic()
	{
		
	}
	public Topic(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + "]";
	}
}
