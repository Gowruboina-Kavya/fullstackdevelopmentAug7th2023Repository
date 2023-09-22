package com.gentech.constchainingdemo;
class Vowels
{
	Vowels(char ch)
	{
		switch(ch)
		{
		case 'a':case 'A':
			System.out.println("vowel:"+ch);
			break;
		case 'e':case 'E':
			System.out.println("vowel:"+ch);
			break;
		case 'i':case 'I':
			System.out.println("vowel:"+ch);
			break;
		case 'o':case 'O':
			System.out.println("vowel:"+ch);
			break;
		case 'u':case 'U':
			System.out.println("vowel:"+ch);
			break;
		default:
			System.out.println("consonant:"+ch);
		}
	}
}

public class characterisvowelornot {
	public static void main(String[] args) {
		Vowels obj1=new Vowels('s');



	}

}

