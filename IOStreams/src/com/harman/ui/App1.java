package com.harman.ui;

import java.io.File;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Path ANd file Name: ");
		String path=scanner.next();
		File file=new File(path);
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println("This is fFile is of"+file.length()+"Bytes in size");
				
			}else {
				System.out.println("this file present in this folder are.....");
				File[] files=file.listFiles();
				for(File currentFile:files) {
					System.out.println(currentFile.getName()+"\t"+ (currentFile.isDirectory() ?"<DIR" : "<FILE>")+"\t"+(currentFile.length())+"bytes "+"\t");
				}
			}
		}else {
			System.out.println("Files Path is not Found");
		}
		scanner.close();

	}

}
