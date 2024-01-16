import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
			System.out.println("Factorial number is = " + fact);
		}
	}
}
	
