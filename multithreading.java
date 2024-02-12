// one task one thread;
/*class test extends Thread
{
	public void run()
	{
		System.out.println("task1");
	}
}
class multithreading
{
	public static void main(String args[])
	{
		test s1=new test();
		s1.start();
		
	}
}
*/
/*
//one task multiple thread;
class test extends Thread
{
	public void run()
	{
		System.out.println("one task multiple thread");
	}
}
class multithreading
{
	public static void main(String[] args)
	{
		test s1=new test();
		s1.start();
		test s2=new test();
		s2.start();
	}
}
*/
//multiple task one thread not working 
//multiple task multiple thread

class test extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
}
class test1 extends Thread
{
	public void run()
	{
		System.out.println("Good Morning");
	}
}
class test2 extends Thread
{
	public void run()
	{
		System.out.println("Dinesh");
	}
}
class multithreading
{
	public static void main(String args[])
	{
		test s1=new test();
		s1.start();
		test2 s2=new test2();
		s2.start();
		test1 s3=new test1();
		s3.start();
	}
}
