package com.example.healthCare.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthCare.Exceptions.ResouceNotFoundException;
import com.example.healthCare.Patients.PatientDetails;
import com.example.healthCare.repositories.PatientRepo;

@Service
public class PatientService {
    @Autowired
	PatientRepo repo;
	public void savePatient(PatientDetails pat) {
		repo.save(pat);
	}
	public PatientDetails getPatient(Long id) {
		PatientDetails pat =repo.findById(id).orElseThrow(()->new ResouceNotFoundException("Patient is Dead")) ;
		return pat;
	}
	public void deletePatient(Long id) {
		repo.delete(getPatient(id));
	}
	public PatientDetails updatePatient(PatientDetails pat) {
		PatientDetails pat1 = getPatient(pat.getP_id());
		pat1.setAge(pat.getAge());
		pat1.setContact(pat.getContact());
		pat1.setDiagnosis(pat.getDiagnosis());
		pat1.setP_name(pat.getP_name());
		pat1.setGuardian(pat.getGuardian());
		return repo.save(pat1);
	}
}
