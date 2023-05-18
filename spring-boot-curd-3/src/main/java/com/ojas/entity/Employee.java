package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {
	@Id
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.AUTO)
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	@Column(name="aadress")
	private String aadress;
	@Column(name="designation")
	private String designation;
	@Column(name="company")
	private String company;
	
	

}
