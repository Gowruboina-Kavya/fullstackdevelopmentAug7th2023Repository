package com.gentech.blockspractice;
abstract class Demo1
{
	static
	{
		
		System.out.println("welocme");
	}
}
 class demo2 extends Demo1
{
	static
	{
		System.out.println("how are you");
	}
}

public class BlocksDemo {
	public static void main(String[] args) {
		demo2 obj=new demo2();
		
		
	}

}
