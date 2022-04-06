package com.harman;

public class practice1 {
	public static void main(String[] args) {
		Person p1=new Person();//Objects of class person
		p1.age=20;
		p1.name= "saloni";
		System.out.println(p1.age+" "+p1.name);
		Person p2 = new Person();
		p2.age=21;
		p2.name="Riya";
		System.out.println(p2.age+" "+p2.name);
		
	}

}
//Basic class 
//this is how we created class and object in java
class Person{
	int age;
	String name;
}