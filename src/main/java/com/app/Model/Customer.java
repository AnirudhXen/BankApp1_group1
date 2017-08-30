package com.app.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test222")
public class Customer implements Serializable{
	
	@Id
	private long customer_Id;
	@Column
	private String last_name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customer_Id, String last_name, String first_name, String middle_initial, String street,
			String city, String state, String zip, String phone, String email) {
		super();
		this.customer_Id = customer_Id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.middle_initial = middle_initial;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}
	@Column
	private String first_name;
	@Column
	private String middle_initial;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column
	private String phone;
	@Column
	private String email;
	public long getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(long customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_initial() {
		return middle_initial;
	}
	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
