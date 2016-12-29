/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: Test the consolidate method of the Account class.
 * Due date: 10/5/2015
 * File name: TestAccounts2.java
 * Lab #6
 * Programmed by John Ayson.
 */

import java.util.Scanner;

public class TestAccounts2
{
	//asks for the user for input for the account's name and consolidates second and third.
    public static void main(String[] args)
    {
	   Account acct1, acct2, acct3;  //sample accounts
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter the name for the first account: ");
	   	  String name1 = scan.nextLine();
	   acct1 = new Account(100, name1);
	   System.out.println("Created account for " + acct1.getName() + " with balance $100.\n");
	   
	   System.out.print("Enter the name for the second account: ");
		  String name2 = scan.nextLine();
	   acct2 = new Account(100, name2);
       System.out.println("Created account for " + acct2.getName() + " with balance $100.\n");    
       
       System.out.print("Enter the name for the third account: ");
	      String name3 = scan.nextLine();
	   acct3 = new Account(100, name3);
	   System.out.println("Created account for " + acct2.getName() + " with balance $100.\n");
	   
	   System.out.println("Closing first account.");
	   acct1.close();
	   
	   System.out.println("Trying to consolidate second and third accounts.");
	   Account.consolidate(acct2, acct3);
	  
	   System.out.println("Number of accounts is now " + Account.getNumAccounts());
    }
}