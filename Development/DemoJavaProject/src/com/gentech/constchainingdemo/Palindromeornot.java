package com.gentech.constchainingdemo;
class Palindrome
{
	Palindrome(int n,int sum,int temp )
	{
		temp=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}


}
public class Palindromeornot {

	public static void main(String[] args) {
		Palindrome obj1=new Palindrome(123,0,0);
		Palindrome obj2=new Palindrome(121,0,0);
		Palindrome obj3=new Palindrome(125,0,0);
		Palindrome obj4=new Palindrome(323,0,0);

	}

}
