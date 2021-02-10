import java.util.*;

public class start{
	public static void  main(String args[]){
		account a=  new account();
		
		a.setAccountNumber(37577);
		a.setAccountHolderName("Abdullah");
		a.setBalance(3.66);
		
		a.showDetails();
	}
}