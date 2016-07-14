package mypack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		
		
		s.setId(rollNumber);
		System.out.println("Enter name");
		String name=sc.next();
		s.setName(name);
		System.out.println("How many courses do you want to register");
		int numberOfCourses=sc.nextInt();
		
		String [] courseNames=new String[numberOfCourses];
		
		for(int i=0;i<numberOfCourses;i++)
		{
			courseNames[i]=sc.next();
		}
		s.setCourseNames(courseNames);
		
		
		System.out.println("Details of student");
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		for(int i=0;i<s.getCourseNames().length;i++)
		{
			System.out.println(s.getCourseNames()[i]);
		}

	}

}
