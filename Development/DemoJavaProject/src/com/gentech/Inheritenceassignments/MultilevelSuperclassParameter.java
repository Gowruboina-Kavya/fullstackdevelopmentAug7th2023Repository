package com.gentech.Inheritenceassignments;
class Student1
{
 Student1(String firstname,String lastname,int Rollno)
 {
  System.out.println("First Name is:"+firstname);
  System.out.println("Last Name is :"+lastname);
  System.out.println("Roll Number is :"+Rollno);
 }
}

class Student2 extends Student1
{
 Student2(String fn,String Ln,int rollnumber)
 {
  super(fn,Ln,rollnumber);
 }
}

class Student3 extends Student2
{
 Student3(String fn,String Ln,int rollnumber)
 {
  super(fn,Ln,rollnumber);
 }
}

public class MultilevelSuperclassParameter {

 public static void main(String[] args) {
  Student2 o2=new Student2("kavya","gowruboina",468);
  Student3 o1=new Student3("harish","sangeetham",472);
 }

}



