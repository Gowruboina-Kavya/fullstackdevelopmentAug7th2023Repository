package com.gentech.Interfaces;
interface event
{
	void showevent(String event);
}
interface cultural extends event
{
	void showcultural(String cul);
	
}
interface location extends cultural
{
	void showlocation(String loc);
}
interface commedy extends location
{
	void showcommedy(String com);
}
class artist1 implements commedy
{
	public void showevent(String event)
	{
		System.out.println("event  name is:"+event);
	}
	public void showcultural(String cul)
	{
		System.out.println("cultural name is:"+cul);
	}
	public void showlocation(String loc)
	{
		System.out.println("location  name is:"+loc);
	}
	public void showcommedy(String com)
	{
		System.out.println("commedy show is:"+com);
	}
}
class artist2 implements location
{
	public void showevent(String event)
	{
		System.out.println("libraryname is :"+event);
	}
	public void showcultural(String cul)
	{
		System.out.println("cultural name is:"+cul);
	}
	public void showlocation(String loc)
	{
		System.out.println("location is:"+loc);
	}
}
public class interfaceextendsanotherinterfaceinhybrid {

	public static void main(String[] args) {
		
		artist2 obj1=new artist2();
		obj1.showevent("Ugadhi special episode");
		obj1.showcultural("kabbadi");
		obj1.showlocation("Nellore");
		System.out.println("********************");
		
		
		artist1 obj=new artist1();
		obj.showevent("super queeen");
		obj.showcultural("dance");
		obj.showcommedy("jabardhasth");
		obj.showlocation("Vizag");
		
	}

}




