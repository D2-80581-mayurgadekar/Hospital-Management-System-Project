package com.app.entities;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="doctor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor extends BaseEntity{

	@Column(name="doctor_name",length = 200)
	private String dName;
	
	@Column(name="doctor_contact",length =100 )
	private String dContactNo;
	
	@Column(name="doctor_specialisation",length = 400)
	private String dSpecialisation;
	

	@ElementCollection
	@CollectionTable(name ="doctor_schedule",joinColumns = @JoinColumn())
	private List<DoctorSchedule> dSchedule = new ArrayList<DoctorSchedule>() ;
	
//	@OneToMany(mappedBy ="doctor",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
//	private List<Appointment> appointmentList = new ArrayList<Appointment>();
}
