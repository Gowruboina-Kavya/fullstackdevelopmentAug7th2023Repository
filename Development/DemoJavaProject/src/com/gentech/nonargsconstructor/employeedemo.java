package com.gentech.nonargsconstructor;
class Emp
{
	String empfirstname;
	String emplastname;
	String empemail;
	String address;
	Emp()
	{
		empfirstname="kavya";
		emplastname="gowruboina";
		address="vijayanagar";
		empemail="kavya@gmail.com";
		System.out.println(empfirstname);
		System.out.println(emplastname);
		System.out.println(empemail);
		System.out.println(address);
	}
}
class Dept
{
	String deptname;
	int deptno;
	String address;
	Dept(){

		deptname="software";
		deptno=10;
		address="banglore";
		System.out.println(deptname);
		System.out.println(deptno);
		System.out.println(address);
	}
}
class insurence
{
	int insid;
	String instype;
	int amount;
	insurence()
	{
		insid=40;
		instype="health";
		amount=10000;
		System.out.println(insid);
		System.out.println(instype);
		System.out.println(amount);
	}
}
public class employeedemo {
	public static void main(String[]args) {
		Emp kavya=new Emp();
		Dept ece=new Dept();
		insurence insure=new insurence();

	}
}






