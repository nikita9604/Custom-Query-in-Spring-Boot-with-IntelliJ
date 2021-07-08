package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.dto.DoctorRequest;
import com.nikita.springbootexample3.dto.PatientRequest;
import com.nikita.springbootexample3.entity.Patient;
import net.bytebuddy.TypeCache;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer>,PatientCustomRepository {
    List<Patient> findbyAge(Integer age);
    // Get unique value pairs from Patient Entity
    @Query("SELECT DISTINCT new com.nikita.springbootexample3.dto.PatientRequest(p.name,p.age) from Patient p")
    public List<PatientRequest> getAllPatients();

    @Query("SELECT DISTINCT new com.nikita.springbootexample3.dto.PatientRequest(p.name,p.age) from Patient p where age>30")
    public List<PatientRequest> getsomePatients();
}
