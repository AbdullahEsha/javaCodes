import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("hj-112");
		sb1.setBookTitle("Java");
		sb1.setAuthorName("Shahriar");
		sb1.setPrice(350.5);
		sb1.setAvailableQuantity(25);
		sb1.setCategory("CS");
		System.out.println("------------------------ default");
		
		System.out.println("Isbn: "+sb1.getIsbn());
		System.out.println("Book Title: "+sb1.getBookTitle());
		System.out.println("Author Name: "+sb1.getAuthorName());
		System.out.println("Price: "+sb1.getPrice());
		System.out.println("Available Quantity: "+sb1.getAvailableQuantity());
		System.out.println("Category: "+sb1.getCategory());
		System.out.println("------------------------");
		
		StoryBook sb2 = new StoryBook("jj-212","C#", "Abdullah", 400.50, 15,"CS");
		System.out.println("------------------------ Parameterized");
		
		sb2.showDetails();
		System.out.println("------------------------");
		
		TextBook tb1 = new TextBook();
		tb1.setIsbn("mm-321");
		tb1.setBookTitle("Math");
		tb1.setAuthorName("Isha");
		tb1.setPrice(250.5);
		tb1.setAvailableQuantity(50);
		tb1.setStandard(20);
		System.out.println("------------------------ default");
		
		System.out.println("Isbn: "+tb1.getIsbn());
		System.out.println("Book Title: "+tb1.getBookTitle());
		System.out.println("Author Name: "+tb1.getAuthorName());
		System.out.println("Price: "+tb1.getPrice());
		System.out.println("Available Quantity: "+tb1.getAvailableQuantity());
		System.out.println("Standard: "+tb1.getStandard());
		System.out.println("------------------------");
		
		TextBook tb2 = new TextBook("py-007","Physic", "Jon", 500.5, 60,50);
		
		System.out.println("------------------------ Parameterized");
		
		tb2.showDetails();
	}
}