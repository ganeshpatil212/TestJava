package com.gs.temp;

public class Test1 {

	public  int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String n ){
		this.name = n;
	}
	public int getId () {
		return id;
	}
		
	public void setId (int id) {
		id =id;
	}
	}


class gpj_44_ch5{
	public static void main(String[] args) {
		Test1 ganesh =new Test1();
	ganesh.setName("Ganesh patil Jalgav ");
	System.out.println(ganesh.getName());
	//ganesh.name = GaneshPatil; 
	}

}