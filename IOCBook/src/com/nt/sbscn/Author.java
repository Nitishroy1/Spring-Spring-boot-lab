package com.nt.sbscn;

public class Author {
	private int authorId;
	private String authorName;
	public Author(int authorId, String authorName) {
		
		this.authorId=authorId;
		this.authorName=authorName;
	}
	
	public void displayAuthorInfo() {
		System.out.println("Author Id: "+authorId);
		System.out.println("Author Name: "+authorName);
	}


}
