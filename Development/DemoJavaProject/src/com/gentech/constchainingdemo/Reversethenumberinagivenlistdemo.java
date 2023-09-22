package com.gentech.constchainingdemo;
class Reverse
{
	Reverse(int n,int sum)
	{
		while(n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println("reverse number:"+sum);
	}
}


public class Reversethenumberinagivenlistdemo {

	public static void main(String[] args) {
		Reverse obj1=new Reverse(456,0);

	}

}
