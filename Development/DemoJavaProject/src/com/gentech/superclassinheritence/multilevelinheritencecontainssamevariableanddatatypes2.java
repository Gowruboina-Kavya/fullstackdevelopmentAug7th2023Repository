package com.gentech.superclassinheritence;
class canteen
{
	String canteenname;
	int can_id;
	void show(String canteenname,int can_id)
	{
		System.out.println("canteen name in superclass is:"+canteenname);
		System.out.println("canteen id is:"+can_id);
		
	}
	
}
class canteen1 extends canteen
{
	canteen1(String name,int can_id)
	{
	    super.show(name,can_id);
		
	}
	String canteenname;
	int can_id;
	void display1(String canteenname,int can_id)
	{
		System.out.println("firstname in subclass:"+canteenname); 
}
}
class canteen2 extends canteen1
{
	canteen2(String canteenname,int can_id)
	{
		super(canteenname, can_id);
		super.show(canteenname,can_id);
	}
	String canteenname;
	int can_id;
	void display2(String name,int can_id)
	{
		System.out.println("firstname in subclass2:"+name); 
		System.out.println("canteen id:"+can_id);
	
	}
}
public class multilevelinheritencecontainssamevariableanddatatypes2 {

	public static void main(String[] args) {
		canteen2 obj=new canteen2("kavya",10);
		obj.show("kavitha",11);
		obj.display1("bhargavi",12);
		obj.display2("harish",13);

	}

}
