/*ravi bhavana bhavani 
madhu ramya hari 
preethi bhargavi kavya */

package com.gentech.twodiemensionalarrays;

public class stringarrayinreverseorder {

	public static void main(String[] args) {
		String x[][]= {{"kavya","bhargavi","preethi"},
				{ "hari","ramya","madhu"},
				{"bhavani","bhavana","ravi"}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();

		}

	}       

}
