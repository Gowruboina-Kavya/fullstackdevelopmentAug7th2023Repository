package com.gentech.programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[0]);
		if((a>=b)&&(a>=c))
		{
			System.out.println(a+"is the largest number");
		}
		else if((b>=a)&&(b>=c))
		{
			System.out.println(b+"is the largest number");
		}
		else
		{
			System.out.println(c+"is the largest number");
			
		}

	}

}
