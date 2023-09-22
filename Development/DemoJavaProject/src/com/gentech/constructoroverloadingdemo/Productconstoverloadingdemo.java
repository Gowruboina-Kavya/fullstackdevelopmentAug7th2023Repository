package com.gentech.constructoroverloadingdemo;
class Products
{
	Products(String Productname)
	{
		System.out.println("Productname:"+Productname);
	}
	Products(int Productid)
	{
		System.out.println("Productid:"+Productid);
	}
}

public class Productconstoverloadingdemo {

	public static void main(String[] args) {
		Products obj1=new Products("buds");
		Products obj2=new Products(21);


	}

}
