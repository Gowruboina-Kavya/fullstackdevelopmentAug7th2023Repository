package com.gentech.matrixes;
import java.util.*;
public class multiplicationoftwomatrix {

	public static void main(String[] args) {
		int x[][]= {
				{1,2,3},
				{4,5,6}
		};
		int y[][]= {
				{1,7},
				{3,2},
				{6,2}
		};
		int xRows = x.length;
		int xCols = x[0].length;
		int yRows = y.length;
		int yCols = y[0].length;
		
		if(xRows == yCols) {
			int c[][] = new int[xRows][yCols];
			for(int i=0; i<xRows; i++) 
			{
				for(int j=0; j<yCols; j++) 
				{
					for(int k=0; k<xCols; k++) 
					{
						c[i][j]+= x[i][k] * y[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(c));
		}else {
			System.out.println("Can't perform Matrix Multiplication.");
		}
	}





	}