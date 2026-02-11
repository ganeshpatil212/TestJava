package com.gs.test;

public class Test5 {
	
	//primitive variable 
	//non static variable or instance variable
	int a=10;
	String name="GS";
	boolean flag=true;
	Long l=100L;
	
	//static variable or class variable
	static int b=20;
	static String city="HYD";
	static boolean status=false;
	static Long l1=200L;
	
	//method 
	//no paramer 
	//paratmer
	//return type // int or String or boolean or Long or void, object or class name 	
	//static and non static method
	
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	void add(int a, int b) {
		System.out.println("Addition is: "+(a+b));
	}
	
	public static Test5 m() {
		
		return new Test5();
	}
	
	//int return type method
	//add is method name and
	//a,b,c are parameters
	int add (int a, int b, int c) {
		return a+b+c;
	}
	
	String getName(int k) {
		return name;
	}
	
	String getName() {		
		return name;
	}
	
	//block
	
	//non static block or instance block 
	// it will execute every time when we create an object of the class
	{
		System.out.println("This is non static block");
	}
	
	//static block or class block 
	// it will execute only once when the class is loaded into memory
	static {
		System.out.println("This is static block");
	}
	
	//constructor
	//constructor name should be same as class name
	//default constructor 
	//no-arg constructor
	//parameterized constructor
	Test5(){
		System.out.println("This is constructor");
	}
	//parameterized constructor
	Test5(int a, String name){
		this.a=a;
		this.name=name;
		System.out.println("This is parameterized constructor");
	}
	
	
	
	
	
	
	
	
	
	

}