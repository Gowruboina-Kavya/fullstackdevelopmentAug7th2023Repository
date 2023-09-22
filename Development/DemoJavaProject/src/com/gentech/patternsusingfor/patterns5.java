/*1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225 */


package com.gentech.patternsusingfor;

public class patterns5 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(count*count+" ");
			count++;
		}
		System.out.println();
		}


	}

}
