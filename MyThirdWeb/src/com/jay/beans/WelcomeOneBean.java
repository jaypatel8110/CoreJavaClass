package com.jay.beans;

public class WelcomeOneBean {
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	
	public WelcomeOneBean() {
	}
	
	public WelcomeOneBean(String name, String middleName, String lastName, String gender) {
		super();
		this.firstName = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
	}


	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	

}
