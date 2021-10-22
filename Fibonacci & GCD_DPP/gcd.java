package daa;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x and y are the numbers to find the GCF  
		Scanner sc=new Scanner(System.in);
		int gcd = 1;  
		System.out.println("Enter 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//running loop form 1 to the smallest of both numbers  
		for(int i = 1; i <= x && i <= y; i++)  
		{  
		//returns true if both conditions are satisfied   
		if(x%i==0 && y%i==0)  
		//storing the variable i in the variable gcd  
		gcd = i;  
		}  
		//prints the gcd  
		System.out.println("GCD of"+x+" and "+y+" by naive method is: "+ gcd);  
		System.out.println("GCD of"+x+" and "+y+" by recursive efficient method is: "+ findGCD(x,y));  
		}  

//recursive function to return gcd of a and b   
static int findGCD(int a, int b)   
{   
if (b == 0)   
return a;     
return findGCD(b, a % b);   
}
}
