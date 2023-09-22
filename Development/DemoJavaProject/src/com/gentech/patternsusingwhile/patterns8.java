/*15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 */

package com.gentech.patternsusingwhile;

public class patterns8 {

	public static void main(String[] args) {
		int count=15;
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(count+" ");
				count--;
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
