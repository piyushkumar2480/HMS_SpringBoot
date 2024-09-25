package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Booking;
import com.app.pojos.Patient;


public interface IBookingRepo extends JpaRepository<Booking, Integer>  {
    @Query(value="select b from Booking b where b.patient=:pid")
	List<Booking> findByPatient(@Param("pid") Patient patient);

	//List<Booking> findByPatient(Patient p);
	

}
