package com.TransactionDemo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransactionDemo.demo.model.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long>{


}
