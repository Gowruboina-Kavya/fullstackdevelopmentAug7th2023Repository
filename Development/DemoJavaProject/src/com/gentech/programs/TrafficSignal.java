package com.gentech.programs;

public class TrafficSignal {

	public static void main(String[] args) {
		String s1=args[0];
		switch(s1)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Green":
			System.out.println("go");
			break;
		case "Yellow":
			System.out.println("ready to go");
			break;
		default:
			System.out.println("Invalid");
			
		}
		

	}

}
