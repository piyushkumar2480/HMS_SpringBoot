package com.app.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IBookingRepo;
import com.app.dao.IPatientRepo;
import com.app.dao.IPrescriptionRepo;
import com.app.dao.IReportRepo;
import com.app.pojos.Booking;
import com.app.pojos.Patient;
import com.app.pojos.Prescription;
import com.app.pojos.Report;

@Service
@Transactional
public class PatientServiceImpl implements IPatientService{

	@Autowired
	private IPatientRepo repo;
	@Autowired
	private IBookingRepo bookingRepo;
	@Autowired
	private IPrescriptionRepo preRepo;
	@Autowired
	private IReportRepo reportRepo;
	
	@Override
	public List<Patient> getAllPatient() {
		return repo.findAll();
		
	}
	@Override
	public List<Patient> getPatientsByEmailAndPassword(String p_email, String p_password) {
		
			return repo.findByEmailAndPassword(p_email,p_password);
	}
	@Override
	public Patient savePatientDetails(Patient p) {
		Patient patient = repo.save(p);// patient : DETACHED : insert
		patient.setName(patient.getName().toUpperCase());
		return patient;
	}
	@Override
	public Booking bookAppointment(Booking b) {
		Booking bookPatient =bookingRepo.save(b);
		
		return bookPatient;
	}
//	@Override
//	public List<Booking> getAllBooking(Patient p) {
//		return repo.getAllBooking(p);
//	
//	}
	@Override
	public List<Booking> getAllBooking() {
		return bookingRepo.findAll();
	}
	@Override
	public List<Booking> getAllBooking(Patient patient) {
		return bookingRepo.findByPatient(patient);
	}
	@Override
	public List<Prescription> getAllPrescriptions(Patient patient) {
		
		return preRepo.findByPatient(patient);
	}
	@Override
	public List<Report> getAllReports(Patient patient) {
		// TODO Auto-generated method stub
		return reportRepo.findByPatient(patient);
	}
	
	
	
}
