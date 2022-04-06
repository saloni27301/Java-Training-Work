package com.harman.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.harman.model.person;

public class App5 {

	
	public static void main(String[] args, Throwable exeception) {
		try(FileOutputStream fos =new FileOutputStream("person.dat");
				OutputStream oos =new ObjectOutputStream(fos);){
			person p=new person("Saloni","Saloni27301@gmail.com","1223");
			((ObjectOutputStream) oos).writeObject(p);
			System.out.println("Object Serialized");
			
		}catch(IOException exception) {
			exeception.printStackTrace();
		}
	}

}
