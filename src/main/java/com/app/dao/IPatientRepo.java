package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Booking;
import com.app.pojos.Patient;

public interface IPatientRepo extends JpaRepository<Patient, Integer>{

	List<Patient> findByEmailAndPassword(String p_email, String p_password);

	//List<Booking> getAllBooking();
	
	//String bookAppointment()

}
