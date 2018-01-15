/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jay.Ass1;

import java.util.Scanner;

/**
 *
 * @author JAY PATEL
 */
public class Payrate {

public static void main(String args[])
{
    System.out.println("Enter number of hours");
    Scanner sc=new Scanner(System.in);
    double hourWorked=sc.nextDouble();
    System.out.println("Enter pay for hour");
    double payRate=sc.nextDouble();
    
    double res=hourWorked*payRate;
    
     System.out.println("Number of hours worked = "+hourWorked +
             " ,Pay rate per hour is = "+payRate+" ,Salary = "+res);
    
}

}
