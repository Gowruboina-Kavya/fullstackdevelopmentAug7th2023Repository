package com.gentech.AbstractAssignmentsDemo;
abstract class Animal
{
	abstract void showAnimalname(String Animalname);
	abstract void displaypet(String petname);
}
class forest extends Animal
{
	void showAnimalname(String Animalname)
	{
		System.out.println("Animalname in super class is:"+Animalname);
	}
	void displaypet(String petname)
	{
		System.out.println("Petname in subclass1 is:"+petname);
	}
}
class  tree extends forest
{
	void displaytree(String treename)
	{
		System.out.println("Tree name in subclass2 is:"+treename);
	}
}

public class MultilevelInheritencecontainsabstractmethods {

	public static void main(String[] args) {
		tree obj=new tree();
		obj.displaytree("Baniyan tree");
		
		forest obj1=new forest();
		obj.displaypet("Dog");
		obj.showAnimalname("lion");

	}

}
