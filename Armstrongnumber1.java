import java.util.*;
class Armstrongnumber1
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the any numbers");
		int num=s1.nextInt();
		int r;
		
		int sum=0;
	    int h=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(h==sum)
		{
			System.out.println("it is Armstrong number");
			
		}
		else
		{
			System.out.println("it is not Armstrong number");
		}
		
	}
}
			
