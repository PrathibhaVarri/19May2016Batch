import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

class SortByDesignation implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}
	
}
class Employee implements Comparable<Employee>
{
	private String name;

	private String designation;
	
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}



	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}



	@Override
	public int compareTo(Employee emp) {
		
		return name.compareTo(emp.name);
	}
	
	
}

class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(3);
		
		list.add(4);
		
		
		for(Integer obj:list)
		{
			System.out.println(obj);
			if(obj==3)
			{
				//list.remove(0);
				list.add(0, 55);
			}
		}
		
		System.out.println(list);
		
		
	}

}
