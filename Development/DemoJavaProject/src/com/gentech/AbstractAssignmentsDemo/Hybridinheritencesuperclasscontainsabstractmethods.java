package com.gentech.AbstractAssignmentsDemo;
abstract class School1
{
	abstract void showSchoolname(String Schlname);
	abstract void displayChild(String Childname);

}
class playground extends School1
{
	void showSchoolname(String Schlname)
	{
		System.out.println("Schoolname in super class is:"+Schlname);
	}
	void displayChild(String Childname)
	{
		System.out.println("Child nmae in subclass1 is:"+Childname);
	}
}

class canteen extends playground
{
	void displayCanteen(String Canteenname)
	{
		System.out.println("Canteen name in subclass2 is:"+Canteenname);
	}

}
class teacher extends School1
{
	void showSchoolname(String Schlname)
	{
		System.out.println("School name is:"+Schlname);
	}
	void displayChild(String Childname)
	{
		System.out.println("Child name is:"+Childname);
	}
}
public class Hybridinheritencesuperclasscontainsabstractmethods {

	public static void main(String[] args) {
		teacher obj=new teacher();
		obj.showSchoolname("Vikas Public School");
		obj.displayChild("Ravi Varma");
	}

}
