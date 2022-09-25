package com.blaze.springdatarest.repository;

import com.blaze.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    //JpaRepository will generate default methods for database operations

}
