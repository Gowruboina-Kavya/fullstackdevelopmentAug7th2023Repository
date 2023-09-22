package com.gentech.superclassinheritence;

class college {
	String collegename;
	String address;

	void show(String collegename, String address) {
		System.out.println("collegename in superclass:" + collegename);
		System.out.println("college address is:" + address);
	}

}

class university extends college {
	university(String universityname, String address)

	{
		super.show(universityname, address);

	}
	String collegename;
	String address;

	void show(String name, String address) {
		System.out.println("universityname in subclass:" + name);
		System.out.println("university adress is:" + address);

	}
}

class School extends university {
	School(String Schoolname, String address) {

		super(Schoolname, address);
		super.show(Schoolname, address);

	}
	String collegename;
	String address;
	void show(String name, String address) {
		System.out.println("Schoolname in subclass2:" + name);
		System.out.println("School address is:" + address);
	}
}

public class multilevelinheritencesamemethodandvariablewithdatatypes {

	public static void main(String[] args) {
		School obj = new School("Qis college", "Ongole");
		obj.show("Qis college", "Ongole");
		obj.show("JNTUk", "kakinada");
		obj.show("Vikas", "Nellore");

	}

}
