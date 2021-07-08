package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.dto.AppResponse;
import com.nikita.springbootexample3.dto.DoctorRequest;
import com.nikita.springbootexample3.dto.Join;
import com.nikita.springbootexample3.entity.Doctor;
import com.nikita.springbootexample3.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.TypedQuery;
import java.util.List;

public interface ReportRepository extends JpaRepository<Report,Integer> {
    // Get all details of specified test
    @Query("SELECT r from Report r where r.test=?1")
    public List<Report> getRtest(String test);
    // Get values from Combination of Entities
    @Query("SELECT new com.nikita.springbootexample3.dto.AppResponse(p.name,p.age,r.test,r.status,d.dname) " +
            "FROM Report r JOIN r.patient p JOIN r.doctor d")
    public List<AppResponse> getJoinInformation();


    // Joins
    @Query("SELECT new com.nikita.springbootexample3.dto.Join(r.id, r.test, p.pid, p.name, p.age) "
            + "FROM Report r LEFT JOIN r.patient p")
    List<Join> fetchLeftJoin();

    @Query("SELECT r.id, r.test, p.pid, p.name, p.age "+ "FROM Report r RIGHT JOIN r.patient p")
    List<Join> fetchRightJoin();

    @Query("SELECT new com.nikita.springbootexample3.dto.Join(r.id, r.test, p.pid, p.name, p.age) "
            + "FROM Report r INNER JOIN r.patient p")
    List<Join> fetchInnerJoin();

    @Query("SELECT new com.nikita.springbootexample3.dto.Join(r.id, r.test, p.pid, p.name, p.age) "
            + "FROM Report r, Patient p")
    List<Join> fetchCrossJoin();
}
