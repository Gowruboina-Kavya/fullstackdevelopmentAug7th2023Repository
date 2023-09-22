package com.gentech.methodsdemo;
class AndOrNot
{
	void And(boolean x,boolean y)
	{
		boolean v1=(x&&y);
		System.out.println(v1);
	}
	
void Or(boolean x,boolean y)
{
	boolean v1=(x||y);
			System.out.println(v1);
}
void Not(boolean x,boolean y)
{
	boolean v1=(x!=y);
	System.out.println(v1);
}
}
public class AndOrNotdemo {

	public static void main(String[] args) {
		AndOrNot obj=new AndOrNot();

		obj.And(true,false);
		obj.Or(true,false);
		obj.Not(true,false);
		
		
	}

}
