package com.gentech.Inheritenceassignments;
class prob1
{
	void average(int a,int b,int c)
	{
		System.out.println("average"+(a+b+c)/2);
	}
} 
class prob2 extends prob1
{
	void count(int a)
	{
		System.out.println("count value is:"+a);
	}
}

public class SimpleInheritenceDemonstrationDemo {

	public static void main(String[] args) {
		prob2 obj=new prob2();
		obj.average(2,3,6);
		obj.count(10);

	}
}



