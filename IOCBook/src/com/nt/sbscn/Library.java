package com.nt.sbscn;

import java.util.ArrayList;

public class Library {
	private String libraryName;
	ArrayList<Book>books;
	
	//constructor injection 
	public Library(String libraryName, ArrayList<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	
	public void showLibraryData() {
		System.out.println("Library Name is: "+libraryName);
		for(Book book: books) {
			book.displayBookDetails();
		}

	}
	}
