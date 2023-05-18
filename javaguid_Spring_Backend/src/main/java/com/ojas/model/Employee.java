package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "employee1")
public class Employee {
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "Mygenerator", strategy = "increment")
	@GeneratedValue(generator = "Mygenerator", strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
}
