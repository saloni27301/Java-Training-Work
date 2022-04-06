package com.harman.ui;
import java.sql.*;
import java.util.Scanner;


public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst= null;
		Scanner scan=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Sal@12#4");
			scan= new Scanner(System.in);
			System.out.println("Enter Job id: ");
			String jobId =scan.nextLine();
			System.out.println("Enter job title: ");
			String jobTitle = scan.nextLine();
			System.out.println("Enter minimum Salary: ");
			int minsalary = scan.nextInt();
			System.out.println("Enter Maximum salary: ");
			int maxsalary= scan.nextInt();
			
			String sql="INSERT INTO JAVA (job_id,job_title,min_salary,max_salary) VALUES (?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, jobId);
			pst.setString(2, jobTitle);
			pst.setInt(3, minsalary);
			pst.setInt(4, maxsalary);
		
			
			int count=pst.executeUpdate();
			if(count==1)
				System.out.println("row inserted");
			else
				System.out.println("Insertion Error");
		} catch (ClassNotFoundException excep) {
			System.out.println("Could not load jdbc driver");
		}catch(SQLException excep) {
			System.out.println("Could not Connect");
		}finally {
			scan.close();
			try {
				pst.close();
			}catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
		}		

	}

}
