package com.harman.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		
		//HashSet<String>set=new HashSet<>();
		LinkedHashSet<String>set=new LinkedHashSet<>();
		//TreeSet<String>set=new TreeSet<>();
		set.add("core java");
		set.add("Jsp");
		set.add("hibernate");
		set.add("springboot");
		set.add(null);
		System.out.println(set);
		System.out.println("--------------------");
		for(String data:set) {
			System.out.println(data);
		}
		System.out.println("--------------------");
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
