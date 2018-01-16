/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jay.Ass2;

/**
 *
 * @author JAY PATEL
 */
public class Employee {
    
private int empNo;
private String empName;
private String address;
private String state;
private long zipcode;
private String phone;
private String Designation;
private int  experienceinYears;
private String emailAddress;
private double hra;
private double basic;
private double bonus;

    public Employee(int empNo, String empName, String address, String state, long zipcode, String phone, String Designation, int experienceinYears, String emailAddress, double hra, double basic, double bonus) {
        this.empNo = empNo;
        this.empName = empName;
        this.address = address;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
        this.Designation = Designation;
        this.experienceinYears = experienceinYears;
        this.emailAddress = emailAddress;
        this.hra = hra;
        this.basic = basic;
        this.bonus = bonus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public int getExperienceinYears() {
        return experienceinYears;
    }

    public void setExperienceinYears(int experienceinYears) {
        this.experienceinYears = experienceinYears;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

   
    public double totalsalary()
    {
        return (basic + hra + (bonus/100)*basic);
    }
}
