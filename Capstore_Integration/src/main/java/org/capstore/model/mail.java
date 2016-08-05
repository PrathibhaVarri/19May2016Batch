package org.capstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class mail {
	@Id
	private String name;

	
	public mail()
	{}
	
	public mail(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "mail [name=" + name + "]";
	}
	
	
}
