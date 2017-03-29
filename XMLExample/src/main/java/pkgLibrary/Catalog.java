package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import exception.BookException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)


public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public Book GetBook(String id) throws BookException{
		Book book = null;
		
		for(Book b : books){
			if(b.getId().equals(id))
				book = b;
		}
		if(book == null){
			book = new Book(id);
			throw new BookException(book);
		}
		return book;
	}
	
	public void AddBook(String id) throws BookException{
		for(Book b : books){
			if(b.getId().equals(id))
				throw new BookException(b);
		}
		Book newBook = new Book(id);
		books.add(newBook);
		
	}
	

	

	
	


	
	
	
	
}
