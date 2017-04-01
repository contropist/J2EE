package com.book.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.book.util.DBCon;

public class test {
	public static void main(String[] args) {
		Connection conn = DBCon.getConnection();
	}
	public void insert(){
		try {
			DBCon.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
