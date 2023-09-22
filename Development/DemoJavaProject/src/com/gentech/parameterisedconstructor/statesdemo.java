package com.gentech.parameterisedconstructor;
class Country
{
	String countryname;
	int  noofstates;
	long population;
	String language;
	Country(String countn,int nos,long pop,String lang)
	{
		countryname=countn;
		population=pop;
		noofstates=nos;
		language=lang;
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
	State(String stn,int nod,int pop,String lang)
	{
		statename=stn;
		noofdistricts=nod;
		language=lang;
		population=pop;
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
	District(String distn,int pop,String lang,int nom)
	{
		Districtname=distn;
		noofmandals=nom;
		population=pop;
		language=lang;
		System.out.println(Districtname);
		System.out.println(noofmandals);
		System.out.println(population);
		System.out.println(language);

	}

}
public class statesdemo {

	public static void main(String[] args) {
		Country countries=new Country("india",320,100000000,"telugu");
		State states=new State("ap",32,10000000,"telugu");
		District dist=new District("prakasam",1000001,"telugu",10);
	}
}



