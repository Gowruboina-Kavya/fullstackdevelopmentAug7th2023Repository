package com.gentech.Inheritenceassignments;

class text {
	String names;
	int rollno;
	int mobilenum;
	String fathername;

	text(String name, int r,String f) {
		names = name;
		rollno = r;
		fathername=f;

		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);

	}

	text(int cc) {
		mobilenum = cc;
		System.out.println("Super Class Qis College Code : " + mobilenum);
	}
}

class text1 extends text {
	String names;
	int rollno;
	int mobilenum;
	String fathername;


	text1(String name, int roll,String f) {
		super(name, roll,f);
		names = name;
		rollno = roll;
		fathername=f;
		
		System.out.println("Qis 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	text1(int cc) {
		super(cc);
		mobilenum = cc;
		System.out.println("Qis 1 College Code : " + mobilenum);
	}
}

class text2 extends text1 {
	String names = "";
	int rollno;
	int mobilenum;
	String fathername;

	text2(String name, int r,String f) {
		super(name, r,f);
		names = name;
		rollno = r;
		fathername=f;
		
		System.out.println("Qis2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("Father Name : " + fathername);
	}

	text2(int cc)
	{
		super(cc);
		mobilenum = cc;
		System.out.println("QIS 2 College Code : " +mobilenum);
	}
}
public class MultilevelInheritenceconstrctiroverloading {

	public static void main(String[] args) {
		text2 obj = new text2("kavya", 468,"sigamaneni jalaiah");
		text2 obj2 = new text2(194910468);

	}

}
