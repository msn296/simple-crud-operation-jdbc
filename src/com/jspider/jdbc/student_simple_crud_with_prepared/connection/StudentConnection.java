package com.jspider.jdbc.student_simple_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
	public static Connection getStudentConnection()
	{
		try {
			// step-1 :- load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 :-create connection
			String url = "jdbc:mysql://localhost:3306/students";
			String user = "root";
			String pass ="Sarim";
			
			Connection connection =DriverManager.getConnection(url, user, pass);
			return connection;
		}catch (ClassNotFoundException |SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
