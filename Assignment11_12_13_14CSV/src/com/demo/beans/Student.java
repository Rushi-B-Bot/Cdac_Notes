package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable{
private int prn;
private String name,degree,email;
public int getPrn() {
	return prn;
}
public void setPrn(int prn) {
	this.prn = prn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student(int prn, String name, String degree, String email) {
	super();
	this.prn = prn;
	this.name = name;
	this.degree = degree;
	this.email = email;
}
public Student() {
	
}
@Override
public String toString() {
	return "Student [prn=" + prn + ", name=" + name + ", degree=" + degree + ", email=" + email + "]";
}

}
