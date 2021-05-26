import java.lang.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook(){
		super();
		System.out.println("empty-defaultStoryBook\n");
	}
	
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
		super(isbn, bookTitle, authorName, price, availableQuantity);
		System.out.println("Parameterized-StoryBook\n");
		this.category = category;
	}
	
	public void setCategory(String category){
		this.category= category;
	}
	
	
	public String getCategory(){
		return category;
	}
}
		