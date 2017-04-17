package com.lntu.test.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lntu.test.web.dao.StudentDao;
import com.lntu.test.web.dao.impl.StudentDaoImpl;
import com.lntu.test.web.model.Student;

public class StudentServletAdd extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public StudentServletAdd() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     
	String method = request.getParameter("method");	
		
		if(method.equals("add")){
    	 this.add(request, response);
     }
	
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("pass");
		System.out.println(name);
		System.out.println(password);
		
		Student s = new Student();
		s.setName(name);
		s.setPassword(password);
		
		StudentDao s1 = new StudentDaoImpl();
		s1.addStudent(s);
		
		request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
		System.out.println("1111111111111111111111111111111111");
		
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//System.out.println("1111111111111111111111111111111111");
		String name = request.getParameter("username");
		String password = request.getParameter("pass");
		System.out.println(name);
		System.out.println(password);
		
		Student s = new Student();
		s.setName(name);
		s.setPassword(password);
		
		StudentDao s1 = new StudentDaoImpl();
		s1.addStudent(s);
		
		request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
		System.out.println("1111111111111111111111111111111111");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
