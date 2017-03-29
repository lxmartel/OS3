package exception;

import pkgLibrary.Book;

public class BookException extends Exception {
	Book error;
	
	public BookException(Book b){
		error = b;
	}
	
	public Book getErrorBook(){
		return error;
	}
}
