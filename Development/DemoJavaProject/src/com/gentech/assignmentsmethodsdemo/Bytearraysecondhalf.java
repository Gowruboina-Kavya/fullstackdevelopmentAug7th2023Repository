package com.gentech.assignmentsmethodsdemo;
//for the given byte array read second half of the elements
class Methods
{
	void ByteArray(byte a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("++++++++++++");
	}

//for the given 1D  short array read first half of the elements
	void ShortArray(short a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("++++++++++");
	}
//for the given integer array read first half of the elements in reverse order
	void IntArray(int a[])
	{
		int b[]=new int[a.length];
		int k=0;
		for( int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k++;
		}
		for(int j=0;j<a.length/2;j++)
		{
			System.out.print(b[j]+" ");
		}
		System.out.println();


	}
//for the given character array concatenate all the characters
	void Concate(char a[],char b[])
	{
		int size=a.length+b.length;
		char x[]=new char[size];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			x[a.length+j]=b[j];
		}
		for(char c:x)
			System.out.print(c);

	}
//for the given 1D string array read the elements in reverse order 
	void StringArray(String a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");

		}
	}
//for the given 1D integer array find the sum of all the elements
	void Intsum(int s[])
	{
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		System.out.println(sum);
	}
//for the given 1D character array display vowels separetly
	void Vowels(char ch[])
	{ 
		for( int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case 'a':case 'A':
				System.out.println("vowel:"+ch[i]);
				break;
			case 'e':case 'E':
				System.out.println("vowel:"+ch[i]);
				break;
			case 'i':case 'I':
				System.out.println("vowel:"+ch[i]);
				break;
			case 'o':case 'O':
				System.out.println("vowel:"+ch[i]);
				break;
			case 'u':case 'U':
				System.out.println("vowel:"+ch[i]);
				break;
			default:
				continue;
			}

		}
	}
//for the given 2D integer array read last row of the elements
	void Readlastrow(int a[][])
	{
		for(int i=0;i<a[2].length;i++)
		{
			System.out.print(a[i][2]+" ");
		}
	}
//for the given 2Darrayinteger find the sum of the elements in only 1st row
	void Sumofelement(int a[][])
	{
		int sum=0;
		for(int i=0;i<a[0].length;i++)
		{
			sum=sum+a[i][0];

		}
		System.out.print(+sum);
	}
//write a method substraction of two matrixes display  the result in reverseorder
	void Subratraction(int a[][],int b[][])
	{
		if((a.length==b.length)&&(a[0].length==b[0].length))
		{
			int sub[][]=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sub[i][j]=a[i][j]-b[i][j];
				}
				System.out.println();
			}
			for(int i=sub.length-1;i>=0;i--)
			{
				for(int j=sub[i].length-1;j>=0;j--)
				{
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}

		}
	}
//for the given 1d integer array square the each element and find the sum
	void SquareElements(int a[])
	{
		int sq[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			sq[k]=a[i]*a[i];
			k++;
		}
		int sum=0;
		for(int i=0;i<sq.length;i++)
		{
			sum=sum+sq[i];
		}
		System.out.println(+sum);
	}
//for the given 2D string array concatenate all the elements
	void concat(String str[][])
	{
		String s="";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++ )
			{
				s=s+str[i][j];
			}
		}
	System.out.print(s);
}
}
public class Bytearraysecondhalf {

	public static void main(String[] args) {
		Methods obj=new Methods();
		System.out.println("byte array is:");
		byte x[]= {1,2,3,4,5,6,7,8};
		obj.ByteArray(x);

		short a[]= {1,2,4,6,8,9};
		obj.ShortArray(a);
		System.out.println("intarray is:");
		int y[]= {10,20,30,40,50,60,70,80,90};
		obj.IntArray(y);

		char c[]= {'a','b','c'};
		char b[]= {'g','h','f'};
		obj.Concate(c,b);
		System.out.println();


		String s[]= {"kavya","ravi","raghava","preethi"};
		obj.StringArray(s);
		System.out.println();


		int k[]={1,2,3,4,5,6,7,8};
		obj.Intsum(k);


		char h[]= {'a','s','o','f','i'};
		obj.Vowels(h);

		System.out.println();
		System.out.println("last row elements is");
		int d[][]= {{2,3,4},
				{3,4,5}, 
				{6,7,8}};
		obj.Readlastrow(d);

		System.out.println();
		System.out.println("first row elements is :" );
		int p[][]= {{3,4,4},
				{5,6,7},
				{8,9,2}};
		obj.Sumofelement(p);

		System.out.println();
		System.out.println("substraction o elements is:");
		int m[][]= {{3,4,5},{6,7,8},{3,4,5}};
		int n[][]= {{1,2,3},{4,5,6},{7,8,9}};
		obj.Subratraction(m,n);
		System.out.println();
		System.out.println("sauare of number is:");
		int g[]= {2,3,4,5,6,6,7};
		obj.SquareElements(g);

		System.out.println();
		System.out.println("concate string is:");
		String v[][]= {{"kavya","kavitha"},{"sapna","preethi","hari"}};
		obj.concat(v);
	}

}




