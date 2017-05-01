package com.ex.model;

public class Employee {

	 private Long id ;
	 private String name ;
	 private String address ;
	 private String phone ;
	 public Long getId() {
	  return id;
	 }
	 public void setId(Long id) {
	  this.id = id;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getAddress() {
	  return address;
	 }
	 public void setAddress(String address) {
	  this.address = address;
	 }
	 public String getPhone() {
	  return phone;
	 }
	 public void setPhone(String phone) {
	  this.phone = phone;
	 }
	 
	 public Employee(){
	  
	 }
	 
	 public Employee(Long id, String name, String address, String phone) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.address = address;
	  this.phone = phone;
	 }
}

