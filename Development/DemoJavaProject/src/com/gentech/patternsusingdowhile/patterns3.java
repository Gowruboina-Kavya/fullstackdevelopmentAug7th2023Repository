/*1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15*/

package com.gentech.patternsusingdowhile;

public class patterns3 {

	public static void main(String[] args) {

		int count=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(count+" ");
				count++;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);





	}

}
