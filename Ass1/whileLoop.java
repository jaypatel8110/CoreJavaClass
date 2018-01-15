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
public class whileLoop {
    
    static public int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }else 
        {
            return n*(fact(n-1));
        }
    }

public static void main(String args[])
{
    System.out.println(fact(4));
    //ex fact
    
    
    //ex 1
//    System.out.println("Enter row to sum");
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int i=1;
//    int sum=0;
//    while(i<=n)
//    {
//     sum+=(i*i);
//     i++;
//    }
//    System.out.println("Sum is "+sum);   
    
//    System.out.println("Enter row to sum");
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    
//    int res=(n*(n+1)*(2*n+1))/6;
//    System.out.println(res);
    //ex 4
//    for(int i=7;i>0;i--)
//    {
//       for(int j=i;j>0;j--)
//       {
//           System.out.print("*");
//       }
//        System.out.println(" ");
//    }
   
    //ex5
    
//    int rows=8;
//    int space=rows-1;
//    
//    for(int i=1;i<=rows;i++)
//    {
//        for( int k=1;k<=space;k++)
//        {
//            System.out.print(" ");
//        }
//        space--;
//        for(int j=1 ;j<=2*i-1;j++)
//        {
//            System.out.print("*");
//        }
//        
//        System.out.println();
//        
//    }
//        
//    for(int i=0;i<=3;i++)
//    {
//        for(int s=0;s<6;s++)
//        {
//            System.out.print(" "); 
//        }
//        for(int j=0 ;j<3;j++)
//        {
//            System.out.print("*");
//        }
//         System.out.println();
//    }
//    
//    
    }
}



