package com.gentech.matrixes;

public class oneintegertotwointeger {

	public static void main(String[] args) {
		int x[]= {7,8,9,4,3,1};
		int a[][]=new int [2][3];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=x[k];
				k++;
			}
		}
		for(int m=0;m<a.length;m++)
		{
			for(int n=0;n<a[m].length;n++)
			{
				System.out.print(a[m][n]+" ");
			}
			System.out.println(" ");
		}

	}

}
