package com.blaze.springdatarest;

import com.blaze.springdatarest.entity.Employee;
import com.blaze.springdatarest.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringdatarestApplication {

	@Autowired
	EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestApplication.class, args);
	}

	@PostConstruct
	public void dummyEmployees(){

		//Method to populate dummy employee data in the database
		Employee e1 = Employee.builder().name("John").department("IT").skills("Java").yearsOfExperience(3).build();
		Employee e2 = Employee.builder().name("Mary").department("Finance").skills("Excel").yearsOfExperience(5).build();
		Employee e3 = Employee.builder().name("Jane").department("HR").skills("Communication").yearsOfExperience(2).build();
		Employee e4 = Employee.builder().name("David").department("IT").skills("Python").yearsOfExperience(7).build();
		Employee e5 = Employee.builder().name("Lisa").department("Legal").skills("Writing").yearsOfExperience(3).build();

		employeeRepo.save(e1);
		employeeRepo.save(e2);
		employeeRepo.save(e3);
		employeeRepo.save(e4);
		employeeRepo.save(e5);

	}

}
