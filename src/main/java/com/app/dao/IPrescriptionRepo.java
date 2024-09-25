package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Patient;
import com.app.pojos.Prescription;

public interface IPrescriptionRepo extends JpaRepository<Prescription, Integer> {

	 @Query(value="select p from Prescription p where p.patient=:pid")
	List<Prescription> findByPatient(@Param("pid")Patient patient);

}
