/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/


package com.gentech.patternsusingfor;

public class patterns4 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(count*5+" ");
			count++;
		}
		System.out.println();
	}

}
}
