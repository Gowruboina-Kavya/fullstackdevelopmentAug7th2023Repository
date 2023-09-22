package com.gentech.Polymorphisimassignments;
abstract class food
{
	abstract void order();
}
class item extends food
{
	void order()
	{
		String itemname="chilly chicken";
		int item_id=10;
		String deliverin="online mode";
		String hname="Amma hotel";
		System.out.println("item name is"+itemname);
		System.out.println("item id is:"+item_id);
		System.out.println("Delivered item is in :");
		System.out.println("Hotel name is:"+hname);
		System.out.println("***************************");
		
	}
}
class item1 extends food
{
	void order()
	{
		String itemname1="pizza";
		int item_id=11;
		String deliverin="offline mode";
		String hname="Ravi varma's hotel";
		System.out.println("item name is"+itemname1);
		System.out.println("item id is:"+item_id);
		System.out.println("Delivered item is in :");
		System.out.println("Hotel name is:"+hname);
		System.out.println("***************************");
		
	}
}
class item2 extends food
{
	void order()
	{
		String itemname1="Biriyani";
		int item_id=12;
		String deliverin="transport mode";
		String hname="sravani hotel";
		System.out.println("item name is"+itemname1);
		System.out.println("item id is:"+item_id);
		System.out.println("Delivered item is in :");
		System.out.println("Hotel name is:"+hname);
		System.out.println("***************************");
		
	}
}


public class cookingfood {

	public static void main(String[] args) {
		food restaurents=null;
		
		item obj=new item();
		item1 obj1=new item1();
		item2 obj2=new item2();
		
		
		restaurents=obj;
		restaurents.order();
		restaurents=obj1;
		restaurents.order();
		restaurents=obj2;
		restaurents.order();

	}

}
