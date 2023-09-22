package com.gentech.AbstractAssignmentsDemo;
abstract class peolple
{
	String Name;
	int id;
	String gender;
	peolple(String Name,int id,String gender)
	{
		System.out.println("the name of the student in super class:" +Name);
		System.out.println("the id of the student in super class:" +id);
		System.out.println("the gender of the student in super class:" +gender);

	}
}
abstract class student2 extends peolple
{
	student2(String Name,int id,String gender)
	{
		super(Name,id,gender);
		System.out.println("the name in sub1 class:"+ Name);
		System.out.println("the id in sub1 class:"+ id);
		System.out.println("the gender in sub1 class:"+ gender);
	}
}
class library3 extends student2 
{
	library3(String Name,int id,String gender)
	{
		super(Name,id,gender);
		System.out.println("the name in sub2 class:"+ Name);
		System.out.println("the id in sub2 class:"+ id);
		System.out.println("the gender in sub2 class:"+ gender);	
		}
}

public class multilevelconstructoroverloading {

	public static void main(String[] args) {
		library3 obj1=new library3("kavya",468,"controlsystem");
		

	}

}




