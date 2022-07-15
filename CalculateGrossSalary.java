/*1.write a program to calculate gross salary of an employee. Basic salary should be taken from user.
If basic salary is grater that 1500 ,HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee.*/

package basicprogram;
import java.util.*;
public class CalculateGrossSalary {

	public static void main(String[] args) {
		int basic;
		float DA,HRA;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salaray: ");
		basic=sc.nextInt();
		if(basic>1500)
		{
			 DA=basic*0.9f;
			HRA=basic*0.2f;
		}
		else {
			 HRA=500.00f;
			 DA=basic*0.7f;
		}
		float gross_salary=DA+HRA+basic;
		System.out.println(gross_salary);
		

	}


		
	}


