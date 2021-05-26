import java.util.*;

public class start{
	public static void main(String args[])
	{
		book box[] = new book[5];
		
		System.out.println("\nDefault test 1\n");
		box[0] = new book();
		box[0].setIsbn("sl11gsqgqf");
		box[0].setBookTitle("S-110");
		box[0].setAuthorName("somthing");
		box[0].setPrice(500.5);
		box[0].setAvailableQuantity(5000);
		box[0].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\nParameterized test 1\n");
		box[0] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[0].showDetails();
		
		System.out.println("\n--------------------------");
		
		System.out.println("\nDefault test 2\n");
		box[1] = new book();
		box[1].setIsbn("sl11gsqgqf");
		box[1].setBookTitle("S-110");
		box[1].setAuthorName("somthing");
		box[1].setPrice(500.5);
		box[1].setAvailableQuantity(5000);
		box[1].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\nParameterized test 2\n");
		box[1] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[1].showDetails();
		
		System.out.println("\n--------------------------");
		
		System.out.println("\nDefault test 3\n");
		box[2] = new book();
		box[2].setIsbn("sl11gsqgqf");
		box[2].setBookTitle("S-110");
		box[2].setAuthorName("somthing");
		box[2].setPrice(500.5);
		box[2].setAvailableQuantity(5000);
		box[2].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\nParameterized test 3\n");
		box[2] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[2].showDetails();
		
		System.out.println("\n--------------------------");
		
		System.out.println("\nDefault test 4\n");
		box[3] = new book();
		box[3].setIsbn("sl11gsqgqf");
		box[3].setBookTitle("S-110");
		box[3].setAuthorName("somthing");
		box[3].setPrice(500.5);
		box[3].setAvailableQuantity(5000);
		box[3].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\nParameterized test 4\n");
		box[3] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[3].showDetails();
		
		System.out.println("\n--------------------------");
		
		System.out.println("\nDefault test 5\n");
		box[4] = new book();
		box[4].setIsbn("sl11gsqgqf");
		box[4].setBookTitle("S-110");
		box[4].setAuthorName("somthing");
		box[4].setPrice(500.5);
		box[4].setAvailableQuantity(5000);
		box[4].showDetails();
		
		System.out.println("\n--------------------------");
		
	    System.out.println("\nParameterized test 5\n");
		box[4] = new book("jl11gs", "S-110","anything",5.6664,500);
		box[4].showDetails();
	}
}