import java.io.*;
import java.util.*;
class Primecheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check prime or not: ");
		int num=sc.nextInt();
		boolean is_Prime=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				is_Prime= false;
				break;
			}
		}
		if(is_Prime)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
		System.out.println(num+" is not a prime number");
		}
	}
}