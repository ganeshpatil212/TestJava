package com.gs.test;

public  class Test6  {
	
	
	public static void main(String[] args) {		
		Bb bb = new Bb();
		System.out.println(bb.a); //100
		System.out.println(bb.b); //200
		
		Aaa aa = new Bb();
		System.out.println(aa.a); //10
		System.out.println(aa.b); //20
	
		Aaa aaa= new Aaa();
		System.out.println(aaa.a); //10
		System.out.println(aaa.b); //20
	}

}

class Aaa {
int a=10;
int b=20;	
}

class Bb extends Aaa {	
	int a=100;
	int b=200;
}