package com.gentech.maindemo;
class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
	String address;
}
class Dept
{
	String deptname;
	int deptno;
	String address;
}
class insurence
{
	int insid;
	String instype;
	int amount;
}
public class employeedemo {
	public static void main(String[]args) {
		Emp kavya=new Emp();
		kavya.empfirstname="kavya";
		kavya.emplastname="gowruboina";
		kavya.empno=1;
		kavya.address="vijayanagar";
		kavya.empemail="kavya@gmail.com";
		System.out.println(kavya.empfirstname);
		System.out.println(kavya.emplastname);
		System.out.println(kavya.empemail);
		System.out.println(kavya.empno);
		System.out.println(kavya.address);
		System.out.println("+++++++");
		Dept ece=new Dept();
		ece.deptname="software";
		ece.deptno=10;
		ece.address="banglore";
		System.out.println(ece.deptname);
		System.out.println(ece.deptno);
		System.out.println(ece.address);
		System.out.println("+++++++++++");
		insurence insure=new insurence();
		insure.insid=40;
		insure.instype="health";
		insure.amount=10000;
		System.out.println(insure.insid);
		System.out.println(insure.instype);
		System.out.println(insure.amount);
	}
}




