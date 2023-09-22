package com.gentech.Inheritenceassignments;
class student {
	String names;
	int rollno;
	int mobilenum;

	student(String firstname, int r, int cc) {
		names = firstname;
		rollno = r;
		mobilenum = cc;
		System.out.println("Super Class name : " + firstname);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class library extends student {
	String booknames;
	int rollno;
	int mobilenum;

	library(String bookname, int roll, int cc) {
		super(bookname, roll, cc);
		names = bookname;
		rollno = roll;
		mobilenum = cc;
		System.out.println("bookname : " +booknames);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + mobilenum);
	}
}

class addmission extends library{
	String names = "";
	int rollno;
	int mobilenum;

	addmission(String name,int r,int cc)
	{
		super(name,r,cc);
		names = name;
		rollno = r;
		mobilenum = cc;
		System.out.println("Child Class 2 name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " +mobilenum);
	}
}
public class MultilevelInheritencemorethantwovariables {

	public static void main(String[] args) {
		library obj = new library("kavya", 46, 560098);

	}

}
