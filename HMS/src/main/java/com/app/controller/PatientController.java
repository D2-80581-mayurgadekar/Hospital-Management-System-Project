package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Patient;
import com.app.service.PatientService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/patient")
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

}
