package com.harman.model;



public class Employee implements Comparable<Employee>{
	private int id;
	private String Name;
	private double salary;
	public Employee() {
		/*default Constructor*/
	}
	public Employee(int id,String Name,double salary)
	{
		this.id=id;
		this.Name=Name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("id=%s, Name=%s, salary=%s", id, Name, salary);
	}
	@Override
	public int compareTo(Employee other)
	{
		//return this.id-other.id;
		//return this.Name.compareTo(other.Name);
		return (int) ((int)this.salary-other.salary);
	}
	
	@Override
	public boolean equals(Object other) {
		Employee otherEmployee=(Employee)other;
		return this.id==otherEmployee.id && this.Name.equals(otherEmployee.Name) && this.salary==otherEmployee.salary;
		
	}
	@Override
	public int hashCode(){
		return id;
		
	}

}
