package com.flp.fms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actor 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private int actorId;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@ManyToMany(mappedBy="actors")
    private Set<Film> films = new HashSet<Film>();
	
	@Column(insertable = false, updatable = false,nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;
	
	public Actor()
	{
		
	}

	public Actor(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date date) {
		this.lastUpdate = date;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName 
				+ ", lastUpdate=" + lastUpdate + "]";
	}

	
}
