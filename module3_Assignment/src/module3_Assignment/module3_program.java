/* Write classes to hold Account, SB-Account and Current-Account details. [Here
implement the concept of inheritance.]
>>	The common properties of the account are Account number, name and amount.
>>	Specifics of SB account is 4% interest to be paid per month.
>> 	Implement the run-time polymorphism by creating base class variable and derived class
object.
>> 	Ask the user for which type of account to be created then create the corresponding
account (Note: Use scanner class).
>> 	Implement function overriding by having deposit and withdraw functions and perform
the required action accordingly.
Ensure base class can’t be instantiated. (Note: Abstract keyword can be used).

*/
package module3_Assignment;

import java.util.Scanner;

abstract class AC {
	abstract void acName(String name);
	abstract void myBalance(int balance);
	abstract void acdetails(int id, int balance);
	abstract void deposite(int amount);
	abstract void withdraw(int amount);
	
}
class sbAccount extends AC{ // child class
	int balance;
	void acName(String name) {
		System.out.println("Your account name is "+name);
	}
	void myBalance(int balance) {
		int total = balance;
	}
	void acdetails(int id, int balance) {
		System.out.println(" Your account number is " + id);
		System.out.println(" Your current balance is :"+balance);
	}
	void deposite(int amount) { //how i can add my amount to my balance i am not able to add using inheritance
		balance += amount;
		System.out.println("Payment Deposited sucessfully ! Thanks for using" + balance);
	}
	void withdraw(int amount) {
		
		System.out.println("Amount withdrawn sucessfully ! Thanks for visit");
	}
	
}
	
	
	
public class module3_program {

public static void main(String[] args) {
	int AC_type;
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("Select which type account you want to create:");
	System.out.println("1. Saving Account");
	System.out.println("2. Current Account");
	
	//AC ac = null;//new AC();
	sbAccount sb = new sbAccount();
	/*
	SB sb = new SB();
	CA ca =	new CA();
	*/
	AC_type = input.nextInt();
	
	System.out.println("Enter your account name :");
	String AC_Name = input.next();
	System.out.println("Enter your account number as per your desire :");
	int id = input.nextInt();
	System.out.println("Enter your amount you want to deposite :");
	int balance = input.nextInt();
	
	sb.acName(AC_Name);
	sb.acdetails(id, balance);
	sb.deposite(1000);

			
	input.close();
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	double balance;
	
	AC() {
		balance = 10000;
		System.out.println("Account object constructed");
		
	}
	void showAcDetails(int AC_no, String AC_Name) {
		System.out.println(" Your account has been created sucessfully !");
		System.out.println(" Your account name is :" + AC_Name + " A/C number is" + AC_no);
		System.out.println(" Your current balance is :" + balance);
	}	
	void deposit(double amount) { // Deposit function
		this.balance += amount;
		System.out.println("Balance after deposite :" + balance);
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	void withdraw(double amount) { // Withdraw function
		
		if(amount>balance) {
			System.out.println("Balance is too low to withdrawn");
		}
		else {
			this.balance -= amount;
		}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	}
	void calculateintrest(double balance) {
		double it = (balance * 4) / 100;
		System.out.println("After intrest of one month balance is " + it);
	}
	
}	
class SB extends AC{
	int intrest;
	SB(){
		
		System.out.println("SB account object consturcted");
		super.balance = balance;
	}
	
	void deposit(double amount) { // Deposit function
		super.balance = balance + amount;
		System.out.println("Balance after deposite :" + balance);
	}

	void withdraw(double amount) { // Withdraw function
		
		
	}
	void calculateintrest() {
		
	}
}
class CA extends AC{
	CA(){
		System.out.println("Current account object constructed successfully");
	}
	
	void showDetails() {
		System.out.println("Your Current account has been created sucessfully !");
	}
}
*/


