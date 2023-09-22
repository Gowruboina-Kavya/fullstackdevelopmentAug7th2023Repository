package com.gentech.parameterisedconstructor;
class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
	Emp(int eno,String efname,String elname,String eem)
	{
		empno=eno;
		empfirstname=efname;
		emplastname=elname;
		empemail=eem;
		System.out.println(empfirstname);
		System.out.println(emplastname);
		System.out.println(empemail);
		System.out.println(empno);
		System.out.println("+++++++");
	}
}
class Dept
{
	String deptname;
	int deptno;
	String address;	
	Dept(int dno,String dn,String adds)
	{
		deptname=dn;
		deptno=dno;
		address=adds;
		System.out.println(deptname);
		System.out.println(deptno);
		System.out.println(address);
		System.out.println("+++++++++++");
	}
}
class insurence
{
	int insid;
	String instype;
	int amount;
	String name;
	insurence(int insno,String names,int amnt,String intype)
	{
		insid=insno;
		instype=intype;
		amount=amnt;
		name=names;
		System.out.println(insid);
		System.out.println(instype);
		System.out.println(name);
		System.out.println(amount);
	}
}
public class employeedemo { 


	public static void main(String[] args)
	{
		Emp obj=new Emp(1,"kavya","sangeetam","kavya@gmail.com");
		Dept obj1=new Dept(20,"ece","banglore");
		insurence insure=new insurence(11,"car",1000,"ram");
	}

}

