import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		TextBook tb1 = new TextBook();
		tb1.setIsbn("mm-321");
		tb1.setBookTitle("Math");
		tb1.setAuthorName("Isha");
		tb1.setPrice(250.5);
		tb1.setAvailableQuantity(50);
		tb1.setStandard(20);
		
		TextBook tb2 = new TextBook("mm-305", "Data Structure", "abc", 300, 12, 3);
		TextBook tb3 = new TextBook("mm-360", "Java", "pqr", 300, 12, 3);
		TextBook tb4 = new TextBook("mm-315", "C#", "mnp", 300, 12, 3);
		TextBook tb5 = new TextBook("mm-310", "Web Technologies", "dgh", 300, 12, 3);
		
		System.out.println("------------------------");
		
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("hj-112");
		sb1.setBookTitle("The Lottery");
		sb1.setAuthorName("Jackson");
		sb1.setPrice(350.5);
		sb1.setAvailableQuantity(25);
		sb1.setCategory("Short story");
		
		
		StoryBook sb2 = new StoryBook("hj-115","Four women","ABC",250.5,25,"Family");
		StoryBook sb3 = new StoryBook("hj-180","Sherlock Holmes","Arthur Conan",220.0,23,"Detective");
		StoryBook sb4 = new StoryBook("hj-123","3 Goyenda","Rakib hasan",230.0,20,"Detective");
		StoryBook sb5 = new StoryBook("hj-132","Heidi","Johanna Spyri",330.5,18,"Novel");
		
		
		
		System.out.println("------------------------");
				
		BookShop bs1 = new BookShop("My Library");
		
		System.out.println("------------------------");
		
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		System.out.println("\n--------------------------------------\n");
		
		//1
		if(bs1.insertTextBook(tb1))
		{
			System.out.println(tb1.getIsbn() + " Inserted for book " + tb1.getBookTitle());
		}
		else
		{
			System.out.println(tb1.getIsbn() + " Not inserted for book " + tb1.getBookTitle());
		}
		
		//2
		if(bs1.insertTextBook(tb2))
		{
			System.out.println(tb2.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(tb2.getIsbn() + " Not Inserted");
		}
		
		//3
		if(bs1.insertTextBook(tb3))
		{
			System.out.println(tb3.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(tb3.getIsbn() + " Not Inserted");
		}
		
		//4
		if(bs1.insertTextBook(tb4))
		{
			System.out.println(tb4.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(tb4.getIsbn() + " Not Inserted");
		}
		
		//5
		if(bs1.insertTextBook(tb5))
		{
			System.out.println(tb5.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(tb5.getIsbn() + " Not Inserted");
		}
		
		System.out.println("--------------------------------------");
		
		//1
		if(bs1.insertStoryBook(sb1))
		{
			System.out.println(sb1.getIsbn() + " Inserted for book " + sb1.getBookTitle());
		}
		else
		{
			System.out.println(sb1.getIsbn() + " Not inserted for book " + sb1.getBookTitle());
		}
		
		//2
		if(bs1.insertStoryBook(sb2))
		{
			System.out.println(sb2.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(sb2.getIsbn() + " Not Inserted");
		}
		
		//3
		if(bs1.insertStoryBook(sb3))
		{
			System.out.println(sb3.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(sb3.getIsbn() + " Not Inserted");
		}
		
		//4
		if(bs1.insertStoryBook(sb4))
		{
			System.out.println(sb4.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(sb4.getIsbn() + " Not Inserted");
		}
		
		//5
		if(bs1.insertStoryBook(sb5))
		{
			System.out.println(sb5.getIsbn() + " Inserted");
		}
		else
		{
			System.out.println(sb5.getIsbn() + " Not Inserted");
		}
		
		System.out.println("\n--------------------------------------\n");
		
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		System.out.println("\n--------------------------------------\n");
		
		if(bs1.removeTextBook(tb3))
		{
			System.out.println(tb3.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(tb3.getIsbn() + " Not Removed");
		}
		
		if(bs1.removeTextBook(tb5))
		{
			System.out.println(tb5.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(tb5.getIsbn() + " Not Removed");
		}
		/*-------------*/
		
		if(bs1.removeStoryBook(sb4))
		{
			System.out.println(sb4.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(sb4.getIsbn() + " Not Removed");
		}
		
		//5
		if(bs1.removeStoryBook(sb5))
		{
			System.out.println(sb5.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(sb5.getIsbn() + " Not Removed");
		}
		
		System.out.println("\n--------------------------------------\n");
		
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		System.out.println("\n--------------------------------------\n");
		
		TextBook txtb = bs1.searchTextBook(tb4.getIsbn());
		if(txtb != null)
		{
			System.out.println("Book Found....");
			txtb.showDetails();
		}
		else
		{
			System.out.println("No Book Found with Book Isbn: " + tb4.getIsbn());
		}
		System.out.println("\n--------------------------------------\n");
		
		StoryBook stb = bs1.searchStoryBook(sb2.getIsbn());
		if(stb != null)
		{
			System.out.println("Book Found....");
			stb.showDetails();
		}
		else
		{
			System.out.println("No Book Found with Book Isbn: " + sb2.getIsbn());
		}
		
	}
}