package com.nt.sbscn;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Librarian {
	private Library library;
	private String employeeName;
	@Autowired
	public void setLibrary(Library library) {
		this.library = library;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void manageLibrary() {
		library.showLibraryData(); 
		System.out.println("Library Emoloyee Name: "+employeeName);
	}

	}
	
	


