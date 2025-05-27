 package com.example.healthCare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.healthCare.Patients.PatientDetails;
@Repository
public interface PatientRepo extends JpaRepository<PatientDetails, Long> {

}
 