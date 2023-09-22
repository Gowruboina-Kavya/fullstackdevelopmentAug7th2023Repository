package com.gentech.superclassinheritence; 
class student
{
	String firstname;
	int id;
	void show(String firstname,int id)
	{
		System.out.println("firstname in superclass:"+firstname);
		System.out.println("student Id is:"+id);
	}
	
}
class library extends student
{
	library(String name,int id)
	{
		super.show(name,id);
			
	}
	
	void show(String name,int id)
	{
		System.out.println("firstname in subclass:"+name); 
		System.out.println("library id:"+id);
		
	}
}
class faculty extends library
{
	faculty(String name,int id)
	{
		super(name,id);
		super.show(name,id);
	}
	//String firstname;
	//int id;
	void show(String name,int id)
	{
		System.out.println("firstname in subclass2:"+name);
		System.out.println("faculty id is:"+id);
	}
}

public class MultilevelInheritenceassign1 {

	public static void main(String[] args) {
	faculty obj=new faculty("control system",10);
	//obj.firstname="kavya";
	obj.show("kavya",68);
	
    
	}

}
