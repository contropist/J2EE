package com.lntu.test.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lntu.test.web.dao.StudentDao;
import com.lntu.test.web.model.Student;
import com.lntu.test.web.unit.JDBCUnit;

public class StudentDaoImpl implements StudentDao {

	public void addStudent(Student s) {
		// TODO Auto-generated method stub
Connection conn =JDBCUnit.getConnection();
		
		String sql = "insert into student values(?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2,s.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
