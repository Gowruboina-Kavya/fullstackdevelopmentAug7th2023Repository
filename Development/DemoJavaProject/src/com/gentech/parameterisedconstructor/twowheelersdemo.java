package com.gentech.parameterisedconstructor;
class TwoWheelers
{
	String type;
	int engineCapacity;
	String hasStorage;
	String fuelType;
	TwoWheelers(String typ,int engcap,String hstore,String ftype)
	{
		type=typ;
		engineCapacity=engcap;
		hasStorage=hstore;
		fuelType=ftype;
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++++++++++++");

	}
}
class FourWheeler {
	String type;
	int seatingCapacity;
	String isSUV;
	String fuelType;
	FourWheeler(String typ,int seatcap,String isuv,String fueltyp)
	{
		type=typ;
		seatingCapacity=seatcap;
		isSUV=isuv;
		fuelType=fueltyp;
		System.out.println("Four wheeler type:"+type);
		System.out.println("Seating capacity:"+seatingCapacity);
		System.out.println("Is this an SUV:"+isSUV);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("+++++++++++");
	}
}
class HeavyVehicle {
	String type;
	double maxPayload;
	String fuelType;
	int numAxles;
	HeavyVehicle(String typ,double mpl,String ftyp,int numales)
	{
		type=typ;
		maxPayload=mpl;
		fuelType=ftyp;
		numAxles=numales;
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);
	}
}
public class twowheelersdemo {

	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers("scooter",125,"yes","prtrol");
		FourWheeler fw = new FourWheeler("suv",6,"yes","disel");
		HeavyVehicle hv=new HeavyVehicle("truck",4.5,"petrol",2);


	}

}

