package com.gentech.methodsdemo;
class Numbers
{
	void Forloop(int i)
	{
		for(i=50;i>=40;i--)
		{
			System.out.println(i);
		}
	}

	void Whileloop(int i)
	{
		i=50;
		while(i>=40)
		{
			System.out.println(i);
			i--;
		}

	}
	void DoWhileloop(int i)
	{
		i=50;
		do
		{
			if(i>=40)
			{
				System.out.println(i);
			}
			i--;
		}while(i>=40);
	}
}


public class Printnum50to40 {

	public static void main(String[] args) {
		Numbers obj1=new Numbers();
		obj1.Forloop(50);
		obj1.Whileloop(50);
		obj1.DoWhileloop(50);

	}
}

