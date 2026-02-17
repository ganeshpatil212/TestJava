package com.gs.test;

public class Test10 {
	
	public static void main(String[] args) {
		Age a=new Age("rushi");		
		a.setAge(20);
		
		System.out.println(a.getAge());
	}

}


class Age{
	
	String name;
	
	Age(String na){
		System.out.println(na);
		name=na;
	}
	
		int originalAge;  //20
		
		void setAge(int age){
			int localAge=age;
			originalAge=age;
		}
		
		int getAge() {
			return originalAge; //20
		}
		
		
}