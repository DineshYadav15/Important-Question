class AirthmeticOperation
{
	private double num1;
	private double num2;
	public void AirthmeticOperation(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
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
		return num1/num2;
	}
	void dispalyResult()
	{
		System.out.println("Airthmetic Operation");
		System.out.println("Addition        = " + add());
		System.out.println("Subtraction     = " + sub());
		System.out.println("multiplication  = " + multi());
		System.out.println("Dividesion      = " + div());
	}
}
class main
{
	
    public static void main(String args[])
	{
		AirthmeticOperation s1=new AirthmeticOperation();
		s1.AirthmeticOperation(12.4,2.3);
		s1.dispalyResult();
	}
}
		