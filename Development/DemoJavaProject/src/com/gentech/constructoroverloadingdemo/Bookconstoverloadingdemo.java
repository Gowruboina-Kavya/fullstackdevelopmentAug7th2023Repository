package com.gentech.constructoroverloadingdemo;
class Books
{
	Books(String Bookname,String Authorname,String Publisher)
	{
		System.out.println("Bookname:"+Bookname);
		System.out.println("authorname:"+Authorname);
		System.out.println("Publisher:"+Publisher);
	}
	Books(int Bookid)
	{
		System.out.println("Bookid:"+Bookid);


	}
}

public class Bookconstoverloadingdemo {

	public static void main(String[] args) {
		Books obj1=new Books(21);
		Books obj2=new Books("Dsp","Ravi","KSR");

	}

}
