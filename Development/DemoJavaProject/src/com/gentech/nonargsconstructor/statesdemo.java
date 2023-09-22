package com.gentech.nonargsconstructor;
class Country
{
	String countryname;
	int  noofstates;
	long population;
	String language;
	Country()
	{
		countryname="india";
		population=1000000000;
		noofstates=32;
		language="english";
		System.out.println(countryname);
		System.out.println(population);
		System.out.println(noofstates);
		System.out.println(language);
		System.out.println("++++++++++++");
	}
}
class State
{
	String statename;
	int noofdistricts;
	int population;
	String language;
	State()
	{
		statename="andhrapradesh";
		noofdistricts=25;
		language="telugu";
		population=2900000;
		System.out.println(statename);
		System.out.println(noofdistricts);
		System.out.println(population);
		System.out.println(language);
		System.out.println("++++++++++");
	}
}
class District
{
	String Districtname;
	int population;
	String language;
	int noofmandals;
	District()
	{
		Districtname="prakasam";
		noofmandals=19;
		population=1000000;
		language="telugu";
		System.out.println(Districtname);
		System.out.println(noofmandals);
		System.out.println(population);
		System.out.println(language);
	}
}

public class statesdemo {

	public static void main(String[] args) {
		Country countries=new Country();

		State states=new State();

		District dist=new District();

	}


}
