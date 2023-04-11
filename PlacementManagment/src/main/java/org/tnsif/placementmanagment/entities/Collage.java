package org.tnsif.placementmanagment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="College")
public class Collage {
	@Id
	private Integer id;
	private String collegename;
	private String location;
	// Default COntstructor 
	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized Constructor
	public Collage(Integer id, String collegename, String location) {
		super();
		this.id = id;
		this.collegename = collegename;
		this.location = location;
	}
	// To String
	@Override
	public String toString() {
		return "College [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
	}
	// Setters ANd Getters 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
