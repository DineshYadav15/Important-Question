//final keyword it used to variable,method,class it is called final keyword;
//final keyword with variable taht value constant means not change the value this fixe;

/*class finalkey
{
	public static void main(String args[])
	{
	final int i=20;
	int b=30;
	int x;
	x=i+b;
	System.out.println(x);
	}
}
*/
//final method  mens it is not override the final method
//example
/*
class finalkey
{
	final void show()
	{
		System.out.println("2");
	}
}
class main extends finalkey
{
	final void show()//it is not override
	{
		System.out.println("3");
	}
}
class test
{
	public static void main(String[] args)
	{
		main s1=new main();
		s1.show();
	}
}
*/
//final class it is not inherates
//example
final class finalkey
{
	final void show()
	{
		System.out.println("2");
	}
}
class extend extends finalkey// it is not inherits final class finalkey
{
	public static void main(String[] args)
	{
		finalkey s1=new finalkey();
		s1.show();
	}
}
