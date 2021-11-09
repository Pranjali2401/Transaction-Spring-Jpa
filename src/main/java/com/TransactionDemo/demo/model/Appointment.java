package com.TransactionDemo.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;


@Entity
@Table(name = "APPOINTMENT_INFO")
public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String appointmentNo;
	private Date date;
	private long doctorNo;
	private long patientNo;
	
	public Appointment() {}
	
	public Appointment( Date date, long doctorNo, long patientNo) {
		this.date = date;
		this.doctorNo = doctorNo;
		this.patientNo = patientNo;
	}

	public String getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(long doctorNo) {
		this.doctorNo = doctorNo;
	}

	public long getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(long patientNo) {
		this.patientNo = patientNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentNo, date, doctorNo, patientNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appointmentNo, other.appointmentNo) && Objects.equals(date, other.date)
				&& doctorNo == other.doctorNo && patientNo == other.patientNo;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentNo=" + appointmentNo + ", date=" + date + ", doctorNo=" + doctorNo
				+ ", patientNo=" + patientNo + "]";
	}
	
	
	
	
	

}
