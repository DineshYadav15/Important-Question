/*
Write a program to perform all the arithmetic operations between two numbers.
*/
class OppsExample2
{
	private double num1;
	private double num2;
	public OppsExample2(double num1,double num2)
	{
		this num1=num1;
		this num2=num2;
	}
	public double add()
	{
		return num1+num2;
	}
	public double sub()
	{
		return num1-num2;
	}
	public double multi()
	{
		return num1*num2;
	}
	public double div()
	{
		if(num2 !=0);
		{
			return num1/num2;
		}
		else
		{
			System.out.println("Error");
		return double,NaN;//nan means not a numbers
		}
	}
	public void display()
	{
		System.out.println("Airthmatic Operation");
		System.out.println("Addtion      = " + add);
		System.out.println("Subtraction  = " + sub);
		System.out.println("Multiplay    = " + multi);
		System.out.println("Divsion      = " + add);
	}
}
class main
{
	
	public static void main(String args[])
	{
		OppsExample2 s1=new OppsExample2(23,3);
		s1.display()
	}
}