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
@Table(name = "product")
public class ProductEntity {
	@Id
	@Column(name = "pid")
	@GenericGenerator(name="Mygen",strategy="increment")
	@GeneratedValue(generator="Mygen",strategy=GenerationType.AUTO)
	private int pid;
	@Column(name = "pname")
	private String pname;
	@Column(name = "price")
	private int price;
	@Column(name = "quantity")
	private String quantity;
}
