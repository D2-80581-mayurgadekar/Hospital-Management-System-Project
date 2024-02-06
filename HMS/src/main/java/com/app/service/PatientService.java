package com.app.service;

import java.util.List;

import javax.validation.Valid;

import com.app.dto.SigninRequest;
import com.app.entities.Patient;

public interface PatientService {

	Patient addPatientServ(Patient patient);

	List<Patient> displayAllPatient();

	Patient authenticateEmployee(@Valid SigninRequest request);

	
}
