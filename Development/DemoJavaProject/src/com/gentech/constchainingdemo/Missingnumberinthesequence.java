package com.gentech.constchainingdemo;
class Missing
{
	int c = 0;
	int temp = 0;
	Missing(int n)
	{
		temp = n;
		c = n%10;
		while(c>0)
		{
			if((temp%10) == c)
			{
				temp = temp/10;
				c--;
			}
			else
			{
				System.out.print("Missing : "+c);
				break;
			}
		}
	}
}

public class Missingnumberinthesequence {

	public static void main(String[] args) {
		Missing obj = new Missing(1245678);

	}

}
