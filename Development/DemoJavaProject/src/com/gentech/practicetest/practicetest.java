package com.gentech.practicetest;
//1question
class array
{
	String array()
	{
		String s[]= {"apple","mango","Orange","banana"};
		return s[0];
	}
}
//2nd question
class intarray
{
	int[][] intarray()
	{
		int s[][]= {{1,4,5},{6,7,8}};
		return s;
	}
}
//3question

class circle
{
	double circlerad(int r)
	{
		double a=3.14*r*r;
		return a;
	}
}
//4question
class Native
{
	String NativePlace()
	{
		String n="Ongole";
		return n;
	}
}
//5 question
class cube
{
	int cubenum(int n) 
	{
		int i=n*n*n;
		return i;
	}
}
// 6 question
class price
{
	int pricebook()
	{
		int g=35;
		return g;
	}
}

//7question
class sum
{
	static int intarray()
	{
		int sum=0;
		int l[]= {2,4,6,8,10};
		for(int i=0;i<l.length;i++)
		{
			sum=sum+l[i];
		}
		return sum;
	}
}


//8question
class divby3
{
	int numberby3(int num)
	{
		int count=0;
		for(int i=40;i<=80;i++)
		{
			if(i%3==0)
			{

				System.out.println(count+" ");
				count=count+1;
				//return count;
			}
		}
	}
	
}
//9question
class inttochar
{
	char convert(int n)
	{
		char s=(char )n;
		return s;
	}

	//10question
	static char[][] chararray()
	{
		char j[][]= {{'g','h','k'},{'n','m','o'}};
		return j;
	}
	//11question
	static int conv(char k)
	{
		int t=(int)k;
		return t;
	}
	//12question
	static String[] Strarray()
	{
		String d[]= {"singing","dancing","cooking"};
		return d;
	}

	// 13question
	static double average()

	{
		double avg=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;

		}
		avg=sum/10;
		return avg;

	}

	//14question
	static int factoial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;

		}
		return fact;
	}
	//15question
	static double division(int x,int y)
	{
		double div=x/y;
		return div;
	}


	//16question
	static int[]  even()
	{
		int p[]= {10,12,14,16,18,20};
		return p;
	}

	//17question
	static int [] oddnum()
	{
		int b[]={1,3,5,7,9};
		return b;
	}

	//18question
	static int fivesum()
	{

		int sum=0;
		int v[]= {1,2,3,4,5};
		for(int i=0;i<v.length;i++)
		{
			sum=sum+v[i];
		}
		return sum;

	}

	//19question
	int multiplication(int a,int b,int c)
	{
		int k=a*b*c;
		return k;
	}

	//20question
	static char[] array()
	{
		char o[]= {'e','f','g','h','i'};
		return o;
	}

	//21question
	String[] arrayfriend()
	{
		String d[]= {"hari","bhargavi","divya","preethi","ramya"};
		return d;
	}

	//22question




	//24question
	byte[] intarray()
	{
		byte n[]= {2,3,4,5,6,7,8};
		return n;
	}


	//25 question
	String[] Stringarray()
	{
		String v1[]= {"apple","mango","Orange","banana"};
		return v1;
	}

}

public class practicetest {

	public static void main(String[] args) {
		array obj=new array();
		String x=obj.array();
		System.out.println(x+" is first element");

		//2question
		System.out.println("int 2D array is:");
		intarray ob1=new intarray();
		int a[][]=ob1.intarray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


		//3 question
		System.out.println("Area of triangle is:");
		circle o2=new circle();
		double  k=o2.circlerad(4);
		System.out.println(k+" ");

		//4question
		System.out.println("native place is:");
		Native o3=new Native();
		String b=o3.NativePlace();
		System.out.println(b+" is my native place");

		//5question
		System.out.println("cube of a number is:");
		cube o4=new cube();
		int h=o4.cubenum(5);
		System.out.println(h+"is cube of the number");


		// 6question
		System.out.println("notebook price is:");
		price o5=new price();
		int f=o5.pricebook();
		System.out.println(f+" is the book price");

		//7question
		int d =sum.intarray();
		System.out.println(d);
		//System.out.println(s+" ");



		//8
		divby3 o8=new divby3();
		int dd=o8.numberby3();

		//9question
		System.out.println("character to int is:");
		inttochar o9=new inttochar();
		char v=o9.convert(4);
		System.out.println(v+" ");


		//10question
		System.out.println("2d character array is:");
		char r[][]=inttochar.chararray();
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}


		//11question
		System.out.println("char to int convert is:");
		int j=inttochar.conv('l');
		System.out.println(j+" ");


		//12question
		System.out.println("hobbies is:");
		String u[]=inttochar.Strarray();
		for(int i=0;i<u.length;i++)
		{
			System.out.print(u[i]+" ");
		}
		System.out.println();


		//13question
		System.out.println("Average of the number is:");
		double q=inttochar.average();
		System.out.println(q+" ");

		//14 question
		System.out.println("factorial of a number is:");
		int w=inttochar.factoial(5);
		System.out.println(w+" ");


		//15question
		System.out.println("division of two numbers is:");
		double z=inttochar.division(4, 2);
		System.out.println(z+" ");

		//16question
		System.out.println("even numbers is:");
		int m[]=inttochar.even();
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+" ");
		}
		System.out.println();

		//17question
		System.out.println("first five odd numbers is:");
		int s[]=inttochar.oddnum();
		for(int ee:s)
		{
			System.out.print(ee+" ");
		}
		System.out.println();

		//18question
		System.out.println("first five numbers sum is:");
		int e=inttochar.fivesum();

		System.out.println(e+" ");
		System.out.println("************");

		//19question
		System.out.println("multiplication result is:");
		inttochar o19=new inttochar();
		int y=o19.multiplication(4, 6, 8);
		System.out.println(y+" ");


		//20question
		System.out.println("1d character array is:");
		char p[]=inttochar.array();
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}

		System.out.println();

		//21question
		System.out.println("Bestfriends names is: ");
		inttochar o21=new inttochar();
		String c[]=o21.arrayfriend();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();

		//22


		//24question
		System.out.println("byte array is:");
		//inttochar o24=new inttochar();
		byte g[]=o21.intarray();
		for(int i=0;i<=g.length;i++)
		{
			System.out.print(g[i]+" ");

		}
		System.out.println();
	




	//25question

	//inttochar o25=new inttochar();








}



