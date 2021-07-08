package com.nikita.springbootexample3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Join {
    private int id;
    private String test;
    private int pid;
    private String name;
    private int age;
}