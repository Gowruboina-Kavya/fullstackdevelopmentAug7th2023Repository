package com.gentech.nonargsconstructor;


class Students
{
	String firstname;
	String lastname;
	int age;
	String address;
	String email;
	Students()
	{
		firstname="kavya";
		lastname="gowruboina";
		age=21;
		address="vijayanagar";
		email="kavya@gmail.com";
		System.out.println("firstname:"+firstname);
		System.out.println("lastname:"+lastname);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
		System.out.println("email:"+email);
		System.out.println("+++++++++++++++++++++");
	}
}
class library
{
	String libname;
	int libid;
	int noofbooks;
	String authorname;
	library()
	{
		libname="digital library";
		libid=403;
		noofbooks=1000;
		authorname="rakesh";

		System.out.println(libname);
		System.out.println(libid);
		System.out.println(noofbooks);
		System.out.println("authorname:"+authorname);
		System.out.println("++++++++++++++++++");
	}
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;
	Sports()
	{
		sportid=100;
		sportname="cricket";
		noofplayers=11;
		coachname="virat";
		System.out.println(sportid);
		System.out.println(sportname);
		System.out.println(noofplayers);
		System.out.println(coachname);

	}

}

public class studentdemo {

	public static void main(String[] args) {
		Students kav=new Students();

		library lib=new library();

		Sports sport=new Sports();



	}

}



