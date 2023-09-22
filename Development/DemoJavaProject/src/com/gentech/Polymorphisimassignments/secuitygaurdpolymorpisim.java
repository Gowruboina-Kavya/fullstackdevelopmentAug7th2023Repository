package com.gentech.Polymorphisimassignments;
abstract class securitygaurd
{
	abstract void receive();
	
}
class Mall extends securitygaurd
{
	void receive()
	{
		String s="welcome Mam/Sir";
		System.out.println("securitygaurd receives a person in :"+s);
	}
}
class office extends securitygaurd
{
	void receive()
	{
		String k="Good morning Mam/sir";
		System.out.println("securitygaurd do action in office is:"+k);
	}
}
class hotels extends securitygaurd
{
	void receive()
	{
		String v="your ID please";
		System.out.println("securitygaurd do action in hotels is:"+v);
	}
}

public class secuitygaurdpolymorpisim {

	public static void main(String[] args) {
		securitygaurd action=null;
		
		
		Mall obj=new Mall();
		office obj1=new office();
		hotels obj2=new hotels();
		
		action=obj;
		action.receive();
		action=obj1;
		action.receive();
		action=obj2;
		action.receive();
	}

}
