/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75*/


package com.gentech.patternsusingdowhile;

public class patterns4 {

	public static void main(String[] args) {
		int count=1;
		int i=1;
		do
		{
			int j=1; 
			do
			{
				System.out.print(count*5+" ");
				count++;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
