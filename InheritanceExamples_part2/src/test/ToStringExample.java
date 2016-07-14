package test;
class Employee
{
	private String name;
	private String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}

	
	
}
public class ToStringExample {

	public static void main(String[] args) {
		Employee e=new Employee("Sachin","Developer");
		
		System.out.println(e);

	}

}
