package com.harman.ui;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the File Name: ");
		String filename=scanner.nextLine();
		
		
		
		try {
			FileReader fr=new FileReader(filename);
			int ch;
			while(true) { 
			ch=fr.read();
			if(ch==-1)
				break;
				System.out.print((char)ch);
			}
		fr.close();
		} catch (FileNotFoundException execp) {
			System.out.println("File not present");
		}catch(IOException excep) {
			System.out.println("could not read information");
		}
		

	}

}
