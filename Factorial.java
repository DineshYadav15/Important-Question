import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		int fact=1;
		if(num<0)
		
			System.out.println("out of bound");
		else{
		for(int i=1;i<=num;i++)
		
			fact=fact*i;
			System.out.println("Factorial number is = " + fact);
		
		}
		
	}
}
	
