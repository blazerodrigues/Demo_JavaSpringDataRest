package com.blaze.springdatarest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String department;
    private String skills;
    private Integer yearsOfExperience;

}
