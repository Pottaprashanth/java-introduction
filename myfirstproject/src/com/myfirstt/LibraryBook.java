package com.myfirstt;

public class LibraryBook {
	int bookID;
	String bookTitle;
	String authorName;
	int availableCopies;
	static String libraryName;
	String librarianName;

	public void displayBookDetails() {
		System.out.println("********** BooK Details *********");
		System.out.println("Book ID :" + bookID);
		System.out.println("Book Title :" + bookTitle);
		System.out.println("Author Name :" + authorName);
		System.out.println("Available Copies :" + availableCopies);
		System.out.println("Library Name :" + libraryName);
		System.out.println("librarianName :" + librarianName);

		System.out.println();
	}

	public void displayLibraryDetails() {
		System.out.println("********** Library Details **********");
		System.out.println("librarianName :" + librarianName);
		System.out.println("Library Name :" + libraryName);
	}

	public void changeLibrarian() {
		librarianName = "ganesh";
	}

	public static void main(String[] args) {

		LibraryBook b1 = new LibraryBook();
		b1.bookID = 101;
		b1.bookTitle = "Java Full Stack";
		b1.authorName = "Tharu surya";
		b1.availableCopies = 5;
		libraryName = "vcube";
		b1.librarianName = "hari";

		b1.displayBookDetails();
		b1.changeLibrarian();
		b1.displayBookDetails();

		LibraryBook b2 = new LibraryBook();
		b2.bookID = 102;
		b2.bookTitle = "SQL";
		b2.authorName = "Sanjay";
		b2.availableCopies = 10;
		b2.librarianName = "hari";

		b2.displayBookDetails();
		b2.changeLibrarian();
		b2.displayBookDetails();

		LibraryBook b3 = new LibraryBook();
		b3.librarianName = "hari";
		b3.displayLibraryDetails();
		b3.changeLibrarian();
		b3.displayLibraryDetails();

	}
}
