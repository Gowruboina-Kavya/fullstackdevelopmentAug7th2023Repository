package com.gentech.constchainingdemo;
class Sum
{
	Sum(int n,int sum)
	{
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of given number:"+sum);
	}
}
public class Findsumofeachdigit {

	public static void main(String[] args) {
		Sum obj1=new Sum(468,0);

	}

}
