package com.harman.ui;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class App3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String fileName=scanner.nextLine();
		String name="";
		FileWriter fw=null;
		try {
			fw=new FileWriter(fileName);
			while(true) {
				System.out.println("Enter Name [end to stop]: ");
				name =scanner.nextLine();
				if(name.equals("end"))
					break;
				fw.write(name);
			}	
				
			}catch(FileNotFoundException excep) {
				System.out.println(excep.getMessage());
			
			}catch(IOException excep) {
				System.out.println(excep.getMessage());
			}finally {
				try {
					fw.close();
					scanner.close();
				
				}catch(IOException excep) {
					System.out.println(excep.getMessage());
				}
				
			}
}
}
