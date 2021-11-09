package com.TransactionDemo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransactionDemo.demo.model.Appointment;

@Repository
public interface AppointmentDao extends JpaRepository<Appointment, String>{

}
