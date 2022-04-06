package com.harman.ui;
import java.sql.*;



public class InsertDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Sal@12#4");
			String sql="INSERT INTO JAVA(job_id,job_title,min_salary,max_salary) VALUES('J4','trainee',9000,50000)";
			st=con.createStatement();
			int count=st.executeUpdate(sql);
			if(count==1)
				System.out.println("row inserted");
			else
				System.out.println("Insertion Error");
		} catch (ClassNotFoundException excep) {
			System.out.println("Could not load jdbc driver");
		}catch(SQLException excep) {
			System.out.println("Could not Connect");
		}finally {
			try {
				st.close();
				con.close();
			}catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
		}
			
	}

}
