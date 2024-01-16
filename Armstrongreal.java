import java.util.*;
class Armstrongreal
{
	public static void main(String args[])
	{
		Scanner n1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=n1.nextInt();
		int temp1=num;
		int leng=0;
		while(temp1 !=0)
		{
			temp1=temp1/10;
			leng=leng+1;
		}
		int temp2=num;
		int rem;
		int sum=0;
		while(temp2 !=0)
		{
			int multi=1;
			rem=temp2%10;
			for(int i=1;i<=leng;i++)
			{
				multi=multi*rem;
			}
			sum=sum+multi;
			temp2=temp2/10;
		}
		if(sum==num)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}
}