package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PatientDao;
import com.app.entities.Patient;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;

	@Override
	public Patient addPatientServ(Patient patient) {
		
		return patientDao.save(patient);
	}

	@Override
	public List<Patient> displayAllPatient() {
		
		return patientDao.findAll();
	}
	
	

	
}
