package com.app.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Booking;
import com.app.pojos.Patient;
import com.app.pojos.Prescription;
import com.app.pojos.Report;
import com.app.service.IPatientService;

@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private IPatientService service;
	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}
	
	
	@GetMapping
	public ResponseEntity<?> getAllPatientDetails() {
		System.out.println("in get all studs");
		// invoke service layer method
		List<Patient> patients = service.getAllPatient();
		if (patients.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	@GetMapping("/getbookings")
	public ResponseEntity<?> getAllBooking() {
		System.out.println("in get all booking");
		// invoke service layer method
		List<Booking> patients = service.getAllBooking();
		if (patients.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	
	
	@PostMapping("/p_login")
	public ResponseEntity<?> patientLogin(@RequestBody Patient p) {
		System.out.println("get by email and password " + p.getEmail() + " " + p.getPassword());
		List<Patient> patient = service.getPatientsByEmailAndPassword(p.getEmail(),p.getPassword());
		if (patient.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patient, HttpStatus.OK);
      }
	
	@PostMapping("/p_register")
	public ResponseEntity<?> savePatientDetails(@RequestBody Patient p) {
		System.out.println("in save patient " + p);// transient un marshalled from json ---> student details
		try {
			Patient details = service.savePatientDetails(p);
			return new ResponseEntity<>(details, HttpStatus.CREATED);
		} catch (RuntimeException e) {
			System.out.println("err in save " + e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);// empty body content , sending only err code
		}
	}
	
	@PostMapping("/p_booking")
	public ResponseEntity<?> bookAppointment(@RequestBody Booking b){
		System.out.println("in patient booking " + b);
		
		try {
			Booking book = service.bookAppointment(b);
			return new ResponseEntity<>(book, HttpStatus.CREATED);
			
			
		} catch (RuntimeException e) {
			System.out.println("err in booking " + e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);// empty body content , sending only err code
		}
		
	}
	@PostMapping("/appointments")
	public ResponseEntity<?> getAppointments(@RequestBody Patient patient){
		System.out.println("in appointments"+patient);
		List<Booking> patients = service.getAllBooking(patient);
		//System.out.println(patients);//
		if (patients.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	
	@PostMapping("/prescriptions")
	public ResponseEntity<?> getPrescriptions(@RequestBody Patient patient){
		System.out.println("in Prescriptions"+patient);
		List<Prescription> patients = service.getAllPrescriptions(patient);
		//System.out.println(patients);//
		if (patients.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	
	@PostMapping("/reports")
	public ResponseEntity<?> getReports(@RequestBody Patient patient){
		System.out.println("in Reports"+patient);
		List<Report> patients = service.getAllReports(patient);
		//System.out.println(patients);//
		if (patients.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}
	
	
}
