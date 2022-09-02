package restaurant_biling;

import java.util.Scanner;

public class Restaurant_billiing {

	public static void main(String[] args)
	{
		String ch;
		int id;
		Scanner sc=new Scanner(System.in);
		//using map
		System.out.println("1.Biriyani Combo    Rs.150");
		System.out.println("2.Chineese Combo    Rs.250");
		System.out.println("3.Italian Combo     Rs.450");
		System.out.println("4.Bada Platter      Rs.200");
		do {
			System.out.println("Enter food id");
			id=sc.nextInt();
			switch(id) {
			case 1:RMS.BM("Biriyani Combo", 150);
			break;
			case 2:RMS.BM("Chineese Combo", 250);
			break;
			case 3:RMS.BM("Italian Combo", 450);
			break;
			case 4:RMS.BM("Bada Platter", 200);
			break;
			default:System.out.println("Wrong input");
			}
			System.out.print("Continue billing press y/n:");
			ch=sc.next();
			System.out.println("ch:"+ch);
			
		}while(ch.equalsIgnoreCase("y"));
		RMS.Billing();
	}
}
