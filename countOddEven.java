class countOddEven
{
	public static void main(String args[])
	{
		int arr[]={2,3,4,5,6,7,8,9,34,23,12,0,0};
		int evencount=0;
		int oddcount=0;
		int zerocount=0;
		for(int element:arr)
		{
			if(element==0)
			{
				zerocount++;
			}
			else if(element%2==0)
			{
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("Total Even number is = " +evencount);
		System.out.println("Total Odd number is = " +oddcount);
		System.out.println("Total Zero number is = " +zerocount);
	}
}
		     