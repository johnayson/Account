/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: A bank account class to transfer between 2 accounts.
 * Due date: 10/5/2015
 * File name: TransferTest.java
 * Lab #6
 * Programmed by John Ayson
 */
import java.util.Scanner;

public class TransferTest 
{
	//Prints account info and prompts the user if he wants to transfer funds.
   public static void main(String[] args)
   {
	  Account acct1, acct2;
	  int choice, transferAmount;
	  acct1 = new Account(100, "Joe");  
	  acct2 = new Account(100, "Mary");
	  
	  System.out.println("Account1 Summary");
	  System.out.println("----------------");
	  System.out.println("Name: " + acct1.getName());
	  System.out.println("Acct #: " + acct1.getAcctNumber());
	  System.out.println("Balance: " + acct1.getBalance());
	  System.out.println("Account2 Summary");
	  System.out.println("----------------");
	  System.out.println("Name: " + acct2.getName());
	  System.out.println("Acct #: " + acct2.getAcctNumber());
	  System.out.println("Balance: " + acct2.getBalance() );
	  
	  // Prints menu until user chooses to quit.
	  do
	  {
		 System.out.println("Menu");
		 System.out.println("----");
		 System.out.println("1: Transfer from Account1 to Account2");
		 System.out.println("2: Transfer from Account2 to Account1");
		 System.out.println("3: Quit\n");
		 System.out.print("Enter your choice: ");
		 Scanner scan = new Scanner(System.in);
		 
		 // User has option to transfer between accounts or quit.
		 switch (choice = scan.nextInt())
		 {
		    case 1:
		    System.out.println("Enter amount to transfer");
		       transferAmount = scan.nextInt();
		    Account.transfer(acct1, acct2, transferAmount);
		    System.out.println("New Account1 balance: " + acct1.getBalance());
		    System.out.println("New Account2 balance: " + acct2.getBalance() + "\n");
		       break;
		    case 2:
		    System.out.println("Enter amount to transfer");
		       transferAmount = scan.nextInt();
		    Account.transfer(acct2, acct1, transferAmount);
		    System.out.println("New Account1 balance: " + acct1.getBalance());
		    System.out.println("New Account2 balance: " + acct2.getBalance() + "\n");
		       break;
		    case 3:
		       break; 
		    default:
		       System.out.println("Error. Input must be 1, 2, or 3");
		       break;
		 }
		 
	  } while (choice != 3);
	  
   }

}
