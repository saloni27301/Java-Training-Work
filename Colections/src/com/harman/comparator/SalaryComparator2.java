package com.harman.comparator;

import java.util.Comparator;

import com.harman.model.Employee;

public class SalaryComparator2 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.getSalary()-o2.getSalary());
	}

}
