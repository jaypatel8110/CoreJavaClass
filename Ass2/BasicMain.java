/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jay.Ass2;

import java.util.Scanner;

/**
 *
 * @author JAY PATEL
 */
public class BasicMain {

public static void main(String args[])
{
    BasicCal cal=new BasicCal();
    System.out.println("Enter two numbers");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    System.out.println("Addition is = "+cal.Addition(a, b));
    System.out.println("Sub is = "+cal.Substraction(a, b));
    System.out.println("Division is = "+cal.Division(a, b));
    System.out.println("Multip is = "+cal.Multipilcation(a, b));
}

}
