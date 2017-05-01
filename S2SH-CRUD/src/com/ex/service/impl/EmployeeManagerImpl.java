package com.ex.service.impl;

import java.util.List;
import com.ex.dao.EmployeeDao;
import com.ex.model.Employee;
import com.ex.service.EmployeeManager;

public class EmployeeManagerImpl implements EmployeeManager {

 private EmployeeDao employeeDao ;
 
 public void setEmployeeDao(EmployeeDao employeeDao){
  
  this.employeeDao = employeeDao ;
 }
 public EmployeeDao getEmployeeDao(){
  
  return this.employeeDao ;
 }
 public void addEmployee(Employee employee) {

  this.employeeDao.add(employee) ;

 }

 public List<Employee> listEmployee() {
  
  return this.employeeDao.getEmployees() ;
  
 }

 public void deleteEmployee(Long id) {
  
  this.employeeDao.delete(id) ;

 }

 public void saveOrUpdate(Employee employee) {

  this.employeeDao.saveOrUpdate(employee) ;
 }

 public Employee getEmployee(Long id) {

  return  this.employeeDao.getEmployee(id) ;
 }

 public Employee getEmployee(String name, String phone) {

  List< Employee> list = this.employeeDao.getEmployee(name, phone) ;
  if (list != null && list.size() >0){
   return list.get( 0 ) ;
  }else{
   return null ;
  }
 }

}

