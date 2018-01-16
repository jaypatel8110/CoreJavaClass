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
public class Two_one {
    
    static int fibo(int n)
    {
        if(n==1)
        {
            return 1;
        }else
            return n*fibo(n-1);
    }

public static void main(String args[])
{
    //exp 1
    System.out.println("Enter number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.err.println(fibo(n));
    
}

}
