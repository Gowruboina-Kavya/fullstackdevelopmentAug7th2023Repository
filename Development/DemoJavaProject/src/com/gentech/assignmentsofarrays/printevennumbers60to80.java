/*11
0
78
76
74
72
70
68
66
64
62
60*/


package com.gentech.assignmentsofarrays;

public class printevennumbers60to80 {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=80;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		System.out.println(+count);
		int x[]=new int[count];
		int k=0;
		for(int j=60;j<80;j++)
		{
			if(j%2==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}
}


