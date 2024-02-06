package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SigninRequest;
import com.app.entities.Patient;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

	@Autowired
	private PatientService patientServ;

	@GetMapping()
	public List<Patient> displayPatient() {
		return patientServ.displayAllPatient();
	}

	@PostMapping()
	public Patient addPatient(@RequestBody Patient patient) {

		System.out.println("patient controller");
		return patientServ.addPatientServ(patient);
	}

	@PostMapping("/signin")
	public Patient authenticateEmp(@RequestBody @Valid SigninRequest request) {
		System.out.println("in auth emp " + request);
		return patientServ.authenticateEmployee(request);

	}

}
