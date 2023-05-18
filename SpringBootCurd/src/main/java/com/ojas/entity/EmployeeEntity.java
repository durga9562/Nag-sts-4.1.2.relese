package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Table(name = "employee")
@Entity
public class EmployeeEntity {
	@Id
	@GenericGenerator(name = "MyGen", strategy = "increment")
	@GeneratedValue(generator = "MyGen", strategy = GenerationType.AUTO)
	@Column(name = "eid")
	private int eid;
	@Column(name = "empname")
	private String empname;
	@Column(name = "esalary")
	private long esalary;
	@Column(name = "address")
	private String address;

}
