package com.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="appointment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment extends BaseEntity {

	@Column(name="name",length = 200)
	private String name;
	
	@Column()
	private int age;
	
	@Column(length = 20,name = "contact_no")
	private String contactNo;
	
	@Column(name="relation",length = 100)
	private String relation;
	
	@Column(name="payment_amt")
	private double paymentAmount;
	
	@Column(name="payment_status")
	private boolean paymentStatus;
	
	@ManyToOne
	@JoinColumn(name="patient_id",nullable = false)
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="doctor_id",nullable = false)
	private Doctor doctor;

}
