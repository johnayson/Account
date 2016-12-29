/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: A bank account class with methods to deposit, 
 * withdraw and check the balance.
 * Due date: 10/5/2015
 * File name: Account.java
 * Lab #6
 * Programmed by John Ayson.
 */

//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************

public class Account
{
    private double balance; //bank account's balance.
    private String name;  //owner's name
    private long acctNum;  //user's account number
    private static int numAccounts = 0; //keeps the number of accounts created.

  //----------------------------------------------
  //Constructor -- initializes balance and owner; generates random
  //account number, counter for number of accounts.
  //----------------------------------------------
  public Account(double initBal, String owner)
  {
    balance = initBal;
    name = owner;
    acctNum = (int) (Math.random() * Integer.MAX_VALUE);
    numAccounts++;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds\n");
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // Also deducts fee from account.
  //----------------------------------------------
  public void withdraw(double amount, double fee)
  {
    if (balance >= amount)
	{
	   balance -= amount;
	   balance -= fee;
	}
    else
       System.out.println("Insufficient funds\n");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }

  //----------------------------------------------
  // Returns number of accounts
  //----------------------------------------------
  public static int getNumAccounts()
  {
	  return numAccounts;
  }
  
  //----------------------------------------------
  // Returns account name.
  //----------------------------------------------
  public String getName()
  {
	  return name;
  }
  
  //----------------------------------------------
  // Closes current account, sets balance to 0.
  //----------------------------------------------
  public void close()
  {
	  name += "CLOSED" ;
	  balance = 0; 
	  numAccounts--;
  }
 
  //----------------------------------------------
  // Consolidates accounts with the same account names but different
  // account numbers. Creates new joint account and closes old ones. 
  //----------------------------------------------
  public static Account consolidate(Account acct1, Account acct2)
  { 
	 if ((acct1.getName().equals(acct2.getName())) && (acct1.getAcctNumber() != acct2.getAcctNumber()))
	 {
	    double newBalance = acct1.getBalance() + acct2.getBalance();
	    Account acct3 = new Account(newBalance, acct1.getName());
	    acct1.close();
	    acct2.close();
	    System.out.println("Result account is Name: " + acct3.getName());
	    System.out.println(acct3.toString());
	    return acct3;
	 }
	 else
	 {
		if (acct1.getName() != acct2.getName())
		{		
		   System.out.println("Sorry, accounts with different names " +
	                          "cannot be consolidated.");
		}
		if (acct1.getAcctNumber() == acct2.getAcctNumber())
		{
		   System.out.println("Sorry, accounts with the same number" +
				   			  "cannot be consolidated.");
		}
		
	    System.out.println("Result account is null.");
		return null;
	 }
   }
  
  //----------------------------------------------
  // Transfers money from one account to another.
  //----------------------------------------------
  public void transfer(Account acct, double amount)
  {
	  if (balance >= amount)
	  {
		 withdraw(amount);
	     acct.deposit(amount);
	     acct.getBalance();
	  }
	  else
		 withdraw(amount);
  }
 
  //----------------------------------------------
  // Transfers money between two accounts without
  // going through either account.
  //----------------------------------------------
  public static void transfer(Account acct1, Account acct2, double amount)
  {
      acct1.transfer(acct2, amount);	  
  }
  
  //----------------------------------------------
  // Returns a string containing the name, acct number, and balance.
  //----------------------------------------------

    public String toString()
    {
       return "Name: " + name + 
    		   "\nAcct #: " + acctNum + 
    		   "\nBalance: " + balance;
    }
 }