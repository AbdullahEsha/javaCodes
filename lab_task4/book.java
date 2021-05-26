import java.util.*;

public class book{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	
	public book(){
		System.out.println("empty-default\n");
	}
	
	public book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
		System.out.println("Parameterized-Book\n");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle= bookTitle;
	}
	public void setAuthorName(String authorName){
		this.authorName= authorName;
	}
	public void setPrice(double price){
		this.price= price;
	}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity= availableQuantity;
	}
	
	
	
	public String getIsbn(){
		return isbn;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public String getAuthorName(){
		return authorName;
	}
	public double getPrice(){
		return price;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
	
	
	public void addQuantity(int amount){
		
		if(amount>0){
		    availableQuantity = availableQuantity+amount;
		    System.out.println("After Add Quantity: "+ availableQuantity);
		}
		else{
			System.out.println("Invalid...");
		}
	}
	public void sellQuantity(int amount){
		if(amount<=availableQuantity && amount>0){
		    availableQuantity = availableQuantity-amount;
		    System.out.println("After Sell Quantity: "+availableQuantity);
		}
		else{
			System.out.println("Invalid...");
		}
	}
	
	
	public void showDetails(){
		 System.out.println("isbn: "+this.isbn);
		 System.out.println("BookTitle: "+this.bookTitle);
		 System.out.println("AuthorName: "+this.authorName);
		 System.out.println("Price: "+this.price);
		 System.out.println("Available Quantity: "+this.availableQuantity);
	}
}