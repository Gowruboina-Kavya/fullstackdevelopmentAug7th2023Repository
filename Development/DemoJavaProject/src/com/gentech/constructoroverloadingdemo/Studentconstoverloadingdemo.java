package com.gentech.constructoroverloadingdemo;
class Student
{
	Student(String Studfname,String email,String studlname)
	{
		System.out.println("studentname:"+Studfname);
		System.out.println("studentmail:"+email);
		System.out.println("studname:"+studlname);

	}
	Student(int rollno)
	{
		System.out.println("rollno:"+rollno);
	}
	Student(long mobileno)
	{
		System.out.println("mobileno:"+mobileno);
	}
}

public class Studentconstoverloadingdemo {

	public static void main(String[] args) {
		Student obj1=new Student("kavya","kavya@gmail.com","Gowruboina");
		Student obj2=new Student(21);
		Student obj3=new Student(939092410);
	}
}
