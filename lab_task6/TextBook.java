import java.lang.*;

public class TextBook extends Book
{
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
}