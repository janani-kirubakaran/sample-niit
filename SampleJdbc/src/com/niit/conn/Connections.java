package com.niit.conn;

import java.sql.*;

public class Connections {
	public  Connection connection=null;
	public  Statement stmt;

	String url ="jdbc:h2:tcp://localhost/~/testdb";
		String username = "sa";
		String password = "";
	public Connection con() throws SQLException
	{
	try {
			connection = DriverManager.getConnection(url,username,password);
			stmt = connection.createStatement();
			System.out.println("connection is good");
		} catch (Exception e) {
			System.out.println("connection error check your Database is open");
			e.printStackTrace();
		}
	return connection;

	}	
}
