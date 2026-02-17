package com.gs.test;

public class TestName {
	int k=100;
	static int m=200;
	
	//datatype 
		//float, double, int, long, char, boolean, String
	String name="rushi";
	String age="30";
	String salary="100000";
	String isMarried="true";
	
	boolean isMarried1=true;

	//variable name
		//local variable
		//instance variable -- non static variable
		//static variable
		
	//method --
		// parameter 
		//non parameter
		//return type
		//static vs non static
	
	//static vs non static
		//method
		//variable
	
	//constructor
		//default constructor
		//parameterized constructor
		//constructor overloading
	
	//block
		//static block
		//instance block
		//local block
	
	
	//calulateor
		//add/sub/mult/division
	//Employee
		//name, age, salary, isMarried, address, phone number,adhar number, pan number, bank account number, email id, date of birth, date of joining, department, designation, manager name, company name, work location, etc
	//Studnet
		//name,age, roll number, class, section, school name, date of birth, date of joining, address, phone number, email id, parent name, parent phone number, etc
	
	
	//Employee{	
	//int age=30;	
	//int getAge(int age){
		//return age;
	
	
	
	void m2() {
		int sss=1000;
		int a=10;
		System.out.println("i am from m1() method FRIENDLY TEST NAME CLASS");
	}
	
	String m1() {
		int a=10;
		return "i am from m1() method FRIENDLY TEST NAME CLASS";
	}
	
	String m1(String name) {
		return "I user enter the name :: "+name;
	}

	String m1(int abc) {
		TestName.m1(true);
		return "from int param :: "+abc;
	}
 
	static String m1(boolean abc) {
		m1();
		return "from int param :: "+abc;
	}
	
	public static void main(String[] args) {
		
		
		TestName t1Obj = new TestName();

		System.out.println(t1Obj.m1());
		System.out.println(t1Obj.m1("rushi"));
		System.out.println(t1Obj.m1(100));
		System.out.println(TestName.m1(true));
		
//	    String xyz=  t1Obj.m1();
//	    System.out.println(xyz);
//	    
//	   String xx= xyz.toLowerCase();
//	   System.out.println(xx);

		
	
		
	}

}
