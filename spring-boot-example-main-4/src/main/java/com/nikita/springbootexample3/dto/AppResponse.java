package com.nikita.springbootexample3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppResponse {
    private String name;
    private int age;
    private String test;
    private String status;
    private String dname;
}
