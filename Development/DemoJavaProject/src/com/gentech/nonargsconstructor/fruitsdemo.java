package com.gentech.nonargsconstructor;


class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
	Fruits()
	{
		fruitname="pineapple";
		price=100;
		shopname="siva";
		quantity=2;
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
	Flowers()
	{
		flowername="sunflower";
		price=100;
		shopname="sandhya";
		quantity=2;
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
	Vegtables()
	{
		vegtablename="carrot";
		price=100;
		shopname="market";
		quantity=2;
		System.out.println(vegtablename);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
	}
}

public class fruitsdemo {

	public static void main(String[] args) {
		Fruits fruit=new Fruits();


		Flowers flower=new Flowers();
		Vegtables veg=new Vegtables();
	}
}



