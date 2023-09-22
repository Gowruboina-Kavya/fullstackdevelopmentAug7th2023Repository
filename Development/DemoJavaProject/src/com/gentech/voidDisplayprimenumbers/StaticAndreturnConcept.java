package com.gentech.voidDisplayprimenumbers;
class Demo1
{
	//2D 3*3 char array in reverse order
	static char[][] reverse(char x[][])
	{
		char y[][] = new char[x.length][x[0].length];
		for (int i = 0; i <x.length; i++) {
			for (int j = 0; j <x[0].length; j++) {
				y[i][j] = x[x.length - i - 1][x[0].length - j - 1];
			}
		}
		return y;
	}
	
	
	//return concatenation result of 2D 3*3 char array
	static char[][] concat(char x[][], char y[][]) 
	{
		char result[][]=new char[3][6];

		for (int i =0;i<3;i++) {
			for (int j=0;j<3;j++) {
				result[i][j] =x[i][j];
				result[i][j+3]=y[i][j];
			}
		}
		return result;
	}
	
	
	//return the 1st row of elements from 2D 3*3 char array
	static char[] FirstRow(char x[][]) 
	{
		char y[]=new char[x[0].length];
		for (int i=0;i<x[0].length;i++) {
			y[i]=x[0][i];
		}
		return y;
	}

	//return 26 upper case alphabets
	static String Alphabets() 
	{
		char[] alphabet = new char[26];
		char cc = 'A';
		for (int i = 0; i < 26; i++) {
			alphabet[i] = cc;
			cc++;
		}
		return new String(alphabet);
	}
	
	
	//return 1st half of the upper case alphabets
	static String FirstHalfUppercaseAlphabets()
	{
		char[] result = new char[13];   
		for (int i=0;i<13;i++) {
			result[i]=(char) ('A'+i);
		}
		return new String(result);
	}
	static String SecondHalfUppercaseAlphabets() {
		char[] a = new char[13];
		int i=0;
		char currentChar='N';
		while (i<13) {
			a[i++] = currentChar++;
		}
		return new String(a);
	}
	
	
	
	/*	static char[] LowerCaseAlphabetsReverse() {
			char res[]=new char[]
			while (ch>='a') {
				System.out.print(ch);
				ch--;
			}
		}*/
	
	static boolean isPrime(int num) {
		if (num<2) {
			return false;
		}
		for (int i=2;i<=num;i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	//Prime numbers between 1 to 50
	static boolean isprime1(int num) {
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=1;
				break;
			}
		}
		if(flag==0)

			return true;
		else

			return false;
	}
	static int getprimenumbersum10(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(isprime1(i)==true)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	
	//return sum of prime no.s in between 1 to 100
	static int sumofprimes() {
		
		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean Prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					Prime = false;
					break;
				}
			}
			if (Prime) 
			{
				sum += i;
			}
		}
		return sum;
	}
	//return the 1st row of elements from 2D 3*3 char array
	static char[] ThirdRow(char x[][]) 
	{
		char y[]=new char[x[0].length];
		for (int i=0;i<x[0].length;i++) {
			y[i]=x[2][i];
		}
		return y;
	}
	//Secondhalf elements from 1D
	static String[] getsecondhalfelements(String[] str)
	{
		String s[]=new String[str.length];
		int k=0;
		for(int i=str.length/2;i<str.length;i++)
		{
			s[k]=str[i];
			k=k+1;
		}
		return s;
	}

}




public class StaticAndreturnConcept {

	public static void main(String[] args) {
		char[][] h= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		for(int i=h.length-1;i>=0;i--) {
			for(int j=h[i].length-1;j>=0;j--)
			{
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("******************");
		char[][] a={{'g', 'h', 'i'}, {'a', 'b', 'c'}, {'q', 'r', 's'}};
		char[][] b={{'k', 'l', 'm'}, {'d', 'e', 'f'}, {'t', 'u', 'v'}};
		char[][] c= Demo1.concat(a,b);
		System.out.println("concatenation: ");
		for (int i=0;i<3;i++) {
			for (int j=0;j<6;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("***********");
		char[][] g = {
				{'p', 'q', 'r'},
				{'s', 't', 'u'},
				{'v', 'w', 'x'}
		};
		System.out.println("1st row of elements: ");
		char[] fr =  Demo1.FirstRow(g);
		for (char e : fr) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("***************");
		String alphabets =  Demo1.Alphabets();
		System.out.println("26 upper case alphabets: ");
		System.out.println(alphabets+" ");
		System.out.println("***************");
		String firstHalf =  Demo1.FirstHalfUppercaseAlphabets();
		System.out.println("1st half of the uppercase alphabets: ");
		System.out.println(firstHalf);
		System.out.println("******************");
		String secondHalf =  Demo1.SecondHalfUppercaseAlphabets();
		System.out.println("2nd half of the upper case alphabets: ");
		System.out.println(secondHalf);
		System.out.println("**********************");
		System.out.println("lower case alphabets in reverse order: ");
		//sample1.LowerCaseAlphabetsReverse();
		System.out.println();
		System.out.println("**************************");
		System.out.println("print prime no.s from 1 to 50: ");
		//	sample1.PrintPrimes();


		System.out.println("*******************");
		System.out.println("sum of prime no.s from 1 to 100: ");
		int gg= Demo1.sumofprimes();
		System.out.println(gg+" ");
		System.out.println("********************");
		System.out.println("3st row of elements: ");
		
		char[][] y = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'}
		};
		char[] k =  Demo1.ThirdRow(y);
		for (char e : k) {
			System.out.print(e+" ");
		}
	
		









	}
}
