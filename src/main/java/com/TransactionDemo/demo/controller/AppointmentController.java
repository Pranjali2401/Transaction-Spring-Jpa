package com.TransactionDemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TransactionDemo.demo.dto.PatientDto;
import com.TransactionDemo.demo.service.AppointmentService;

@RestController
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody PatientDto patient) {
		return appointmentService.bookAppointment(patient);
	}

}
