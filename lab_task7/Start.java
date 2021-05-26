import java.lang.*;

public class Start{
	public static void main(String args[]){
		TextBook tb1 = new TextBook();
		tb1.setIsbn("hj-150");
		tb1.setBookTitle("Algorithm");
		tb1.setAuthorName("Abid");
		tb1.setPrice(250);
		tb1.setAvaiableQuantity(8);
		tb1.setStandard(4);
		
		TextBook tb2 = new TextBook("hj-135", "C++", "Shahria", 130, 20, 3);
		
		TextBook tb3 = new TextBook("hj-221", "Java", "Abdullah", 310, 15, 4);
		
		TextBook tb4 = new TextBook("hj-217", "C#", "Isha", 120, 18, 3);
		
		TextBook tb5 = new TextBook("hj-170", "PHP", "Rakib", 200, 28, 4);
		
		System.out.println("------------------------");
		
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("zh-663");
		sb1.setBookTitle("Nakshi Kantha Math");
		sb1.setAuthorName("Jasimuddin");
		sb1.setPrice(350);
		sb1.setAvaiableQuantity(12);
		sb1.setCategory("Family");
		
		StoryBook sb2 = new StoryBook("zh-991","Gitanjali","Rabindranath Tagore",450,30,"Song offering");
		
		StoryBook sb3 = new StoryBook("zh-896","Sherlock Holmes","Arthur Conan",520,20,"Detective");
		
		StoryBook sb4 = new StoryBook("zh-792","Devdas","Sarat Chandra Chattopadhyay",650,18,"tragic");
		
		StoryBook sb5 = new StoryBook("zh-692","Agnibeena","Kazi Nazrul Islam",600,25,"Poetry ");
		
		System.out.println("------------------------");
				
		BookShop bs1 = new BookShop("My Library");
		
		System.out.println("------------------------");
		
		bs1.showDetails();
		System.out.println("\n*********** BookShop For Books **************\n");
		bs1.showAllBooks();
		
		System.out.println("\n--------------------------------------\n");
		
		//1
		if(bs1.insertBook(tb1)){
			System.out.println(tb1.getIsbn() + " Inserted for book " + tb1.getBookTitle());
		}
		else{
			System.out.println(tb1.getIsbn() + " Not inserted for book " + tb1.getBookTitle());
		}
		
		//2
		if(bs1.insertBook(tb2)){
			System.out.println(tb2.getIsbn() + " Inserted "+ tb2.getBookTitle());
		}
		else{
			System.out.println(tb2.getIsbn() + " Not Inserted "+ tb2.getBookTitle());
		}
		
		//3
		if(bs1.insertBook(tb3)){
			System.out.println(tb3.getIsbn() + " Inserted "+ tb3.getBookTitle());
		}
		else{
			System.out.println(tb3.getIsbn() + " Not Inserted"+ tb3.getBookTitle());
		}
		
		//4
		if(bs1.insertBook(tb4)){
			System.out.println(tb4.getIsbn() + " Inserted "+ tb4.getBookTitle());
		}
		else{
			System.out.println(tb4.getIsbn() + " Not Inserted "+ tb4.getBookTitle());
		}
		
		//5
		if(bs1.insertBook(tb5)){
			System.out.println(tb5.getIsbn() + " Inserted "+ tb5.getBookTitle());
		}
		else{
			System.out.println(tb5.getIsbn() + " Not Inserted "+ tb5.getBookTitle());
		}
		
		/*----------------*/
		
		//1
		if(bs1.insertBook(sb1)){
			System.out.println(sb1.getIsbn() + " Inserted for book " + sb1.getBookTitle());
		}
		else{
			System.out.println(sb1.getIsbn() + " Not inserted for book " + sb1.getBookTitle());
		}
		
		//2
		if(bs1.insertBook(sb2)){
			System.out.println(sb2.getIsbn() + " Inserted "+ sb2.getBookTitle());
		}
		else{
			System.out.println(sb2.getIsbn() + " Not Inserted "+ sb2.getBookTitle());
		}
		
		//3
		if(bs1.insertBook(sb3)){
			System.out.println(sb3.getIsbn() + " Inserted "+ sb3.getBookTitle());
		}
		else{
			System.out.println(sb3.getIsbn() + " Not Inserted "+ sb3.getBookTitle());
		}
		
		//4
		if(bs1.insertBook(sb4)){
			System.out.println(sb4.getIsbn() + " Inserted "+ sb4.getBookTitle());
		}
		else{
			System.out.println(sb4.getIsbn() + " Not Inserted "+ sb4.getBookTitle());
		}
		
		//5
		if(bs1.insertBook(sb5)){
			System.out.println(sb5.getIsbn() + " Inserted "+ sb5.getBookTitle());
		}
		else{
			System.out.println(sb5.getIsbn() + " Not Inserted "+ sb5.getBookTitle());
		}
		
		System.out.println("\n--------------------------------------\n");
		
		bs1.showDetails();
		System.out.println("\n*********** BookShop For Books **************\n");
		bs1.showAllBooks();
		System.out.println("\n--------------------------------------\n");
		
		if(bs1.removeBook(tb3)){
			System.out.println(tb3.getIsbn() + " Removed ");
		}
		else{
			System.out.println(tb3.getIsbn() + " Not Removed ");
		}
		
		if(bs1.removeBook(tb5)){
			System.out.println(tb5.getIsbn() + " Removed ");
		}
		else{
			System.out.println(tb5.getIsbn() + " Not Removed ");
		}
		/*-------------*/
		
		if(bs1.removeBook(sb4)){
			System.out.println(sb4.getIsbn() + " Removed ");
		}
		else{
			System.out.println(sb4.getIsbn() + " Not Removed ");
		}
		
		//5
		if(bs1.removeBook(sb5)){
			System.out.println(sb5.getIsbn() + " Removed ");
		}
		else{
			System.out.println(sb5.getIsbn() + " Not Removed ");
		}
		
		System.out.println("\n--------------------------------------\n");
		
		bs1.showDetails();
		System.out.println("\n*********** BookShop For Books **************\n");
		bs1.showAllBooks();
		System.out.println("\n--------------------------------------\n");
		
		Book txtb = bs1.searchBook(tb4.getIsbn());
		if(txtb != null){
			System.out.println("Book Found ->  "+ tb4.getIsbn());
			txtb.showDetails();
		}
		else{
			System.out.println("No Book Found with Book Isbn: " + tb4.getIsbn());
		}
		System.out.println("\n--------------------------------------\n");
		
		Book stb = bs1.searchBook(sb2.getIsbn());
		if(stb != null){
			System.out.println("Book Found -> "+ sb2.getIsbn());
			stb.showDetails();
		}
		else{
			System.out.println("No Book Found with Book Isbn: " + sb2.getIsbn());
		}
		
	}
}