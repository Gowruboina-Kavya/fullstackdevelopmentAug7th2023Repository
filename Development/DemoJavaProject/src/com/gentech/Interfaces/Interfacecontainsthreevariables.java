package com.gentech.Interfaces;
interface School
{
	String Sname="vikas public School";
	String Saddress="Ongole";
	String Slocation="postoffice road";
	void showSchooldetails();	
}
class principal implements School
{
	public void showSchooldetails()
	{
		System.out.println("The School name  is:"+Sname);
		
		System.out.println("The School address  is:"+Saddress);
		System.out.println("The School location  is:"+Slocation);
		
	}
	
}
public class Interfacecontainsthreevariables {

	public static void main(String[] args) {
		principal obj=new principal();
		obj.showSchooldetails();
		
		
	}

}
