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
public class ExpFive {

public static void main(String args[])
{
    System.out.println("1000 numbers are");
    for(int i=0;i<=1000;i++)
    {
        System.out.print(i+ ",");
    }
    System.out.println();
    System.out.println("multiple of 5 and less than 1000");
   
    for(int i=0;i<=1000;i++)
    {
        if(i%5==0)
        {
            System.out.print(i+ ",");
        }
    }
    
    System.out.println();
    System.out.println("odd up to 1000");
   
    for(int i=0;i<=1000;i++)
    {
        if(i%2!=0)
        {
            System.out.print(i+ ",");
        }
    }
    
}

}
