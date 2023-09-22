package com.gentech.Interfaces;
interface temple
{
	void showtemplename(String name);
}
interface templeloc extends temple
{
	void showtempleloc (String loc);
}
interface count extends templeloc 
{
	void showcount(String count);
}
class temple1 implements templeloc
{
	public void showtemplename(String name)
	{
		System.out.println("temple name is :"+name);
	}
	public void showtempleloc(String name)
	{
		System.out.println("temple location is :"+name);
	}
}
class temple2 implements count
{
	public void showtemplename(String name)
	{
		System.out.println("temple name is :"+name);
	}
	public void showtempleloc(String name)
	{
		System.out.println("temple location is :"+name);
	}
	public void showcount(String count)
	{
		System.out.println("people count in temple is :"+count);
	}
}

public class hierachicalinterface {
	public static void main(String[]args) {
		temple1 obj1=new temple1();
		obj1.showtemplename("maruthi");
		obj1.showtempleloc("Bangalore");
		System.out.println("************************");

		temple2 obj2=new temple2();
		obj2.showtemplename("sai baba");
		obj2.showtempleloc("ongole,layerpet");
		obj2.showcount(" too rush");

	}
}


	

