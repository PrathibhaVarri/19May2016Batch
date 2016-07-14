import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(2);
		list.add(3);
		
		ArrayList<Integer> al=new ArrayList<>(list);
		
		System.out.println(al);
		
		
	}

}
