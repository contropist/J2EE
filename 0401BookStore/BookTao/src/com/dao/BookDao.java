package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Book;


public class BookDao {
	public static Connection getConnection(){
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //sqlserver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败！");
			e.printStackTrace();
		}
		Connection con = null;
		try {
			//con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=master", "sa","yh_415");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("连接成功！");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("连接失败！");
			e.printStackTrace();
		}
		return con;
	}
	
	
	//查看所有图书
		public static List<Book> all(){
			List<Book> books = new ArrayList<Book>();
			String sql = "select * from book";
			PreparedStatement pst = null;
			try {
				pst = BookDao.getConnection().prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					Book book = new Book();
					book.setId(rs.getInt("id"));
					book.setName(rs.getString("name"));
					book.setPrice(rs.getFloat("price"));
					book.setAuthor(rs.getString("author"));
					book.setBookConcern(rs.getString("bookConcern"));
					book.setCount(rs.getInt("count"));
					books.add(book);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return books;
			
		}
		
		//通过id查图书
		public static Book selectById(int id){
			String sql = "select * from book where id ="+id;
			Book book = new Book();
			PreparedStatement pst = null;
			try {
				pst = BookDao.getConnection().prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					
					book.setId(rs.getInt("id"));
					book.setName(rs.getString("name"));
					book.setPrice(rs.getFloat("price"));
					book.setAuthor(rs.getString("author"));
					book.setBookConcern(rs.getString("bookConcern"));
					book.setCount(rs.getInt("count"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return book;
			
		}
		
	//查看当前最大id
		public static int maxid(){
			String sql = "select max(id) from book";
			int max = 0;
			PreparedStatement pst = null;
			try {
				pst = BookDao.getConnection().prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
					max = rs.getInt("max(id)");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return max;
			
		}
		
	
	//添加图书
	public static boolean add(Book book){
		String sql = "insert into book values(?,?,?,?,?,?)";
		PreparedStatement pst = null;
		try {
			int id = BookDao.maxid();
			id++;
			System.out.println(id);
			pst = BookDao.getConnection().prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, book.getName());
			pst.setFloat(3, book.getPrice());
			pst.setString(4, book.getAuthor());
			pst.setString(5, book.getBookConcern());
			pst.setInt(6, book.getCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int row  = pst.executeUpdate();
			if (row > 0) {
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	//修改图书
	public static boolean updateById(Book book,int id){
		String sql = "update book set name=?,price=?,author=?,bookConcern=?,count=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = BookDao.getConnection().prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setFloat(2, book.getPrice());
			pst.setString(3, book.getAuthor());
			pst.setString(4, book.getBookConcern());
			pst.setInt(5, book.getCount());
			pst.setInt(6, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int row  = pst.executeUpdate();
			if (row > 0) {
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	//删除图书
	public static boolean deleteById(int id){
		String sql = "delete from book where id=?";
		PreparedStatement pst = null;
		try {
			pst = BookDao.getConnection().prepareStatement(sql);
			pst.setInt(1, id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int row  = pst.executeUpdate();
			if (row > 0) {
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
