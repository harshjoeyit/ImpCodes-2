import java.lang.*;

class Palind
{
	public static void main( String args[] )
	{
		int n = 346543;
		int dig = 0;
		int[] a;
		a = new int[10];
		int flag = 1;

		while( n != 0 )
		{
			a[dig++] = n % 10;
			n /= 10;
		}
		for( int i = 0; i< dig/2; i++ )
		{
			if( a[i] != a[dig - 1 - i])
			{
				flag = 0;
				break;
			}
		}
		if( flag == 1 )
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}	
};
