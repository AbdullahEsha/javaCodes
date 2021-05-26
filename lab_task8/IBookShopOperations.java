import java.lang.*;

public interface IBookShopOperations{
	boolean insertBook(Book b);
    boolean removeBook(Book b);
    void showAllBooks();
    Book searchBook(String isbn);
}