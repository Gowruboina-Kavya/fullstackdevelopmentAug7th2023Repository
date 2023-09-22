package com.gentech.parameterisedconstructor;
class Desktop
{
	int desktopid;
	String Desktopname;
	int  version;
	int noofdesktops;
	int ram;
	int storage;
	Desktop(int deskid,String deskn,int ver,int nod,int gb,int store)
	{
		desktopid=deskid;
		Desktopname=deskn;
		storage=store;
		ram=gb;
		version=ver;
		System.out.println(desktopid);
		System.out.println(Desktopname);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
		System.out.println("++++++++++");	
	}

}
class Laptop
{
	int laptopid;
	String Laptopname;
	int version;
	int nooflaptops;
	int ram;
	int storage;	
	Laptop(int lapid,String lapn,int ver,int nol,int gb,int store)
	{
		laptopid=lapid;
		Laptopname=lapn;
		storage=store;
		ram=gb;
		version=ver;
		System.out.println(laptopid);
		System.out.println(Laptopname);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
		System.out.println("++++++++++");
	}
}
class Mobiledevices
{
	int mobileid;
	String mobilename;
	int version;
	int noofmobiles;
	int ram;
	int storage;
	Mobiledevices(int mid,String mn,int ver,int nom,int gb,int store)
	{
		mobileid=mid;
		mobilename=mn;
		storage=store;
		ram=gb;
		version=ver;
		System.out.println(mobileid);
		System.out.println(mobilename);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
	}
}

public class laptopdemo {

	public static void main(String[] args) {
		Desktop desktops=new Desktop(10,"hp",5,1000,6,128);
		Laptop lap=new Laptop(11,"hp",5,1000,8,128);
		Mobiledevices mobile=new Mobiledevices(12,"oneplus",13,100,6,128);


	}

}
