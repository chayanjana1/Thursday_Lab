/*2.create a bank class to calculate withdraw and deposit.
 * if amount will be given from user.if amount is 
 * sufficient then “withdraw successful” will going to print. 
 * Later on deposit 5000rs in the account balance.*/


package basicprogram;
import java.util.*;
public class BankTransaction {
	public static void main(String[] args) {
		float balance,withdraw,deposite=5000,remaining,balance1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Balance: ");
		balance=sc.nextFloat();
		System.out.println("Enter the ammout you want to withdraw: ");
		withdraw=sc.nextFloat();
		if(withdraw>balance)
			System.out.println("insufficient Balance");
		else
		{
			balance=balance-withdraw;
			System.out.println("withdraw successful");
			System.out.println("Reamining balace is: "+balance);
		}
		
		System.out.println("Do you want to deposite:(Y/N)");
		char ch=sc.next().charAt(0);
		if(ch=='Y')
		{
			
			balance1=balance+deposite;
			System.out.println("Your ac is credited with "+balance1);
		}
		else
			System.out.println("Thank You");

	}
}
