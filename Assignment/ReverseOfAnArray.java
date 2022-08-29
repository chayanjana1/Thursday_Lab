package Assignment;

import java.util.Scanner;

public class ReverseOfAnArray {
	 public static void main(String[] args) { 
	    	int size;
			int arr[]=new int[10];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array:");
			size=sc.nextInt();
			System.out.println("Enter " + size + " elements:");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
						
			} 
	        System.out.println("Array in reverse order: ");    
	        for (int i = size-1; i >= 0; i--) {  
	            System.out.print(arr[i]);  
	        }  
	    }  
	}

