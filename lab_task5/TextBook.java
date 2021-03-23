import java.lang.*;

public class TextBook extends Book{
	private int standard;
	
	
	public TextBook(){
		super();
		System.out.println("empty-defaultTextBook\n");
	}
	
	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){
		super(isbn, bookTitle, authorName, price, availableQuantity);
		System.out.println("Parameterized-TextBook\n");
		this.standard = standard;
	}
	
	
	public void setStandard(int standard){
		this.standard= standard;
	}
	
	
	public int getStandard(){
		return standard;
	}
	
	public void showDetails(){
		 System.out.println("isbn: "+isbn);
		 System.out.println("Book Title: "+bookTitle);
		 System.out.println("Author Name: "+authorName);
		 System.out.println("Price: "+price);
		 System.out.println("Available Quantity: "+availableQuantity);
		 System.out.println("Standard: "+standard);
	}
}