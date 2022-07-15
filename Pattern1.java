/*3.print this pattern:
1
12
123
1234
12345*/

package basicprogram;

public class Pattern1 {

	public static void main(String[] args) {
	 int i,j,n;
	 
	 for(i=1;i<=5;i++)
	 {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(j);
		 }
		 System.out.println();
	 }

	}

}
