package com.harman.ui;



import java.util.LinkedHashSet;
import java.util.Set;

import com.harman.model.Employee;

public class App7 {

	public static void main(String[] args) {
		Set<Employee> empset=new LinkedHashSet<>();
		empset.add(new Employee(101,"Saloni",2400));
		empset.add(new Employee(103,"Johnson",1200));
		empset.add(new Employee(100,"Devus",24000));
		empset.add(new Employee(108,"Priya",2200));
		empset.add(new Employee(104,"Riya",32200));
		empset.add(new Employee(104,"Riya",32200));
		for(Employee emp:empset) {
			System.out.println(emp);
			
			
		}
	}
		
	
}
