package com.nt.sbscn;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
private int bookId;
private String bookTitle;
Author author;

public Book(int bookId, String bookTitlt) {
	this.bookId=bookId;
	this.bookTitle=bookTitlt;
	
}
@Autowired
public void setAuthor(Author author) {
	this.author=author;
}

public void displayBookDetails() {

	System.out.println("Book Id: "+bookId);
	System.out.println("Book Title: "+bookTitle);
	author.displayAuthorInfo();
}
}
