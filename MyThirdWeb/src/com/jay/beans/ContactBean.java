package com.jay.beans;

public class ContactBean {

	private String address;
	private String city;
	private String state;
	private String country;
	private int phone;

	public ContactBean() {
	}

	public ContactBean(String address, String city, String state, String country, int phone) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactBean [address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", phone=" + phone + "]";
	}

}
