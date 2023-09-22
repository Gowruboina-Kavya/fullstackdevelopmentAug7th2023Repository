/*5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 */

package com.gentech.patternsusingwhile;

public class patterns6 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=5;
			while(j>=i)
			{
				System.out.print(5+" ");
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
