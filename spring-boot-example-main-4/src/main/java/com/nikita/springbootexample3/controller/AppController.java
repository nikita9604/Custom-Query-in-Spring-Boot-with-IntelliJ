package com.nikita.springbootexample3.controller;

import com.nikita.springbootexample3.dto.*;
import com.nikita.springbootexample3.entity.Doctor;
import com.nikita.springbootexample3.entity.Patient;
import com.nikita.springbootexample3.entity.Report;
import com.nikita.springbootexample3.repository.DoctorRepository;
import com.nikita.springbootexample3.repository.PatientRepository;
import com.nikita.springbootexample3.repository.ReportRepository;
import com.nikita.springbootexample3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@RestController
public class AppController {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private ProductService service;

    @PostMapping("/addR")
    public Report addEntry(@RequestBody AppRequest request){ return reportRepository.save(request.getReport());}
    @PostMapping("/addD")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> doctors){
        return service.addDoctors(doctors);
    }
    @PostMapping("/addP")
    public List<Patient> addPatients(@RequestBody List<Patient> patients){
        return service.addPatients(patients);
    }

    @GetMapping("/getR")
    public List<Report> getReports(){
        return reportRepository.findAll();
    }
    /*
    // Another way of getting all reports
    @GetMapping("/getRs")
    public List<Report> getReport(){ return service.getReports(); }
     */
    @GetMapping("/getP")
    public List<Patient> getPatients(){ return service.getPatients(); }
    @GetMapping("/getD")
    public List<Doctor> getDoctors(){ return service.getDoctors(); }
    @GetMapping("/getPById/{id}")
    public Patient getPatientById(@PathVariable int id){ return service.getPatientById(id); }
    @GetMapping("/getDById/{id}")
    public Doctor getDoctorById(@PathVariable int id){ return service.getDoctorById(id); }

    @PutMapping("/updateD")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return service.updateDoctor(doctor);
    }
    @PutMapping("/updateP")
    public Patient updatePatient(@RequestBody Patient patient){
        return service.updatePatient(patient);
    }

    @DeleteMapping("/deleteD/{id}")
    public String deleteDoctor(@PathVariable int id){
        return service.deleteDoctor(id);
    }
    @DeleteMapping("/deleteP/{id}")
    public String deletePatient(@PathVariable int id){ return service.deletePatient(id); }

    @GetMapping("/allR")
    public List<AppResponse> getJoinInformation(){ return reportRepository.getJoinInformation(); }
    @GetMapping("/allD")
    public List<DoctorRequest> getAllDoctors(){ return doctorRepository.getAllDoctors(); }
    @GetMapping("/allP")
    public List<PatientRequest> getAllPatients(){ return patientRepository.getAllPatients(); }
    @GetMapping("/someP")
    public List<PatientRequest> getsomePatients(){ return patientRepository.getsomePatients(); }

    @GetMapping("/getD/{specs}")
    public ResponseEntity<List<Doctor>> getDspecs(@PathVariable String specs) {
        return new ResponseEntity<>(service.getDspecs(specs), HttpStatus.OK);
    }
    @GetMapping("/getDD/{specs}")
    public ResponseEntity<List<Doctor>> getDspecss(@PathVariable String specs) {
        return new ResponseEntity<>(service.getDspecss(specs), HttpStatus.OK);
    }
    @GetMapping("/getDDD/{specs}")
    public ResponseEntity<List<Doctor>> getDspecsss(@PathVariable String specs) {
        return new ResponseEntity<>(service.getDspecsss(specs), HttpStatus.OK);
    }
    @GetMapping("/getR/{test}")
    public ResponseEntity<List<Report>> getRtest(@PathVariable String test) {
        return new ResponseEntity<>(service.getRtest(test), HttpStatus.OK);
    }
    @GetMapping("/getP/{name}/{age}")
    public List<Patient> findbyName(@PathVariable String name,
                                    @PathVariable Integer age){
        return patientRepository.findbyName(name,age);
    }
    @GetMapping("/getP/{age}")
    public List<Patient> findbyAge(@PathVariable Integer age){
        return patientRepository.findbyAge(age);
    }

    @GetMapping("/l")
    public List<Join> fetchLeftJoin(){ return reportRepository.fetchLeftJoin(); }
    @GetMapping("/r")
    public List<Join> fetchRightJoin(){ return reportRepository.fetchRightJoin(); }
    @GetMapping("/i")
    public List<Join> fetchInnerJoin(){ return reportRepository.fetchInnerJoin(); }
    @GetMapping("/c")
    public List<Join> fetchCrossJoin(){ return reportRepository.fetchCrossJoin(); }

}
