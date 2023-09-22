package com.gentech.constchainingdemo;
class Number
{
	Number(int n)
	{
		if((n<10)&&(n>=0))
		{
			System.out.println("number is single digit:"+n);
		}
		else if((n>=10)&&(n<100))
		{
			System.out.println("number is two digit:"+n);
		}
		else if((n>=100)&&(n<1000))
		{
			System.out.println("number is three digit :"+n);
		}
		else if((n>=1000)&&(n<10000))
		{
			System.out.println("number is four digit:"+n);
		}
		else
		{
			System.out.println("number is invalid");


		}

	}
}
public class findoutnoofdigits {

	public static void main(String[] args) {
		Number obj1=new Number(1);
		Number obj2=new Number(10);
		Number obj3=new Number(1000);
		Number obj4=new Number(10000);
		Number obj5=new Number(1000000);

	}

}
