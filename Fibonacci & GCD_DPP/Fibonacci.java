package daa;

//Dynamic Programming approach for
//Fibonacci Series
import java.util.*;
public class Fibonacci {

	// Function to find the fibonacci Series
	static long fib(long n)
	{

		// Declare an array to store
		// Fibonacci numbers.
		// 1 extra to handle case, n = 0
		long f[] = new long[(int) (n + 2)];

		int i;

		// 0th and 1st number of
		// the series are 0 and 1
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {

			// Add the previous 2 numbers
			// in the series and store it
			f[i] = f[(int) (i - 1)] + f[(int) (i - 2)];
		}

		// Nth Fibonacci Number
		return f[(int) n];
	}

public static void main(String args[])
	{
	System.out.println("Enter number of terms");
		Scanner sc=new Scanner(System.in);
		// Given Number N
		//int N = 10;
         long N=sc.nextInt();
         System.out.println("The nth term is "+fib(N));
		// Print first 10 terms
         //System.out.println("The first"+n+"terms are\n ");
		for (long i = 0; i < N; i++)
			System.out.print(fib(i) + "\n");	
	}
}
