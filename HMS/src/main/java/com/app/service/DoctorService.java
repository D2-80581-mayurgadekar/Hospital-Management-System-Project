package com.app.service;

import java.util.List;

import com.app.entities.Doctor;


public interface DoctorService {

	Doctor addDoctorServ(Doctor doctor);

	List<Doctor> getAllDocsServ();


	
}
