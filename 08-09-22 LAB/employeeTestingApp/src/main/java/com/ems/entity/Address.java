package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Address {
private String city;
private String country;
//public String getCity() {
//	return city;
//}
//public String getCountry() {
//	return country;
//}
//public Address1(String city, String country) {
//	super();
//	this.city = city;
//	this.country = country;
//}

}
