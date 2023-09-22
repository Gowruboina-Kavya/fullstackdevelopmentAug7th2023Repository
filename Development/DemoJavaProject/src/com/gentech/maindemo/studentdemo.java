package com.gentech.maindemo;

class Students
{
	String firstname;
	String lastname;
	int age;
	String address;
	String email;
}
class library
{
	String libname;
	int libid;
	int noofbooks;
	String authorname;
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;	

}

public class studentdemo {

	public static void main(String[] args) {
		Students kav=new Students();
		kav.firstname="kavya";
		kav.lastname="gowruboina";
		kav.age=21;
		kav.address="vijayanagar";
		kav.email="kavya@gmail.com";
		System.out.println("firstname:"+kav.firstname);
		System.out.println("lastname:"+kav.lastname);
		System.out.println("age:"+kav.age);
		System.out.println("address:"+kav.address);
		System.out.println("email:"+kav.email);
		System.out.println("+++++++++++++++++++++");
		library lib=new library();
		lib.libname="digital library";
		lib.libid=403;
		lib.noofbooks=1000;
		lib.authorname="rakesh";

		System.out.println(lib.libname);
		System.out.println(lib.libid);
		System.out.println(lib.noofbooks);
		System.out.println("authorname:"+lib.authorname);
		System.out.println("++++++++++++++++++");
		Sports sport=new Sports();
		sport.sportid=100;
		sport.sportname="cricket";
		sport.noofplayers=11;
		sport.coachname="virat";
		System.out.println(sport.sportid);
		System.out.println(sport.sportname);
		System.out.println(sport.noofplayers);
		System.out.println(sport.coachname);



	}

}
