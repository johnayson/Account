/*
 * Class: CS 111B OBjected-Oriented Programming Methodologies in Java
 * Description: Test the numAccts method.
 * Due date: 10/5/2015
 * File name: TestAccounts1.java
 * Lab #6
 * Programmed by John Ayson
 */

//**********************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//**********************************************
import java.util.Scanner;

public class TestAccounts1
{	
    public static void main(String[] args)
    {
	   Account testAcct = null;

	   Scanner scan = new Scanner(System.in);

	   System.out.println("How many accounts would you like to create?");
	   int num = scan.nextInt();

	   for (int i=1; i<=num; i++)
	   {
	      testAcct = new Account(100, "Name" + i);
	      System.out.println("\nCreated account " + testAcct);
	   }
	   
	 System.out.println (Account.getNumAccounts());
    }
}
   