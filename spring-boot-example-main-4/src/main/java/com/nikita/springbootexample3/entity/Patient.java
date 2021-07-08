package com.nikita.springbootexample3.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@NamedQueries(value = {
        @NamedQuery(name = "Patient.findbyAge",query = "SELECT p FROM Patient p WHERE p.age=?1")
})
public class Patient {
    @Id
    private int pid;
    private String name;
    private int age;
}
