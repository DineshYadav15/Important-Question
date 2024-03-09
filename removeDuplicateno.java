import java.util.HashSet;
class removeDuplicateno
{
	public static void main(String[] arg)
	{
		int arr[]={1,3,5,2,6,8,9,2,3,2};
		HashSet<Integer> s1=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			s1.add(arr[i]);
		}
		for(int no:s1)
		{
			System.out.println(no);
		}
	}
}