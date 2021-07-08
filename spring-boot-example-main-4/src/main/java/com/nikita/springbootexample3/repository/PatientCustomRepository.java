package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.entity.Patient;

import java.util.List;

public interface PatientCustomRepository {
    List<Patient> findbyName(String name, Integer age);
}
