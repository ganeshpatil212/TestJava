package com.gs.test;

public class Test3 extends Thread{
	  
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
        System.out.println("Running in: " + Thread.currentThread().getName());

	}
	
	public static void main(String[] args) {
		System.out.println("Test3.main()");
		Test3 t=new Test3();
		t.start();
		
		Thread tt=new Thread( ()->{
	        System.out.println("Running in: " + Thread.currentThread().getName());

		});
		tt.start();
			
		}
		

		
		
	

}
