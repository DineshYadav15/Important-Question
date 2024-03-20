class Smallest
{
	public static void main(String[] args)
	{
		int arr[]={3,4,5,6,1,2};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("short the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int smallest=arr[i-1];
		System.out.println(smallest);
	}
}