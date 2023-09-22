package com.gentech.Inheritenceassignments;
class assign9 {
	String names;
	int rollno;
	int branchcode;

	assign9(String firstname, int roll) {
		names = firstname;
		rollno = roll;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	assign9(int bc) {
		branchcode = bc;
		System.out.println("Super Class College Code : " + branchcode);
	}
}

class assign91 extends assign9 {
	String names;
	int rollno;
	int branchcode;

	assign91(String firstname, int roll) {
		super(firstname, roll);
		names = firstname;
		rollno = roll;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	assign91(int bc) {
		super(bc);
		branchcode = bc;
		System.out.println("Child class 1 College Code : " + branchcode);
	}
}

class assign92 extends assign91 {
	String names = "";
	int rollno;
	int branchcode;

	assign92(String firstname, int roll) {
		super(firstname, roll);
		names = firstname;
		rollno = roll;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	assign92(int bc) {
		super(bc);
		branchcode = bc;
		System.out.println("Child Class 2 College Code : " + branchcode);
	}
}

class assign93 extends assign9 {
	String names = "";
	int rollno;
	int branchcode;

	assign93(String name, int r) {
		super(name, r);
		names = name;
		rollno = r;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
	}

	assign93(int bc)
	{
		super(bc);
		branchcode = bc;
		System.out.println("Child Class 2 College Code : " +branchcode);
	}
}

public class Hybridinheritencesuperclassconstructoroverloading {

	public static void main(String[] args) {
		assign92 obj = new assign92("harivandana", 67);
		System.out.println();
		System.out.println();

		assign92 obj2 = new assign92(3600401);
		System.out.println();
		System.out.println();

		assign93 obj3 = new assign93("kavya", 68);
		System.out.println();
		System.out.println();

		assign93 obj4 = new assign93(3630400);
	}

}
