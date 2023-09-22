/*1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */


package com.gentech.patternsusingwhile;

public class patterns3 {

	public static void main(String[] args) {
		int count=1;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(count+" ");
				count++;
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
