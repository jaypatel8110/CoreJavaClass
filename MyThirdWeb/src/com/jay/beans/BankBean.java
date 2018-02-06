package com.jay.beans;

public class BankBean {

	private String bankName;
	private int accountNumber;
	private int SSN;
	
	public BankBean() {
		
	}
	public BankBean(String bankName, int accountNumber, int sSN) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		SSN = sSN;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "BankBean [bankName=" + bankName + ", accountNumber=" + accountNumber + ", SSN=" + SSN + "]";
	}

}
