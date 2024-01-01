package com.jdbc.practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {
	public static void main(String[] args) throws Exception {
		System.out.println("enter the main method...");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class is loaded...");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gmail", "root", "root");
		System.out.println("connection established...");
		/*
		 * PreparedStatement ps=con.
		 * prepareStatement("insert into employee(name,salary,desiganation) values(?,?,?)"
		 * ); ps.setString(1, "sri"); ps.setInt(2, 70000); ps.setString(3, "techsoft");
		 */ System.out.println("record inserted successfully....");
		/*
		 * PreparedStatement ps = con.prepareStatement(
		 * "insert into employee(id,name,salary,desiganation,comapanyName) values(506,'rajesh',50000,'softwareEngineer','infosis') "
		 * );
		 */
		 
		 PreparedStatement ps=con.prepareStatement(" select id,name from employee");
		 //ps.executeUpdate();
		 ResultSet rs=ps.executeQuery();
		 
		 while(rs) {
			String id=rs.getString("id");
			String name=rs.getString("name");
			System.out.println(id+"---"+name);
		 }
		 System.out.println("done with while loop");
		 }
		//ps.close();

	
}
