/*1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225 */

package com.gentech.patternsusingdowhile;

public class patterns5 {

	public static void main(String[] args) {
		int count=1;
		int i=1;
		do
		{
		int j=1;
		do
		{
			System.out.print(count*count+" ");
			count++;
			j++;
		}while(j<=i);
		System.out.println();
		i++;
		}while(i<=5);
	}

}
