package com.example.DepartmentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class Department {
@Id
@GeneratedValue
private int dId;
private String dName;
public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public Department(int dId, String dName) {
	
	this.dId = dId;
	this.dName = dName;
}
public Department() {}
@Override
public String toString() {
	return "Department [dId=" + dId + ", dName=" + dName + "]";
}


}
