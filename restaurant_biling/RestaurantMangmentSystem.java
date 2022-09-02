package restaurant_biling;
import java.io.*;
import java.util.*;

public class RestaurantMangmentSystem {
		static ArrayList<Bill>  list=new ArrayList<Bill>();
	
	   static void oderTaking(String f_name, int Amt) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println(f_name+" Enter quantity :");
		   int qty=sc.nextInt();
		   list.add(new Bill(f_name,qty,qty*Amt));
		
	}

	   static void billing() {
		double total=0.0;
		for(Bill i : list)
		{
			System.out.println(i.f_name+"  "+i.qty+"  "+i.amt);
			total+=i.amt;
		}
		System.out.println("Total:"+total);
		System.out.println("GST:"+total*0.05);
		System.out.println("Net Amount:"+total*1.05);
		
		
	}

	
		
	}


	
	



	
	


