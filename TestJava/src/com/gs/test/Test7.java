package com.gs.test;

public class Test7 {
	
	int a=10;
	int b=20;
	
	void m1() {
		int c=30;
		System.out.println("m1() in Test7");
	}
	
	
	int ccc;
	
	int addd(int a, int b ) {
		ccc=a+b;
		//System.out.println("the addion is :: "+c);
		return a+b;
	}
	
	int c;
	int add(int a, int b ) {
	    c=a+b;
	   //String s=" "+(a+b);
	//	System.out.println("the addion is :: "+c);
		return a+b;
	}
	
	int substract(int a, int b ) {
		return b-a;
	}
	
	int multiplication(int a, int b ) {
		return b*a;
	}
 
	int devision(int a, int b ) {
		return b/a;
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		Test7 xyz = new Test7();
	    System.out.println("the addion is :: "+xyz.add(a,b));
		
	    System.out.println("the substraction is :: "+xyz.substract(a,b));
	    
	    System.out.println("the multiplication is :: "+xyz.multiplication(a,b));
	     
	    System.out.println("the devision is :: "+xyz.devision(a,b));
	    
	    
	    
	    
	    
		int c=a+b;
		//System.out.println("the addion is :: "+c);
		
	}

}
