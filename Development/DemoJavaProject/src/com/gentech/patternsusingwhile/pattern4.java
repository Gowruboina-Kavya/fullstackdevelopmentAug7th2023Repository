/*5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 */


package com.gentech.patternsusingwhile;

public class pattern4 {

	public static void main(String[] args) {
		int count=1;
	     int i=1;
	     while(i<=5)
		{
		 int j=1; 
		 while(j<=i)
		{
			System.out.print(count*5+" ");
			count++;
			j++;
		}
		System.out.println();
		i++;
	}


	}

}
