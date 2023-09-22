package com.gentech.Inheritenceassignments;
class song {
	String names;
	int rollno;
	int pincode;

	song(String firstname, int rol, int cc) {
		names = firstname;
		rollno = rol;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class song1 extends song {
	String names;
	int rollno;
	int pincode;

	song1(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Qis 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class song2 extends song1 {
	String names = "";
	int rollno;
	int pincode;

	song2(String name, int rol, int cc) {
		super(name, rol, cc);
		names = name;
		rollno = rol;
		pincode = cc;
		System.out.println("Qis 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class song3 extends song{
	String names = "";
	int rollno;   
	int pincode;

	song3(String firstname,int rol,int cc)
	{
		super(firstname,rol,cc);
		names = firstname;
		rollno = rol;
		pincode = cc;
		System.out.println("Qis3(simple) name : "+names);
		System.out.println("Roll no : "+rollno);
		System.out.println("College Code : " + pincode);
	}
}
public class Hybridinheritencesuperclassparameter {

	public static void main(String[] args) {
		song2 obj = new song2("kavya", 68, 358698);
		song3 obj2 = new song3("harish", 73, 358599);

	}

}
