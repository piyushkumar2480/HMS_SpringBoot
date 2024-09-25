package com.app.pojos;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
@Entity
public class Booking extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer bookingId;
	private LocalDate date;
	private String time;
	
	//@ManyToOne
	//@JoinColumn(name="p_id") //To replace hibenrate generated FK col name by our own
	@ManyToOne
	private Patient patient;
	
	private String doctorName;
//	@Enumerated(EnumType.STRING)
	private String reason;
	public Booking() {
		
	}
	
//	public Booking(LocalDate date, String time, Patient patient, String doctorName, String reason) {
//		super();
//		this.date = date;
//		this.time = time;
//		this.patient = patient;
//		this.doctorName = doctorName;
//		this.reason = reason;
//	}
//
//	
//	public Booking(Integer bookingId, LocalDate date, String time, Patient patient, String doctorName, String reason) {
//		super();
//		this.bookingId = bookingId;
//		this.date = date;
//		this.time = time;
//		this.patient = patient;
//		this.doctorName = doctorName;
//		this.reason = reason;
//	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
//	public Integer getBookingId() {
//		return bookingId;
//	}
//
//	public void setBookingId(Integer bookingId) {
//		this.bookingId = bookingId;
//	}

	@Override
	public String toString() {
		return "Booking [ date=" + date + ", time=" + time + ", patient=" + patient
				+ ", doctorName=" + doctorName + ", reason=" + reason + "]";
	}

	

	
	
}
