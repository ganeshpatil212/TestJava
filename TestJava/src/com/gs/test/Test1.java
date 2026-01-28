package com.gs.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test1 {

	//100
	//1.5

	public static void main(String[] args) {
		List<Integer> list=List.of(1,3,5,7,9,6,8,10,12,14,16);

		List k=	list.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(k);

		List kk=	list.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(kk);

		//		List kkk=	list.stream().flatMap(a->Stream.of(a*a,a*a*a)).collect(Collectors.toList());
		List kkk=	list.stream().flatMap(t->Stream.of(t*t,t*t*t)).collect(Collectors.toList());
		System.out.println(kkk);

		List kkkk=	list.stream().flatMap(t->{
			if(t%2==0)
				return Stream.empty();
			else
				return Stream.of(t,t*10);}) 
				.collect(Collectors.toList());
		System.out.println(kkkk);
	
		
		int s=list.stream().reduce(0, (a,b)->a+b);
		System.out.println(s);
		System.out.println(5+"3");

		
		List<Employee> elist=Arrays.asList(new Employee("rushi","HR"),new Employee("aakya","Dev"),
				new Employee("sagar","HR"),new Employee("pavan","Dev"),
				new Employee("roshan","army"),new Employee("pavan","police"));
		
		
		Map<Object, Long> ss=elist.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
		
		System.out.println(ss);
		
		boolean bb=list.stream().anyMatch(a->{
			System.out.println("element a:: "+a);
		return a%2==0;
		});		
		
		System.out.println(bb);
		
		List<String> ll=List.of("java","spring","sping boot","microservice","java","spring");
		
	List<String>	so=ll.stream().map(e->e.toUpperCase())
						.distinct()
						.collect(Collectors.toList());
	System.out.println(so);
	
	}
	
	

}
