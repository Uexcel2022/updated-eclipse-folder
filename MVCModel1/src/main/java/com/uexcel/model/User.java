package com.uexcel.model;

import java.time.LocalDateTime;


public class User {
 private String firstName;
 private String lastName;
 private String email;
 private String gender;
 private String password;
 private LocalDateTime createdAt;
 
 
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public LocalDateTime getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
 

 
}
