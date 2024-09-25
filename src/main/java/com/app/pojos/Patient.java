package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Patient extends BaseEntity{

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	@Column(name="p_name",length = 20)
	private String name;
	@Column(length = 10)
	private String password;
	@Column(name="p_addr",length = 40)
	private String address;
	@Column(length = 10)
	private String primary_phoneNo;
	@Column(length = 10)
	private String alt_phoneNo;
	private LocalDate dob;
	private String gender;
	
	@Column(length = 5)
	private String blood_grp;
	@Column(length = 20,unique = true)
	private String email;
	//@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	//private Booking booking;
	//private List<Priscription> priscription;
	//private List<Report> reports;
	//private List<Doctor> doctors;
	public Patient() {
		
	}
//	
//	
//	public Patient(String name, String password, String address, String primary_phoneNo, String alt_phoneNo,
//			LocalDate dob, String gender, String blood_grp, String email) {
//		super();
//		this.name = name;
//		this.password = password;
//		this.address = address;
//		this.primary_phoneNo = primary_phoneNo;
//		this.alt_phoneNo = alt_phoneNo;
//		this.dob = dob;
//		this.gender = gender;
//		this.blood_grp = blood_grp;
//		this.email = email;
//	}
//public Patient(Integer id) {
//	super();
//	this.id=id;
//}

	public Patient( String email,String password) {
		super();
		this.password = password;
		this.email = email;
	}

//	public Patient(Integer id, String name, String password, String address, String primary_phoneNo, String alt_phoneNo,
//			LocalDate dob, String gender, String blood_grp, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.password = password;
//		this.address = address;
//		this.primary_phoneNo = primary_phoneNo;
//		this.alt_phoneNo = alt_phoneNo;
//		this.dob = dob;
//		this.gender = gender;
//		this.blood_grp = blood_grp;
//		this.email = email;
//	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimary_phoneNo() {
		return primary_phoneNo;
	}
	public void setPrimary_phoneNo(String primary_phoneNo) {
		this.primary_phoneNo = primary_phoneNo;
	}
	public String getAlt_phoneNo() {
		return alt_phoneNo;
	}
	public void setAlt_phoneNo(String alt_phoneNo) {
		this.alt_phoneNo = alt_phoneNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
//	public List<Booking> getBooking() {
//		return booking;
//	}
//	public void setBooking(List<Booking> booking) {
//		this.booking = booking;
//	}
	


	public String getGender() {
		return gender;
	}






//	public Integer getId() {
//		return id;
//	}
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}


	public void setGender(String gender) {
		this.gender = gender;
	}






	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Patient [ name=" + name + ", password=" + password + ", address=" + address
				+ ", primary_phoneNo=" + primary_phoneNo + ", alt_phoneNo=" + alt_phoneNo + ", dob=" + dob + ", gender="
				+ gender + ", blood_grp=" + blood_grp + ", email=" + email + "]";
	}






	




	
	
}
