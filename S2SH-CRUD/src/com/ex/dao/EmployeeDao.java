package com.ex.dao;

import java.util.List;

import com.ex.model.Employee;

public interface EmployeeDao {

 public void add(Employee employee) ;//添加新雇员
 public Employee getEmployee(Long id) ;//根据雇员ID得到雇员信息
 public List< Employee> getEmployees() ;//获取所有雇员信息
 public void delete(Long id ) ;//根据雇员ID，删除雇员
 public void saveOrUpdate(Employee employee) ;//修改或更新雇员信息
 public List< Employee> getEmployee(String name, String phone) ;//判断是否合法雇员
 
}
