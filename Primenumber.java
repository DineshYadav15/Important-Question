/*class Primenumber
{
	public static void main(String[] args)
	{
		int num=11;
		int temp=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("it is not prime number");
		}
		else
		{
			System.out.println("it is prime number");
		}
	}
}
*/
import java.util.*;
class Primenumber
{
	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the number");
		int num =s2.nextInt();
		int temp=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("it is not prime number");
		}
		else
		{
			System.out.println("it is prime number");
		}
	}
}