/*1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 */

package com.gentech.patternsusingdowhile;

public class patterns7 {

	public static void main(String[] args) {
		int i=5;
		do
		{
			int j=1;
			do
			{
				System.out.print(j+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
