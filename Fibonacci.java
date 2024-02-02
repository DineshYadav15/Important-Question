Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
/*class Fibonacci
{
	public static void main(String[] args)
	{
		int n1=0;
		int n2=1;
		int c;
		
		System.out.println(n1+" "+n2);
		for(int i=2;i<10;++i)
		{
		c=n1+n2;
		System.out.println(+c);
		n1=n2;
		n2=c;
		}
	}
}*/



/*class Fibonacci
{
		static int n1=0, n2=1, n3,count;
    static void Fibpnacci(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
			Fibpnacci(count-1);
		}
	}
		public static void main(String[] args)
		{
			int count=10;
			{
				System.out.println(n1+" " +n2);
				Fibpnacci(count-2);
				
			}
		}
	
}
*/
import java.util.*;
class HelloWorld {
   static int n1=0,n2=1,n3;
  static void fprintfibonnci(int count)
   {
       if(count>0)
       {
           n3=n1+n2;
           System.out.println(+n3);
           n1=n2;
           n2=n3;
           fprintfibonnci(count-1);
       }
   }
   public static void main(String[] args)
   {
       Scanner s1=new Scanner(System.in);
       System.out.println("enter the limit");
       int num=s1.nextInt();
     
       System.out.println(n1+" "+n2);
      fprintfibonnci(num-2);
   }
    
}