import java.lang.*;
import java.util.Scanner;

class linsearch
{
	public static void main( String args[] )
	{
		 int[] A = new int[50];
		 int i , search , size;
		 
		 System.out.print("size(max 50 ): ");
		 Scanner enter = new Scanner(System.in);
		 size = enter.nextInt();
		 
		 for( i = 0; i < size; i++ )
		 {
		 	System.out.print("a[" + i + "] = ");
		 	A[i] = enter.nextInt();
		 }
		 
		 System.out.print("search: ");
		 search = enter.nextInt();
		 
		 for( i = 0; i < size; i++)
		 	if( A[i] == search )
		 		break;
		 
		 if( i == size )
		 	System.out.println("not found");
		 else
		 	System.out.println("found at index: " + i ); 
	}
}
