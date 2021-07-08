package com.nikita.springbootexample3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorRequest {
    private String dname;
    private String specs;
}
