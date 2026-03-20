package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Id
	@GeneratedValue
	private int id;
	private int gstno;
	private String state;
	private String country;
	@OneToOne
	private Company companies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGstno() {
		return gstno;
	}
	public void setGstno(int gstno) {
		this.gstno = gstno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Company getCompanies() {
		return companies;
	}
	public void setCompanies(Company companies) {
		this.companies = companies;
	}
	
}
