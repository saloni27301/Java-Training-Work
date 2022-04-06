package com.harman.ui;
import java.sql.*;
import java.util.Scanner;


public class PreparedDeleteDemo2 {

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
			
			String sql="DELETE from JAVA WHERE JOB_ID = ?";
			pst=con.prepareStatement(sql);
			pst.setString(1, jobId);

		
			
			int RowDeleted=pst.executeUpdate();
			if(RowDeleted==1)
				System.out.println("row Deleted");
			else
				System.out.println("Deletion Error");
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
