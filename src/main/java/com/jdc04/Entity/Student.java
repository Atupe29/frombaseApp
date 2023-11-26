package com.jdc04.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id

	private Integer id;
	private String name;
	private String address;
	private String phone;
	private String cast;
	private String country;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student(Integer id, String name, String address, String phone, String cast, String country) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cast = cast;
		this.country = country;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", cast=" + cast
				+ ", country=" + country + "]";
	}
	

	
}
