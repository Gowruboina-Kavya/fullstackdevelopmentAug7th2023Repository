package com.gentech.nonargsconstructor;



class TwoWheelers
{
	String type;
	int engineCapacity;
	String hasStorage;
	String fuelType;
	TwoWheelers()
	{
		type="scooter";
		engineCapacity=125;
		hasStorage="yes";
		fuelType="petrol";
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++");
	}
}
class FourWheeler {
	String type;
	int seatingCapacity;
	String isSUV;
	String fuelType;
	FourWheeler()
	{
		type="car";
		seatingCapacity=6;
		isSUV="yes";
		fuelType="diesel";
		System.out.println("Four wheeler type:"+type);
		System.out.println("Seating capacity:"+seatingCapacity);
		System.out.println("Is this an SUV:"+isSUV);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++");
	}
}
class HeavyVehicle {
	String type;
	double maxPayload;
	String fuelType;
	int numAxles;
	HeavyVehicle()
	{
		type="lorry";
		maxPayload=4.5;
		fuelType="petrol";
		numAxles=2;
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);
	}
}
public class twowheelersdemo {
	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers();

		FourWheeler fw = new FourWheeler();

		HeavyVehicle hv=new HeavyVehicle();

	}

}



