import java.util.*;
class Linkedlist
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(300);
		list.add(400);
		list.add(100);
		System.out.println(list);
		list.addFirst(700);
		System.out.println(list);
		list.addLast(700);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}