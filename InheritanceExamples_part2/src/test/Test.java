package test;



public class Test {
	
	static  void m3()
	{
		int a=100;
		int b=0;
		
		int c=a/b;
		
		System.out.println("Answer = "+c);
	}
	
	static void m2()
	{
		m3();
	}
	
	static void m1()
	{
		m2();
	}
	
	static void show(Integer i)
	{
		System.out.println("From wrapper class");
	}
	
	/*static void show(int i)
	{
		System.out.println("From primitive");
	}*/
	public static void main(String[] args) {
		try{
		m1();
		}catch(ArithmeticException a)
		{
			//System.out.println(a.getMessage());
			a.printStackTrace();
		}
		
		show(2);
	}
}
