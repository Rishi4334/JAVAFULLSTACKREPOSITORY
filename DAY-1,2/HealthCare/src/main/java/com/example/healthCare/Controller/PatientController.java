package com.example.healthCare.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.healthCare.Patients.PatientDetails;
import com.example.healthCare.Services.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService serv;

    @PostMapping("/save")
    public void savepatient(@RequestBody PatientDetails pat) {
        serv.savePatient(pat);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PatientDetails> getpatient(@PathVariable Long id) {
        return ResponseEntity.ok(serv.getPatient(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deletepatient(@PathVariable Long id) {
        serv.deletePatient(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PatientDetails> update(@PathVariable Long id,@RequestBody PatientDetails pat) {
        return ResponseEntity.ok(serv.updatePatient(pat));
    }
}
