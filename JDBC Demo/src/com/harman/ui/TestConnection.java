package com.harman.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Sal@12#4");
			System.out.println("connection established");
		} catch (ClassNotFoundException excep) {
			System.out.println("driver class not found");
		}catch(SQLException excep) {
			System.out.println("Connection could not be established");
		}

	}

}
 