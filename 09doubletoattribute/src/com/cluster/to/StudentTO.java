package com.cluster.to;

import java.io.Serializable;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StudentTO implements Serializable{
	int studentId;
	String name;
	String phone;
	AddressTO address;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public AddressTO getAddress() {
		return address;
	}
	public void setAddress(AddressTO address) {
		this.address = address;
	}
	
}
