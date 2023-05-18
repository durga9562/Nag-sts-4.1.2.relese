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
@Entity
@Table(name="cource_details")
public class CourceEntity {
	@Id
	@Column(name="cource_id")
	@GenericGenerator(name="myGen", strategy = "increment")
	@GeneratedValue(generator="myGen",strategy = GenerationType.AUTO  )
	private Integer cource_id;
	@Column(name="cource_name")
	private String cource_name;
	@Column(name="duration")
	private String duration;
	@Column(name="courcefee")
	private int courcefee;

}
