package booksystem;

public class Book {

	private int bookId;
	private String bookName;
	private double bookprice;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public Book(int bookId, String bookName, double bookprice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookprice=" + bookprice + ", getBookId()="
				+ getBookId() + ", getBookName()=" + getBookName() + ", getBookprice()=" + getBookprice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		
	}
	
	
	
	}


