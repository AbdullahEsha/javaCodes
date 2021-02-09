import java.util.*;
public class account{
	private   int accountNumber;
	private String   accountHolderName;
	private double   balance;
	
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName= accountHolderName;
	}
	public void setBalance(double balance){
		this.balance= balance;
	}
	
	
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolderName(){
		return   accountHolderName;
	}
	public double getBalance(){
		return balance;
	}
	
    public void showDetails(){
		 System.out.println(this.accountNumber + " " + this.accountHolderName + " " + this.balance);
	}
	
	//public static void  main(String args[]){
		//account a=  new account();
		
		//a.setAccountNumber (37577);
		//a.setAccountHolderName("Abdullah");
		//a.setBalance(3.66);
		
		//a.showDetails();
	//}
}