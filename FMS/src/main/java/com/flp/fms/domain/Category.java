package com.flp.fms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Category
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private int categoryId;
	
	@Column(nullable=false)
	private String name;
	
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="category")
	private Set<Film> films=new HashSet<Film>();
	
	@Column(insertable = false, updatable = false,nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_update;
	
	public Category()
	{
		
	}

	public Category(String categoryName) {
		this.name=categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategory_id(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", last_update="
				+ last_update + "]";
	}

	
}
