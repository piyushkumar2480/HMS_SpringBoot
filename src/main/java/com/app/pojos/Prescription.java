package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Prescription extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	
	private String doctorName;
	private String medicineName;
	private int dailyMedicineQuantity;
	private int noOfDays;
	private LocalDate date;
	@ManyToOne(cascade = CascadeType.ALL)
	private Patient patient;
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getDailyMedicineQuantity() {
		return dailyMedicineQuantity;
	}
	public void setDailyMedicineQuantity(int dailyMedicineQuantity) {
		this.dailyMedicineQuantity = dailyMedicineQuantity;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
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
		return "Prescription [doctorName=" + doctorName + ", medicineName=" + medicineName
				+ ", dailyMedicineQuantity=" + dailyMedicineQuantity + ", noOfDays=" + noOfDays + ", date=" + date
				+ ", patient=" + patient + "]";
	}
	
	
	
	
}
