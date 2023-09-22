package com.gentech.matrixes;

public class Scalarmultiplicationusingdouble {

	public static void main(String[] args) {
			double x[][]= {{2,3,5},{7,8,5}};
			{
				for(int i=0;i<x.length;i++)
				{
					for(int j=0;j<x[i].length;j++)
					{
						System.out.print(x[i][j]*2+" ");
					}
					System.out.println(" ");
				}
			}

	}

}
