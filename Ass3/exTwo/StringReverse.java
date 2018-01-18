package com.jay.exTwo;

public class StringReverse {
	static void logic(String s)
	{
		if((s==null)||s.length()<=1) // in case of last number
		{
			System.out.println(s);
		}	else
		{
			System.out.print(s.charAt((s.length()-1))); //loop and print the last number
			logic(s.substring(0, s.length()-1));
		}
	}

	public static void main(String[] args) {
		String s = "My name is jay";
		logic(s);
	}

}
