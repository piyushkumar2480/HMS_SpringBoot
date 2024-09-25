package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Patient;
import com.app.pojos.Prescription;
import com.app.pojos.Report;

public interface IReportRepo extends JpaRepository<Report, Integer> {

	 @Query(value="select r from Report r where r.patient=:pid")
	List<Report> findByPatient(@Param("pid")Patient patient);

}
