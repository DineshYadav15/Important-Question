import java.util.*;
import java.lang.Math;
class ArmSimple
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the any number");
		int num=s1.nextInt();
		int temp=num;
		int length=0;
		while(temp>0)
		{
			temp=temp/10;
			length++;
		}
		int sum=0;
		temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			
			sum += (Math.pow(rem,length));
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}
}
	
