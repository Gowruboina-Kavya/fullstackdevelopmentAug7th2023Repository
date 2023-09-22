package com.gentech.parameterisedconstructor;
class Student
{
	int studid;
	String studfirstname;
	String studlastname;
	String studemail;
	long studmobileno;
	Student(int studrno,String studfname,String studlname,String studem,long studmno)
	{
		studid=studrno;
		studfirstname=studfname;
		studlastname=studlname;
		studemail=studem;
		studmobileno=studmno;
		System.out.println(studfirstname);
		System.out.println(studlastname);
		System.out.println(studemail);
		System.out.println(studid);
		System.out.println(studmobileno);
		System.out.println("+++++++");
	}
}
class Library
{
	int libid;
	String libname;
	int noofbooks;
	String clgname;
	Library(int libno,String libn,int nfb,String clgn)
	{
		libid=libno;
		libname=libn;
		noofbooks=nfb;
		clgname=clgn;
		System.out.println(libid);
		System.out.println(libname);
		System.out.println(noofbooks);
		System.out.println(clgname);
		System.out.println("+++++++++++");
	}
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;
	Sports(int sptid,String sptn,int nop,String cn)
	{
		sportid=sptid;
		sportname=sptn;
		noofplayers=nop;
		coachname=cn;
	}
}


public class studentsdemo {
	public static void main(String[] args) 
	{
		Student vandhu=new Student(10,"kavya","sangeetam","kavya@gmail.com",123456789);
		Library lib=new Library(100,"wildcart",1000,"rise");
		Sports sport=new Sports(11,"cricket",11,"raj");

	}

}


