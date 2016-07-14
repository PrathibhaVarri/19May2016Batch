import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(3);
		
		list.add(5);
		
		System.out.println("Enhanced for loop");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		//list.set(1, 555);
		System.out.println("Using index position");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//
		System.out.println("Using iterator");
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			//list.add(78);
			System.out.println(it.next());
		}
		
		System.out.println("using listiterator");
		ListIterator listIt = list.listIterator();
		
		while(listIt.hasNext())
		{
			System.out.println(listIt.next());
		}
		
	}

}
