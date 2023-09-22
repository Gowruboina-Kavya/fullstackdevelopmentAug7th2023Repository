package com.gentech.AbstractAssignmentsDemo;
abstract class university
{
	static void location(String loc)
	{
		System.out.println("location is:"+loc);
	}
	static void college(String clgname)
	{
		System.out.println("college name is:"+clgname);
	}
	static void branch(String branchname)
	{
		System.out.println("Branch name is:"+branchname);
	}
}

class School extends university
{
	
}
public class AbstractclassContainStaticMethosmorethantwo {

	public static void main(String[] args) {
		School obj=new School();
		obj.location("Ongole");
         obj.college("QIS Engineering College");
         obj.branch("ECE");
	}

}
