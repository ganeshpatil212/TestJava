package com.gs.test;

public class Test8 {
	
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.m1(); //m1() in Parent
		p.m2(10); //m2() in Parent
		p.m3("rushi"); //m3() in Parent
		
		Child1 c = new Child1();
		c.m1(); //m1() in Child
		c.m2(10); //m2() in Child
		c.m3("rushi"); //m3() in Parent
		
		Parent1 p1 = new Child1();
		p1.m1(); //m1() in Child
		p1.m2(10); //m2() in Child
		p1.m3("rushi"); //m3() in Parent
	}
		
		
		Test8(){
			this(10);
			System.out.println("from first");
		}
		Test8(int a){
			this("java");
			System.out.println("from second");
		}
		Test8(String abc){
			this();
			System.out.println("from third");
		}
	}




class Parent1{
	
	void m1() {
		System.out.println("m1() in Parent");
	}
	void m2(int a) {
		System.out.println("m2() in Parent");
	}
	void m3(String name) {
		System.out.println("m3() in Parent");
	}
}

class Child1 extends Parent1{
			
	 void m1() {
		System.out.println("m1() in Child");
	}
	
	void m2(int a) {
		System.out.println("m2() in Child");
	}
}
