package com.harman.comparator;

import java.util.Comparator;

import com.harman.model.Employee;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
