package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
//@Setter
//@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
private long empId;
private String empName;
private double empSal;
//entity reference
Address a; //"HAS- A relationship/association"
//public long getEmpId() {
//	return empId;
//}
//public void setEmpId(long empId) {
//	this.empId = empId;
//}
//public String getEmpName() {
//	return empName;
//}
//public void setEmpName(String empName) {
//	this.empName = empName;
//}
//public double getEmpSal() {
//	return empSal;
//}
//public void setEmpSal(double empSal) {
//	this.empSal = empSal;
//}
//public Employee(long empId, String empName, double empSal, Address address) {
//	super();
//	this.empId = empId;
//	this.empName = empName;
//	this.empSal = empSal;
//	this.address = address;
//	
//}

}








