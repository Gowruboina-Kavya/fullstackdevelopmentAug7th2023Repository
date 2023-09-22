package com.gentech.Inheritenceassignments;
class Animal {
	void eat() 
	{
		System.out.println("Animal is eating.");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog is barking.");
	}
}

class Cat extends Animal {
	void meow()
	{
		System.out.println("Cat is meowing.");
	}
}
public class HierarychicalInheritenceDemo {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat(); 
		obj.bark(); 

		Cat obj3 = new Cat();
		obj3.eat(); 
		obj3.meow(); 
	}

}
