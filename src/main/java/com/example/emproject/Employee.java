package com.example.emproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private Long id;
    private String Name;
    private String phone;
    private String email;
}
