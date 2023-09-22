/*2 
2 2 
2 2 2 
2 2 2 2 
2 2 2 2 2 */


package com.gentech.patternsusingwhile;

public class patterns1 {

	public static void main(String[] args) {
         int i=1;
         while(i<=5)
		{
		int j=1;
		while(j<=i)
		{
			System.out.print(2+" ");
			j++;
		}
		System.out.println();
		i++;
		}

	}

}
