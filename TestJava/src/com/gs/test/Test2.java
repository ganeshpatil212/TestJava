package com.gs.test;


public class Test2 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.println("Running in: " + Thread.currentThread().getName());

		
	}
	public static void main(String[] args) {
		System.out.println("Test2.main()");
		
		Test2 tt=new Test2();
		Thread t=new Thread(tt);
		t.start();
		
	}

}
