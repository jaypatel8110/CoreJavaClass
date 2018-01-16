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
public class ExpNine {

public static void main(String args[])
{
    //string buffer
    StringBuffer str=new StringBuffer("hi ");
    System.out.println("This is before append  \n" + str);
    for(Character alp='A'; alp<='Z';alp++)
    {
        str.append(alp);
    }
    System.out.println(" After appending : "+str);
    
    
    StringBuilder str1=new StringBuilder("hi ");
    for(Character alp='A'; alp<='Z';alp++)
    {
        str1.append(alp);
    }
    System.out.println(" After appending : "+str1);
}

}
