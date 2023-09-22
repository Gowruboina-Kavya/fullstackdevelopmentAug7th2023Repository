package com.gentech.Inheritenceassignments;
class Maths1
{
	void addition(int a,int b,int c)
	{
		System.out.println("addition result:"+(a+b+c));
	}
}
class Maths2 extends Maths1
{
	void sum(int x,int y,int z)
	{
		System.out.println("sum result:"+(x+y+z));
	}
}
class Maths3 extends Maths2
{
	void average(int a,int b,int c)
	{
		System.out.println("average result:"+(a+b+c)/2);
	}
}

public class multilevelinheritencedemo {

	public static void main(String[] args) {
		Maths3 obj=new Maths3();
		obj.average(4, 5, 6);
		obj.sum(4, 8, 9);
		obj.addition(3,5,6);

	}

}
