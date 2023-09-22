package com.gentech.constchainingdemo;
class Alphabetornot
{
	Alphabetornot(char ch)
	{
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+":Alphabet");
		}
		else
		{
			System.out.println(ch+":is not an alphabet");
		}

	}
}

public class characterisalphabetornot {

	public static void main(String[] args) {
		Alphabetornot obj=new Alphabetornot('e');
		Alphabetornot obj1=new Alphabetornot('2');

	}

}
