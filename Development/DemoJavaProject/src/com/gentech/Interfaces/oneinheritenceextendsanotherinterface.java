package com.gentech.Interfaces;
interface canteen
{
	void showcanteenname(String name);
}
interface Address extends canteen
{
	abstract void showaddress(String Address);
}
interface address1 extends canteen
{
	abstract void showaddress(String address);
}
class college1 implements address1
{
	public void showcanteenname(String cname)
	{
		System.out.println("canteen name is:"+cname);
	}
	public void showaddress(String address)
	{
		System.out.println("address is:"+address);
	}
	public void showcollege(String college)
	{
		System.out.println("college name is:"+college);
	}
}

public class oneinheritenceextendsanotherinterface {

	public static void main(String[] args) {
		college1 obj=new college1 ();
		obj.showcanteenname("Annapurna canteen");
		obj.showaddress("ONGOLE");
		obj.showcollege("QIS ENgineering college");

	}



}
