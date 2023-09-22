package com.gentech.arrays;

public class substractionof3x3matrix {

	public static void main(String[] args) {
		int x[][]= {{4,5,6},
				{7,8,9},
				{3,4,6}};
		int y[][]= {{1,2,3},
				{3,4,5},
				{1,2,3}};
		if((x.length==y.length)&&(x[0].length==y[0].length))	
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res =x[i][j]-y[i][j];
				System.out.print(res+" ");
			}
			System.out.println();

		}
	}
	}
}


	    




