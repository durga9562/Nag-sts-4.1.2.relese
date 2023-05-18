package com.ojas.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userregistration")
public class User {
	@Id
	@Column(name = "userid")
	private int userid;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "confirmpassword")
	private String confirmpassword;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private long mobile;
	@Column(name = "dateofbirth")
	private String dateofbirth;
	@Column(name = "gender")
	private String gender;
	@Column(name = "aadharid")
	private long aadharid;
	@Column(name = "address")
	private String address;
}
