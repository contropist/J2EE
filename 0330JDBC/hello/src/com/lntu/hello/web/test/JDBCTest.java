package com.lntu.hello.web.test;

import com.lntu.hello.web.dao.UsernameDao;
import com.lntu.hello.web.model.Username;

public class JDBCTest {
	
	public static void main(String[] args) {
		UsernameDao jdbc = new UsernameDao();
		Username u = new Username();
		u.setName("888");
		u.setPassword("555");
		jdbc.add(u);
		//jdbc.getRS("'");
		
	}

}
