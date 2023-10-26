package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {


			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				
Connection conn =	
DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","admin");
			
			Statement stmt = conn.createStatement();
			
			String query = " insert into employee values(501,'Javeed',45000) ";

				int count =	 stmt.executeUpdate(query);
			
			System.out.println(count +" No. of records affected");
				
					conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
