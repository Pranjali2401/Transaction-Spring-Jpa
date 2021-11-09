package com.TransactionDemo.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "PATIENT_INFO")
public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long patientNo;
	private String 	name;
	private String gender;
	private String mobile;
	private String age;
	
	public Patient() {
		
	}
	
	public Patient(long patientNo, String name, String gender, String mobile, String age) {
		super();
		this.patientNo = patientNo;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.age = age;
	}
	
	public long getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(long patientNo) {
		this.patientNo = patientNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, mobile, name, patientNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(age, other.age) && Objects.equals(gender, other.gender)
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name)
				&& patientNo == other.patientNo;
	}

	@Override
	public String toString() {
		return "Patient [patientNo=" + patientNo + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile
				+ ", age=" + age + "]";
	}
	
	
	

}
