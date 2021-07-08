package com.nikita.springbootexample3.dto;

import com.nikita.springbootexample3.entity.Report;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppRequest {

    private Report report;
}
