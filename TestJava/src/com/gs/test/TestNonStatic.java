package com.gs.test;

public class TestNonStatic {

	//non static variable
	int age = 26;
	String name = "Ganesh";
	
	void m1() {
		System.out.println("m1 method");
	}
	
	String m2() {
		System.out.println("m2 method");
		return "Hello";
	}
	
	//static variable
	static long ss=100L;	
	static void m3() {
		System.out.println("m3 static method");
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(TestNonStatic.ss);
		TestNonStatic.ss=90000;
		System.out.println(TestNonStatic.ss);
		TestNonStatic.m3();
		
		TestNonStatic rushiii = new TestNonStatic();		//new objection creation
		System.out.println("from russhi :: "+rushiii.age); //26
		System.out.println("from russhi :: "+rushiii.name);//Ganesh
		
		TestNonStatic ganesh = new TestNonStatic();	
		ganesh.age=20;
		System.out.println("from ganesh :: "+ganesh.age);//20
		System.out.println("from ganesh :: "+ganesh.name);//ganesh
		
		TestNonStatic xyz = new TestNonStatic();	
		xyz.name="java";		
		System.out.println("from ganesh :: "+xyz.age);//26
		System.out.println("from ganesh :: "+xyz.name);//jave
		
		System.out.println("from ganesh :: "+ganesh.age);//20
		System.out.println("from ganesh :: "+rushiii.age);//26

		rushiii.age=30;
		
		System.out.println("from ganesh :: "+ganesh.age);//20
		System.out.println("from ganesh :: "+rushiii.age);//30
		System.out.println("from ganesh :: "+xyz.age);//26
		
		//classname xyz=new classname();
		
		
		
		TestNonStatic.ss=1000;
		
		
		
		
	}
}
