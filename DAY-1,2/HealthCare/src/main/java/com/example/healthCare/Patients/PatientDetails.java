package com.example.healthCare.Patients;
import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PatientDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long p_id;
   @Column(name="Patient_Name",nullable=false)
	private String p_name;
	private String contact;
	private String guardian;
	private Date date=new Date();
	private String diagnosis;
	private  int age;
	public Long getP_id() {
		return p_id;
	}
	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public PatientDetails(){
		
	}
	
   public PatientDetails(String name,String cont,String guard,String dia,int age){
	   this.age=age;
	   this.contact=cont;
	   this.diagnosis=dia;
	   this.guardian=guard;
	   this.p_name=name;
		
	}
	
	
}
