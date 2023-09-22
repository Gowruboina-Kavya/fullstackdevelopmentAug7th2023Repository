package com.gentech.Polymorphisimassignments;
abstract class Artists
{
	abstract void perform();
}
class singer extends Artists
{
	void perform()
	{
		
		String Sname="revanth";
		int S_id=11;
		String Sadress="vizag";
		String Sshow="Sarigamapa";
		
		System.out.println("singer name is:"+Sname );
		System.out.println("Singer id is:"+S_id);
		System.out.println("singer adress is:"+Sadress);
		System.out.println("singing show is:"+Sshow);
		System.out.println("*********************************");
	}
}
class dancer extends Artists
{
	void perform()
	{
		String dname="pandu";
		int d_id=12;
		String dadress="Hydrabad";
		String dshow="djodi";
		
		System.out.println("Dancer name is:"+dname );
		System.out.println("Dancer id is :"+d_id);
		System.out.println("Dancer adress is:"+dadress);
		System.out.println("Dancing show is:"+dshow);
		System.out.println("************************");
	}
}
class Commedian extends Artists
{
	void perform()
	{
		String Cname="Sudheer";
		int C_id=13;
		String Cdadress="Annapurna studio,hydrabad";
		String Cshow="jabardasth";
		
		System.out.println("Commedian performs in:"+Cname );
		System.out.println("Commedian id name:"+C_id);
		System.out.println("Commedian adress is:"+Cdadress);
		System.out.println("commedy show is:"+Cshow);
		System.out.println("******************************");
		
	}
}
public class artistsactions {

	public static void main(String[] args) {
		Artists action =null;
		
		singer sing=new singer();
		dancer dancing=new dancer();
		Commedian commedy=new Commedian ();
		
		
		action=sing;
		action.perform();
		action=dancing;
		action.perform();
		action=commedy;
		action.perform();

	}

}
