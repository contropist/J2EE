package com.lntu.test.web.test;

import com.lntu.test.web.dao.StudentDao;
import com.lntu.test.web.dao.impl.StudentDaoImpl;
import com.lntu.test.web.model.Student;

public class JDBCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao s = new StudentDaoImpl();
		Student s1 = new Student();
		s1.setName("11111111");
		s1.setPassword("2222222");
		s.addStudent(s1);
	}

}
