package com.app.service;

import java.util.List;

import com.app.entities.Patient;

public interface PatientService {

	Patient addPatientServ(Patient patient);

	List<Patient> displayAllPatient();

	
}
