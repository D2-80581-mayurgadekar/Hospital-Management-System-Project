package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

	@Column(length = 100)
	private String email;
	
	@Column(length = 50)
	private String password;
	
	@Column()
	@Enumerated(EnumType.STRING)
	private UserRole role;	
	
	@Column()
	private boolean status;
	
}
