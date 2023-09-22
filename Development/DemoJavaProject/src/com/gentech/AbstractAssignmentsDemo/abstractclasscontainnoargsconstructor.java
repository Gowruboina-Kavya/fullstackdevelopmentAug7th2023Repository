package com.gentech.AbstractAssignmentsDemo;
abstract class student
{
	String Studentname;
	student()
	{
	  Studentname="kavya";
	  System.out.println("student name is:"+Studentname);
	}
}
class faculty extends student
{
	
}

public class abstractclasscontainnoargsconstructor {

	public static void main(String[] args) {
		faculty obj=new faculty();

	}

}
