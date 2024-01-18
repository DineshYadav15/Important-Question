import java.util.*;
class reversenumber
{
	/* 
	public static void main(String[] args)
	{
		int n=123456;
		int rev=0;
		while(n !=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(" it is reverse number is " + rev);
		*/
		//input user
		public static void main(String[] args)
		{
			Scanner s1=new  Scanner(System.in);
			System.out.println("enter the number");
			int num=s1.nextInt();
			int rev=0;
			while(num !=0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println("it is reverse number is " + rev);
			
	}
}
		