package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="StuentName")
	private String StuentName;
	@Column(name="cource")
    private String cource;
	@Column(name="marks")
    private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuentName() {
		return StuentName;
	}
	public void setStuentName(String stuentName) {
		StuentName = stuentName;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}