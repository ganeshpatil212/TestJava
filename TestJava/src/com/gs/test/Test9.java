package com.gs.test;

public class Test9 {
 	
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.m1();
		c.m2(10);
		c.m3("rushi");
		
		Parent2 p=new Parent2();
		p.m1();
		p.m2(10);
		p.m3("rushi");
		
		Parent2 p1=new Child2();
		p1.m1();
		p1.m2(10);
		p1.m3("rushi");
		
	}

}


class Parent2{
	
	static void m1() {
		System.out.println("m1() in Parent");
	}
	static void m2(int a) {
		System.out.println("m2() in Parent");
	}
	static void m3(String name) {
		System.out.println("m3() in Parent");
	}
}

class Child2 extends Parent2{
	
	static  void m1() {
		System.out.println("m1() in Child");
	}
	
	static	void m2(int a) {
		System.out.println("m2() in Child");
	}
}