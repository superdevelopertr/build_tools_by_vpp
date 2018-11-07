package com.virtualpairprogrammers.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.virtualpairprogrammers.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application.xml")
public class TestBookService {

	@Autowired
	private BookService bs;
	
	@Test
	public void test_GetExistingBookById() {
		//arrange
		Book newBook = new Book("A1234","Kingdom of Heaven","Grange", 12d);
		bs.registerNewBook(newBook);
		
		//act
		Book foundBook = bs.getBookById(newBook.getId());
		
		assertEquals(newBook.getId(), foundBook.getId());
	}
	
	@Test
	public void test1() {
		//fail("");
	}
	
}