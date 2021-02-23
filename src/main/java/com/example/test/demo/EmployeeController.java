package com.example.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
  @Autowired
  public EmployeeService employRepo;
  
  
  @GetMapping( path="/getEmployee")
  public void getEmployee() {
	  employRepo.getEmployee(); 
  }
  
  
  

}
