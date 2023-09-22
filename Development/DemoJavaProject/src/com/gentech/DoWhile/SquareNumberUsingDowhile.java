package com.gentech.DoWhile;

public class SquareNumberUsingDowhile {

	public static void main(String[] args) {
		int sum=1;
		int i=20;
		do
		{
			sum=sum+(i*i);
			i--;
		}while(i>=1);
		System.out.println(sum);
		
	}

}
