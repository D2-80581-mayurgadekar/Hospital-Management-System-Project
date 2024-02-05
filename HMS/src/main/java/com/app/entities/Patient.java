package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient extends BaseEntity {
	
	@Column(name="patient_name",length = 100)
	private String pName;
	
	@Column(name="patient_contact",length = 15)
	private String pContactNo;
	
	@Column(name="patient_age")
	private int pAge;
	
	@Column(name="patient_address",length = 400)
	private String pAddress;
	
	@Column(name="patient_bloodgroup",length = 10)
	private String pBloodGroup;	
	
	@OneToOne
	@JoinColumn(name="patient_id")
	private User user;
	
//	@OneToMany(mappedBy ="patient",cascade = CascadeType.ALL,orphanRemoval = true)
//	private List<Appointment> appointmentList = new ArrayList<Appointment>();
}
