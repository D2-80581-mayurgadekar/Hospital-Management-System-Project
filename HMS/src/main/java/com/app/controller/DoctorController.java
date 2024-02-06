package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Doctor;
import com.app.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorController {
	
	@Autowired
	private DoctorService docService;
	
	@PostMapping
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return docService.addDoctorServ(doctor);
	}
	
	@GetMapping
	public List<Doctor> getAllDoctor(){
		
		return docService.getAllDocsServ();
	}
}
