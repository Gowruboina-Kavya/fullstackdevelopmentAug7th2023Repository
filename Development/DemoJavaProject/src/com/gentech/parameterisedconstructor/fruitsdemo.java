package com.gentech.parameterisedconstructor;
class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
	Fruits(String fname,int quan,String sn,int pr)
	{
		fruitname=fname;
		price=pr;
		shopname=sn;
		quantity=quan;
		System.out.println(fruitname);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println("+++++++++++");
	}
}
class Flowers
{
	String flowername;
	int quantity;
	int price;
	String shopname;
	Flowers(String fname,int quan,int pr,String sn)
	{
		flowername=fname;
		price=pr;
		shopname=sn;
		quantity=quan;
		System.out.println(flowername);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println("+++++++++++");

	}
}
class Vegtables
{
	String vegtablename;
	int quantity;
	int price;
	String shopname;
	Vegtables(String vegname,int quan,int pr,String sn)
	{
		vegtablename=vegname;
		price=pr;
		shopname=sn;
		quantity=quan;
		System.out.println(vegtablename);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
	}
}
public class fruitsdemo {

	public static void main(String[] args) {
		Fruits fruit=new Fruits("orange",1,"raj",200);
		Flowers flower=new Flowers("sunflower",1,20,"ram");
		Vegtables veg=new Vegtables("carrot",1,50,"xyz");





	}

}
