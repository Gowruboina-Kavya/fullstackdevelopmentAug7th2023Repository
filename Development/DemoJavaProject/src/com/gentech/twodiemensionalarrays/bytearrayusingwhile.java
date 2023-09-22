/*2 4 6 
8 10 12 
14 16 18 
*/
package com.gentech.twodiemensionalarrays;

public class bytearrayusingwhile {

	public static void main(String[] args) {
		byte a[][]= {{2,4,6},
				{8,10,12},
				{14,16,18}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
