package com.gentech.programs;

public class Positive0rNegativeNumber {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if (num>0)
		{
			System.out.println("the num is positive");
			}
		else if(num<0)
		{
			System.out.println("the num is Negative");
		}
		else 
		{
			System.out.println("the num is zero");
		}

	}

}
