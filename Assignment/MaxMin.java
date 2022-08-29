package Assignment;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		int size,i;
		int arr[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		System.out.println("Enter " + size + " elements");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
					
		}
		int max=arr[0];
		int min=arr[0];
		
		for(i=1;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if (arr[i]<min)
				min=arr[i];
		}
		System.out.println("maximum Number is : "+ max);
		System.out.println("minimum Number is : "+ min);
		
	}

}
