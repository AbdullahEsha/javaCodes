import java.util.*;

public class storyBook{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String standard;
	private static double discountRate;
	
	public storyBook(){
		System.out.println("empty-default");
	}
	
	public storyBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String standard){
		System.out.println("Parameterized-storyBook");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.standard = standard;
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
	public void setStandard(String standard){
		this.standard = standard;
	}
	public static void setDiscountRate(double rate){
		this.rate = rate;
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
	public int getStandard(){
		return standard;
	}
	public static double getDiscountRate( ){
		return discountRate;
	}
	
	
	public void addQuantity(int amount){
		availableQuantity = amountavailableQuantity+amount;
		System.out.println("After Add Quantity: "+ availableQuantity);
	}
	public void sellQuantity(int amount){
		availableQuantity = availableQuantity-amount;
		System.out.println("After Sell Quantity: "+availableQuantity);
	}
	
	public void showDetails(){
		 System.out.println("isbn: "+this.isbn);
		 System.out.println("BookTitle: "+this.bookTitle);
		 System.out.println("AuthorName: "+this.authorName);
		 System.out.println("Price: "+this.price);
		 System.out.println("Available Quantity: "+this.availableQuantity);
		 System.out.println("Available Standard: "+this.standard);
		 System.out.println("Available DiscountRate: "+this.discountRate);
	}
}