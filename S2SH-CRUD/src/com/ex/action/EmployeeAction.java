package com.ex.action;

import java.util.List;

import com.ex.model.Employee;
import com.ex.service.EmployeeManager;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

 private static final long serialVersionUID = 1L;

 private EmployeeManager employeeManager;
 private List<Employee> employees;
 private Employee employee;
 private Long id;
 private Long[] ids;
 private String name;
 private String phone;

 public EmployeeManager getEmployeeManager() {
  return employeeManager;
 }

 public void setEmployeeManager(EmployeeManager employeeManager) {
  this.employeeManager = employeeManager;
 }

 public List<Employee> getEmployees() {
  return employees;
 }

 public void setEmployees(List<Employee> employees) {
  this.employees = employees;
 }

 public Employee getEmployee() {
  return employee;
 }

 public void setEmployee(Employee employee) {
  this.employee = employee;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public Long[] getIds() {
  return ids;
 }

 public void setIds(Long[] ids) {
  this.ids = ids;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 // action
 public String add() {
  if (this.employeeManager.getEmployee(employee.getName(),
    employee.getPhone()) != null) {
   return INPUT;
  } else {
   this.employeeManager.addEmployee(employee);
   return SUCCESS;
  }

 }

 public String list() {
  this.employees = this.employeeManager.listEmployee();
  if (this.employees.size() > 0) {
   return SUCCESS;
  } else {
   return INPUT;
  }
 }

 public String delete() {
  if (null != this.id) {
   this.employeeManager.deleteEmployee(this.id);
  } else {
   if (ids.length > 0) {
    for (Long id : ids) {
     this.employeeManager.deleteEmployee(id);
    }
   }
  }
  if (this.employeeManager.listEmployee().size() > 0) {
   return SUCCESS;
  } else {
   return INPUT;
  }

 }

 public String saveOrUpdate() {

  this.employeeManager.saveOrUpdate(employee);
  return SUCCESS;

 }

 public String edit() {

  this.employee = this.employeeManager.getEmployee(id);
  return SUCCESS;

 }

 public String save() {
  Long id = this.employee.getId();
  employee = this.employeeManager.getEmployee(id);
  return SUCCESS;
 }

 public String update() {

  Long id = this.employee.getId();
  this.employeeManager.saveOrUpdate(employee);
  return SUCCESS;
 }

 public String login() {
  Employee emp = this.employeeManager.getEmployee(name, phone);
  List list = this.employeeManager.listEmployee();
  if (null != emp) {
   return SUCCESS;
  } else {
   if (list.size() > 0) {
    return INPUT;
   } else {
    return ERROR;
   }
  }

 }
}

