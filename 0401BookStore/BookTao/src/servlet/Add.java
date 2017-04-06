package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.model.Book;


public class Add extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Add() {
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

		this.doPost(request, response);
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));
		String author = request.getParameter("author");
		String bookConcern = request.getParameter("bookConcern");
		int count  =Integer.parseInt(request.getParameter("count"));
		Book book = new Book();
		book.setName(name);
		book.setPrice(price);
		book.setAuthor(author);
		book.setBookConcern(bookConcern);
		book.setCount(count);
			System.out.println("开始插入");
		boolean addb = BookDao.add(book);
		System.out.println("插入成功");
		if(addb){
			request.getRequestDispatcher("../successful.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("../error.jsp").forward(request, response);
		}
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
