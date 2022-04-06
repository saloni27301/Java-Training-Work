package com.harman.ui;

import java.util.HashMap;

public class App5 {
	
	public static void main(String[]args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Core Java",30);
		map.put("Hibernate",70);
		map.put("Springboot", 60);
		map.put("C++",10);
		System.out.println(map);
		System.out.println("---------------------------------------------");
		for(String key:map.keySet())
		{
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("---------------------------------------------");
		for(Integer data :map.values())
		{
			System.out.println(data);
		}
	}
}
