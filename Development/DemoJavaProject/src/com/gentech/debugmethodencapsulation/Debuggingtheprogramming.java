package com.gentech.debugmethodencapsulation;
class maths1
{
	static maths1 obj=null;
	private maths1()
	{
		//it is private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication result:"+res);
	}
	public static maths1 getInstance()
	{
		if(obj==null)
		{
			obj=new maths1();

		}
		return obj;
	}
}

public class Debuggingtheprogramming {

	public static void main(String[] args) {
		maths1 o1=maths1.getInstance();
		o1.addition(10,20);
		o1.multiplication(5,10);


		maths1 o2=maths1.getInstance();
		o2.addition(5, 15);
		o2.multiplication(10, 2);

		maths1 o3=maths1.getInstance();
		o3.addition(10, 5);
		o3.multiplication(5,15);


	}

}
