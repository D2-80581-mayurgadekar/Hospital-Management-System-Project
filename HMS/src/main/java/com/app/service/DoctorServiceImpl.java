package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DoctorDao;
import com.app.dao.PatientDao;
import com.app.entities.Doctor;
import com.app.entities.DoctorSchedule;
import com.app.entities.Patient;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	public DoctorDao docDao;
	
	
	@Override
	public Doctor addDoctorServ(Doctor doctor) {
		List<DoctorSchedule> listd = doctor.getDSchedule();
		doctor.addDSchedule(listd);
		return docDao.save(doctor);
	}


	@Override
	public List<Doctor> getAllDocsServ() {
		
		return docDao.findAll();
	}

	

	
}
