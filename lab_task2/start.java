import java.util.*;

public class start{
	public static void main(String args[])
	{
		book b1 = new book();
		
		b1.setIsbn("sl11gsqgqf");
		b1.setBookTitle("S-110");
		b1.setAuthorName("somthing");
		b1.setPrice(500.5);
		b1.setAvailableQuantity(5000);
		
		System.out.println("isbn: "+b1.getIsbn());
		System.out.println("BookTitle: "+b1.getBookTitle());
		System.out.println("AuthorName: "+b1.getAuthorName());
		System.out.println("Price: "+b1.getPrice());
		System.out.println("Available Quantity: "+b1.getAvailableQuantity());
		
		//b1.showDetails();
		b1.sellQuantity(300);
		
		System.out.println("-----------------------------");
		
		book b2 = new book("sfd11ss33", "Ihraz-11","Ihraz", 4500.0, 33);
		b2.showDetails();
		b2.addQuantity(20);
	}
}