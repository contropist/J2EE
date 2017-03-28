package com.lntu.hello.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lntu.hello.web.model.Username;
import com.lntu.hello.web.unit.JDBCUnit;


public class UsernameDao {
	
	
	
	
	public void add(Username username){
		Connection conn =JDBCUnit.getConnection();
		
		String sql = "insert into username1 values(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username.getName());
			ps.setString(2,username.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet getRS(String name){
		ResultSet rs = null;
		Connection conn =JDBCUnit.getConnection();
		String sql = "select * from username1 where name = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			
			while(rs.next()){
				int id1 = rs.getInt(1);
				String name1 = rs.getString(2);
				String password = rs.getString(3);
				System.out.println(id1+"@@"+name1+"@@"+password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}

}
