import java.util.*;

public class start{
	public static void main(String args[])
	{
		System.out.println("\ntest 1\n");
		book box[] = new book[4];
		box[0] = new book();
		box[0].setIsbn("sl11gsqgqf");
		box[0].setBookTitle("S-110");
		box[0].setAuthorName("somthing");
		box[0].setPrice(500.5);
		box[0].setAvailableQuantity(5000);
		box[0].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\ntest 2\n");
		box[1] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[1].showDetails();
	}
}