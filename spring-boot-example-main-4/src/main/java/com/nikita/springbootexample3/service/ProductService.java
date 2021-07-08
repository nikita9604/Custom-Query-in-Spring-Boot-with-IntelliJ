package com.nikita.springbootexample3.service;

import com.nikita.springbootexample3.dto.Join;
import com.nikita.springbootexample3.entity.Doctor;
import com.nikita.springbootexample3.entity.Patient;
import com.nikita.springbootexample3.entity.Report;
import com.nikita.springbootexample3.repository.DoctorRepository;
import com.nikita.springbootexample3.repository.PatientRepository;
import com.nikita.springbootexample3.repository.ReportRepository;
import net.bytebuddy.TypeCache;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.Doc;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private DoctorRepository repository;
    @Autowired
    private PatientRepository repository2;
    @Autowired
    private ReportRepository repository3;

    public List<Doctor> addDoctors(List<Doctor> doctors){ return repository.saveAll(doctors); }
    public List<Doctor> getDoctors(){
        return repository.findAll();
    }
    public Doctor getDoctorById(int id){ return repository.findById(id).orElse(null); }
    public String deleteDoctor(int id){
        repository.deleteById(id);
        return "Removed Doctor with ID - " + id;
    }
    public Doctor updateDoctor(Doctor doctor){
        Doctor existingProduct=repository.findById(doctor.getDid()).orElse(null);
        existingProduct.setDname(doctor.getDname());
        existingProduct.setSpecs(doctor.getSpecs());
        return repository.save(existingProduct);
    }

    public List<Patient> addPatients(List<Patient> patients){ return repository2.saveAll(patients); }
    public List<Patient> getPatients(){
        return repository2.findAll();
    }
    public Patient getPatientById(int id){ return repository2.findById(id).orElse(null); }
    public String deletePatient(int id){
        repository2.deleteById(id);
        return "Removed Report with ID - " + id;
    }
    public Patient updatePatient(Patient patient){
        Patient existingProduct=repository2.findById(patient.getPid()).orElse(null);
        existingProduct.setName(patient.getName());
        existingProduct.setAge(patient.getAge());
        return repository2.save(existingProduct);
    }

    //public List<Report> getReports(){ return repository3.findAll(); }
    public List<Doctor> getDspecs(String specs) { return repository.getDspecs(specs); }
    public List<Doctor> getDspecss(String specs) { return repository.getDspecss(specs); }
    public List<Doctor> getDspecsss(String specs) {
        return repository.getDspecsss(specs);
    }
    public List<Report> getRtest(String test) { return repository3.getRtest(test); }



    public List<Join> getLeftJoin() {
        List<Join> list = repository3.fetchLeftJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<Join> getRightJoin() {
        List<Join> list = repository3.fetchRightJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<Join> getInnerJoin() {
        List<Join> list = repository3.fetchInnerJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<Join> getCrossJoin() {
        List<Join> list = repository3.fetchCrossJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }
}
