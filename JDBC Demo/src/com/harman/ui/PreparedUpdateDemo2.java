package com.harman.ui;
import java.sql.*;
import java.util.Scanner;


public class PreparedUpdateDemo2 {

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
			System.out.println("Enter  new job title: ");
			String newjobTitle = scan.nextLine();
			
			 
			String sql="UPDATE java SET job_title = ? WHERE job_id = ?";
			pst=con.prepareStatement(sql);
			pst.setString(1, newjobTitle);
			pst.setString(2, jobId);
			
		
			
			int count=pst.executeUpdate();
			if(count==1)
				System.out.println("row Updated");
			else
				System.out.println("Updation Error");
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
