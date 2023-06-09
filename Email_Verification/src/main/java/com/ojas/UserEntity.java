package com.ojas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userid;
	private String emailId;
	private String firstName;
	private String lastrName;
	private boolean isEnabled;
	
	

}
