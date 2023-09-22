/*5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5 
*/


package com.gentech.patternsusingdowhile;

public class patterns6 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int j=5;
			do
			{
				System.out.print(5+" ");
				j--;
			}while(j>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
