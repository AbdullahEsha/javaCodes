import java.util.*;

public class start{
	public static void main(String args[])
	{
		storyBook sb1 = new storyBook();
		sb1.setIsbn("sl11gsqgqf");
		sb1.setBookTitle("S-110");
		sb1.setAuthorName("somthing");
		sb1.setPrice(500.5);
		sb1.setAvailableQuantity(5000);
		sb1.setCategory("ffafa");
		sb1.setDiscountRate(5000.227);
		sb1.showDetails();
	    System.out.println("\n test 1");

		
		storyBook sb2 = new storyBook("gsggsgs", "hshsgs","hdhdhhd",5.6664,500,"ffffb");
		tb1.showDetails();
		System.out.println("\n test 2");
		
		textBook tb1 = new textBook();
		tb1.setIsbn("sl11gsqgqf");
		tb1.setBookTitle("S-110");
		tb1.setAuthorName("somthing");
		tb1.setPrice(500.5);
		tb1.setAvailableQuantity(5000);
		tb1.setStandard("ffafa");
		tb1.setDiscountRate(5000.227);
		tb1.showDetails();
		System.out.println("\n test 3");
		
		textBook tb2 = new textBook("gsggsgs", "hshsgs","hdhdhhd",5.6664,500,"ffffb");
		tb2.showDetails();
		System.out.println("\n test 4");
		
		
	}
}