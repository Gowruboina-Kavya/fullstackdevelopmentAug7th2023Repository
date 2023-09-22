package com.gentech.Interfaces;
interface hospital
{
	void showhopitalname(String hname);
}
interface doctor extends hospital
{
	abstract void displaydoctorname(String dname);

}
interface patients extends doctor
{
	abstract void showpateintsname(String pname);
}
class customer implements hospital
{
	public void showhopitalname(String hname)
	{
		System.out.println("The hospital name is:"+hname);
	}
	public void displaydoctorname(String dname)
	{
		System.out.println("The doctorname name is:"+dname);
	}
	public void showpateintsname(String pname)
	{
		System.out.println("The pateint name is:"+pname);
	}
	void showcustomername(String cname)
	{
		System.out.println("The customer name is:"+cname);
	}
}

public class MultipleInheritenceinInterface {

	public static void main(String[] args) {
		customer obj=new customer();
		obj.showhopitalname("Raghava Gynacologist");
		obj.displaydoctorname("Raghava");
		obj.showpateintsname("Harish");
		obj.showcustomername("Anjali");
	}

}




