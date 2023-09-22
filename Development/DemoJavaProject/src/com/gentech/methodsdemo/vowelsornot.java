package com.gentech.methodsdemo;
class Vowels
{
	void Vowel(char ch)
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

void Array(char ch[][])
{
	for(int i=ch.length-1;i>=0;i--)
	{
		for(int j=ch[i].length-1;j>=0;j--)
		{
			System.out.print(ch[i][j]);
		}
		System.out.println();
}
}

void Reverse(int x[])
{
	int y[]=new int[x.length];
	int k=0;
	{
	for(int i=0;i<x.length;i++)
	{
		y[i]=x[i];
		k++;
}
for(int j=(y.length-1/2);j>=0;j--)
				
{
	System.out.println(y[j]+" ");
}
	
}



public class vowelsornot {

	public static void main(String[] args) {
		Vowels obj1=new Vowels();
		obj1.Vowel('e');
		obj1.Vowel('s');
		obj1.Vowel('o');
		char ch[][]= {{'a','b','c'},{'x','y','z'}};
		obj1.Array(ch);
		int x[]= {2,3,4,5,6,7};	
		obj1.Reverse(x);
	}
}
}
}

		
		


	
