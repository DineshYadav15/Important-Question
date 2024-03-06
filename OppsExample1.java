/*
Write a python program using class which contains two variables of type integer. Create and 
initialize the object using  parameterized constructor. Write a  method to display maximum 
from given two numbers for all objects.
*/
class OppsExample1
{
	private int num1;
	private int num2;
	OppsExample1(int num1,int num2)
	{
	  this.num1=num1;
	  this.num2=num2;
	}
	void display()
	{
		int maxnumber=Math.max(num1,num2);
	System.out.println("Maximum of" + num1 + "And" + num2 + "is = " +maxnumber);
	}
	public static void main(String args[])
	{
		OppsExample1 s1=new OppsExample1(40,43);
		s1.display();
	}
}

		
		
		