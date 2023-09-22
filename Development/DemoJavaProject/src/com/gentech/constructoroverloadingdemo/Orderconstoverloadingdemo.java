package com.gentech.constructoroverloadingdemo;
class Orders
{
	Orders(String type,String name ,String Customername)
	{
		System.out.println("type:"+type);
		System.out.println("name:"+name);
		System.out.println("Customername:"+Customername);
	}
	Orders(int Orderid)
	{
		System.out.println("Orderid:"+Orderid);

	}
}


public class Orderconstoverloadingdemo {
	public static void main(String[] args) {
		Orders obj1= new Orders(21);
		Orders obj2=new Orders("Offline","jeans","swetha");	

	}

}
