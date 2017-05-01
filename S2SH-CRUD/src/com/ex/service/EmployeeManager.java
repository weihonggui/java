package com.ex.service;

import java.util.List;

import com.ex.model.Employee;

public interface EmployeeManager {

 public void addEmployee(Employee employee) ;
 public List< Employee> listEmployee() ;
 public void deleteEmployee(Long id) ;
 public void saveOrUpdate(Employee employee) ;
 public Employee getEmployee(Long id) ;
 public Employee getEmployee(String name, String phone) ;
 
 
} 
