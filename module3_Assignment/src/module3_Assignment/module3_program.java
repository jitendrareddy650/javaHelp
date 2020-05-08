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

class AC {
	int balance;
	int id;
	String name;
	int amount;
	
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
		System.out.println("Payment "+ amount +" Deposited sucessfully ! After deposite " + balance);
	}
	
	void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Balance is too low to withdrawn");
		}
		else {
			balance -= amount;
			System.out.println("Amount "+ amount +" withdrawn sucessfully ! After withdrawn balance is "+balance);
		}
				
	}
	void calculateintrest(double balance) {
		double it = (balance * 1);
		System.out.println("Your account is not SB account so no intrest applied ");
		
	}
	
}
class sbAccount extends AC{ // child class
	sbAccount(int balance, int id, String name, int amount){
		this.balance=balance;
		this.id = id;
		this.name = name;
		this.amount = amount;
		
		
		System.out.println("Your Saving Bank Account created sucessfully !");
	}

	void calculateintrest(double balance) {
		System.out.println("Congratulation ! Your SB Account applies 4% interest");
		double it = (balance * 4) / 100;
		System.out.println("Your interest for one month is " + it);
	}
	
}
class currentAccount extends AC{ // child class
	currentAccount(int balance, int id, String name, int amount){
		this.balance=balance;
		this.id = id;
		this.name = name;
		this.amount = amount;
		
		System.out.println("Your Current Bank Account created sucessfully !");
	}
	
}	
	
public class module3_program {

public static void main(String[] args) {
	int AC_type;
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("Select which type account you want to create:");
	System.out.println("1. Saving Account");
	System.out.println("2. Current Account");
	
	AC ac = null;// AC();
	//sbAccount sb = new sbAccount();
	
	
	//CA ca =	new CA();
	
	AC_type = input.nextInt();
	
	System.out.println("Enter your account name :");
	String AC_Name = input.next();
	System.out.println("Enter your account number as per your desire :");
	int id = input.nextInt();
	System.out.println("Enter your initial amount you want to deposite :");
	int balance = input.nextInt();
	
			switch (AC_type) {

			case 1:
				ac = new sbAccount(balance, id, AC_Name, 0);
				break;
			case 2:
				ac = new currentAccount(balance, id, AC_Name, 0);
				break;
			}
	
			ac.acName(AC_Name);
			ac.acdetails(id, balance);
			ac.deposite(1000);
			ac.withdraw(500);
			ac.calculateintrest(balance);

			input.close();
		
	}
}
	

	
	
	
	


