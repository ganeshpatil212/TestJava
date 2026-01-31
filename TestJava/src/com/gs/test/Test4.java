package com.gs.test;

class A{
	int i = 10;
	void display() {
		System.out.println("from class A");
		System.out.println("Class A: i = " + i);
	}
}

class B extends A{
	
	int j = 20;
	void display() {
		System.out.println("Class B: j = " + j);
	}
	void show() {
		System.out.println("Class B: i + j = " + (i + j));
	}
	void sampe() {
		System.out.println("from class a");
		System.out.println("from class b");
	}
}


public class Test4 {
	public static void main(String[] args) {
		
		 A a=new B();
		 a.display();
	//	 a.show(); 
		 
		 
	}

}
