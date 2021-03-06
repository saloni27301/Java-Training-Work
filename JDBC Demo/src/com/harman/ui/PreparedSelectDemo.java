package com.harman.ui;
import java.sql.*;
public class PreparedSelectDemo {

	public static void main(String[] args) {
		String sql="select job_id,job_title from java";
		
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Sal@12#4");
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
		){
			String jobId,jobTitle;
			while(rs.next()) {
				jobId=rs.getString(1);
				jobTitle=rs.getString(2);
				System.out.printf("%-15s%-10s\n",jobId,jobTitle);
			}
		} catch (SQLException excep) {
			System.out.println(excep.getMessage());
		}
				

	}

}
