/*1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225 */

package com.gentech.patternsusingwhile;

public class patterns5 {

	public static void main(String[] args) {
		int count=1;
		int i=1;
		while(i<=5)
		{
		int j=1;
		while(j<=i)
		{
			System.out.print(count*count+" ");
			count++;
			j++;
		}
		System.out.println();
		i++;
		}
	}

}
