package com.app.service;

import java.util.List;

import com.app.pojos.Booking;
import com.app.pojos.Patient;
import com.app.pojos.Prescription;
import com.app.pojos.Report;

public interface IPatientService {

	List<Patient> getAllPatient();

	List<Patient> getPatientsByEmailAndPassword(String p_email, String p_password);

	Patient savePatientDetails(Patient p);

	Booking bookAppointment(Booking b);

	List<Booking> getAllBooking();

	List<Booking> getAllBooking(Patient patient);

	List<Prescription> getAllPrescriptions(Patient patient);

	List<Report> getAllReports(Patient patient);

	//List<Booking> getAllBooking(Patient p);

}
