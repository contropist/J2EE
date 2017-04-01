package com.lntu.hello.web.test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lntu.hello.web.unit.JDBCUnit;

public class JDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JDBC jdbc = new JDBC();
		jdbc.select("'");
		// JDBC.add();
	}

	public static void add() {
		// TODO Auto-generated method stub

		Connection conn = JDBCUnit.getConnection();

		try {
			Statement st = conn.createStatement();
			st.executeUpdate("insert into username1 values('123','456')");
			System.out.println("添加成功！");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {
		Connection conn = JDBCUnit.getConnection();

		try {
			Statement st = conn.createStatement();
			st.executeUpdate("update username1 set password = '789' where id = 1");
			System.out.println("修改成功！");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete() {
		Connection conn = JDBCUnit.getConnection();

		try {
			Statement st = conn.createStatement();
			st.executeUpdate("delete from username1 where id = 1");
			System.out.println("删除成功！");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ResultSet select(String password) {

		Connection conn = JDBCUnit.getConnection();

		ResultSet rs = null;
		try {
			Statement st = conn.createStatement();
			String sql = "select * from username1 where password = '"
					+ password + "'";
			System.out.println(sql);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;

	}

}
