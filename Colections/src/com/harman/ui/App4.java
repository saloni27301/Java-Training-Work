package com.harman.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;



public class App4 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(800);
		list.add(300);
		list.add(500);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.toString());
	}

}
