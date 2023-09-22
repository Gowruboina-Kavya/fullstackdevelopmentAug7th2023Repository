package com.gentech.Inheritenceassignments;
class animal1 
{
	void eat() 
	{
		System.out.println("animal is eating.");
	}
}

class animal2 extends animal1 
{
	void bark()
	{
		System.out.println("Dog is barking.");
	}
}

class animal3 extends animal2
{
	void meow()
	{
		System.out.println("Cat is meowing.");
	}
}
class animal4 extends animal1 
{
	void Chrips()
	{
		System.out.println("rat is Chirping.");
	}
}
public class Hybridinheritencedemo {

	public static void main(String[] args) {
		animal4 obj=new animal4();
		obj.eat();
		obj.Chrips();
		
		animal3 obj3 = new animal3();
		obj3.eat(); 
		obj3.meow(); 	
		
		

	}

}
