package com.TransactionDemo.demo.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransactionDemo.demo.dao.AppointmentDao;
import com.TransactionDemo.demo.dao.PatientDao;
import com.TransactionDemo.demo.dto.AppointmentDto;
import com.TransactionDemo.demo.dto.PatientDto;
import com.TransactionDemo.demo.model.Appointment;
import com.TransactionDemo.demo.model.Patient;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;
	@Autowired
	private PatientDao patientDao;

	public String bookAppointment(PatientDto patient) {

//		Change PatientDto into Patient model
		Patient p = new ObjectMapper().convertValue(patient, Patient.class);
		long paitentNo = patientDao.save(p).getPatientNo();
		System.out.println(">>>>>>>>>>>>>>>>>Patient Created<<<<<<<<<<<<<<<<<<");

//		created some error to check transaction work or not
		System.out.println(10/0);
		
		Appointment appointment = new Appointment(new Date(), 1001, paitentNo);
		
		String appointmentNo = appointmentDao.save(appointment).getAppointmentNo();
		

		return "Your Appoinment is book and number is : "+appointmentNo;
	}

}
