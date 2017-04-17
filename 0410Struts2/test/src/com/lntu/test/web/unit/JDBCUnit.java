package com.lntu.test.web.unit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUnit {
	
	public static Connection getConnection(){
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=master";
		String user = "sa";
		String password = "123qwe";

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
