package com.test;

import com.dao.BookDao;
import com.model.Book;


public class Testninsert {
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("2");
		book.setName("2");
		book.setBookConcern("2");
		book.setPrice((float) 2.0);
		book.setCount(2);
		System.out.println(BookDao.updateById(book, 53));
	}
}
