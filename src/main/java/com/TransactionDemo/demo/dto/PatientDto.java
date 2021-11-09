package com.TransactionDemo.demo.dto;

public class PatientDto {

	public String name;
	public String gender;
	public String mobile;
	public String age;
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
	public String toString() {
		return "PatientDto [name=" + name + ", gender=" + gender + ", mobile=" + mobile + ", age=" + age + "]";
	}
	
	
	
}
