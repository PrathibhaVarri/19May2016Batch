import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class NonGeneric {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
				list.add(3);
				
				list.add(5);
				
				System.out.println("Enhanced for loop");
				for(Object i:list)
				{
					System.out.println(i);
				}
				
				

	}

}
