import java.util.Arrays;
class ZigZag
{
	public static void main(String args[])
	{
		int arr[]={2,4,3,1,6,5,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=1;i<arr.length;i+=2)
		{
			int temp=arr[i];
		    arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println("zig zag problem");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}