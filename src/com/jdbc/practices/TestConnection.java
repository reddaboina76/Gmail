package com.jdbc.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		System.out.println("enter into the main method");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class is loaded!!");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "root");
		System.out.println("connection is established!!");

		/*
		 * Statement statement = con.createStatement(); statement.
		 * executeUpdate("insert into emp values(200,'sureshh','60000','techled')");
		 */
		
		  
		  
		  PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
		  ps.setInt(1, 55);
		  ps.setString(2, "ramesh"); 
		  ps.setInt(3, 70000);
		  ps.setString(4, "engineer");
		  
		  ps.execute();
		  ps.setInt(1, 56);
		  ps.setString(2, "rramesh");
		  ps.setInt(3,40000);
		  ps.setString(4, "engineer");
		  
		  ps.execute();
		  
		  
		 
		
		
		
		con.close();

	}

}
