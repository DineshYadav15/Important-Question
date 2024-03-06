class alternatenumberArray
{
	public static void main(String args[])
	{
		int arr[]={2,3,4,5,6,7,8,9,34,23,12};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	System.out.println("alternate elemnt");
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}
	}
}