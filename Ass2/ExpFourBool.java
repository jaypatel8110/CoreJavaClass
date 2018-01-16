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
public class ExpFourBool 
{
    public boolean isInteger(String str)
    {
        boolean status=true;
        if(str.length()<=0)
        {
            return false;
            
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            
            if(Character.isDigit(c))
            {
                status=true;
            }else
            {
                status=false;
                break;
            }
        }
        return status;
        
    }
    //prog for odd number
    public boolean isOddNumber(String str)
    {
        boolean status=false;
        if(str.length()<0)
        {
            return false;
        }
        
       for(int i=0;i<str.length();i++)
        {
        char c=str.charAt(i);
        if(Character.isDigit(c))
        {
            int n=Integer.parseInt(str);
            if(n%2==0)
            {
                status= false;
            }else 
            {
                status= true;
            }
        }else
            {
                status= false;
            }
        }
     return status;
    }
    
    //for even 
    public boolean isEvenNumber(String str)
    {
        boolean status=false;
        if(str.length()<0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                int n=Integer.parseInt(str);
                if(n%2==0)
                {
                    status=true;
                }
                else
                {
                    status= false;
                }
            }else
            {
                status= false;                
            }
        }
        return status;
    }
    //for prime
    public boolean isPrimeNumber(String str)
    {
        boolean status=true;
        if(str.length()<0)
        {
            status=false;
        }
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isDigit(c))
            {
                int n=Integer.parseInt(str);
                int j=2;
                while(j<=n/2)
                {
                    if(n%j==0)
                    {
                        status=false;
                        break;
                    }
                    j++;
                }
            }else
            {
                status= false;                
            }
        }
        return status;
    }
    
    



}
