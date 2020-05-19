package com.util;
import java.sql.*;
public class mysql_connection
{
	
	public static Connection getConnection() throws Exception
	{
		Connection con=null;
		String url ="jdbc:mysql://localhost:3306/db1";
		String  username = "root";
		String password = null;
		 
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		return con;
	}
}
