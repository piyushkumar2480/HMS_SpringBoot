package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
public class Report extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	
	private String doctorName;
	private String testName;
	private LocalDate date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Patient patient;

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Report [ doctorName=" + doctorName + ", testName=" + testName + ", date=" + date
				+ ", patient=" + patient + "]";
	}

	
}
