package com.jay.exOne;

import java.util.Scanner;

public class MainCalculator 
{
	public static void main(String args[]){
	
		Logic l=new Logic();
		System.out.println("Enter two postive numbers");
		Scanner sc=new Scanner(System.in);
		try
		{
			float a=sc.nextFloat();
			float b=sc.nextFloat();
			validate(a, b);
			System.out.println("Sum is "+l.sum(a, b));
			System.out.println("sub is "+l.sub(a, b));
			System.out.println("mul is "+l.mul(a, b));
			System.out.println("dic is "+l.div(a, b));
			System.out.println("mod is "+l.mod(a, b));
			sc.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	
	static void validate(float a, float b)throws NumPositiveException
	{
		if(a<0 || b<0)
		{
			throw new NumPositiveException("Please enter positive number");
		}
	}	
}


