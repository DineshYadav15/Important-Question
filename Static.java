// i am using static keyword only for 
/*class Static
{
	static int a=10;
	
	public static void main(String[] args)
	{
	
	int a=10;//isme static lagata hun to error batata hain 
	int b=20;
	int sum;
	sum=a+b;
	
	System.out.println(sum);
	System.out.println(Static.a);
	}
}*/
//this one staic method

/*class Static
{
	static public void main()
	{
		System.out.println("it is methods");
	}
    public void  show()
	{
		System.out.println("it is second methods");
	}
	public static void main(String args[])
	{
		
		ye bhi correct hain 
		Static s1=new Static();
		s1.main();
		Static s2=new Static();
		s2.show();
		
		// beter way 
		Static s2=new Static();
		s2.show();
		Static.main();
		main();//that will be correct
		
	}
}
*/
//static method only access static data cannot access non static data;
//Example
/*class Static
{
	static void show()
	{
		ssa();
		System.out.println("i am dinesh");
	}
	
	static void ssa()
	{
		System.out.println("i am dinesh yadav");
		
	}
	
}
*/
// override  bhi hota hain
class Static
{
	static void show()
	{
		
		System.out.println("i am good");
	}
}
class extend extends Static
{
	public static void main(String args[])
	{
		show();
	}
}
		
	
