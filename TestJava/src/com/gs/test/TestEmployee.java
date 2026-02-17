package com.gs.test;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employe emp = new Employe();
		emp.setName("rushi");		
       String na=emp.getName();		
		System.out.println("the name is :: "+na);
		
		
		Employe xyx = new Employe();
		xyx.setName("java");		
       String naa=xyx.getName();
       System.out.println("the name is :: "+naa);
	}

}



class Employe {
		String globalName;//rushi
		
		String getName(){
			return globalName;
		}
		
		void setName(String name) {
			//String localName=name;		
			globalName=name;
		}
}
