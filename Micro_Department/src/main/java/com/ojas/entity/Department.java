package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departmentId")
	private Long departmentId;
	
	@Column(name = "departmentName")
	private String departmentName;
	
	@Column(name = "departmentAddress")
	private String departmentAddress;
	
	@Column(name = "departmentCode")
	private String departmentCode;
}
