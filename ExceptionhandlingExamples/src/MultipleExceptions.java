
public class MultipleExceptions {

	public static void main(String[] args) {
		int a=100;
		
		int b=0;
		try
		{
			int [] ary={3};
			
			ary[2]=56;
		int c=a/b;
		
		System.out.println("try block line 2");
		System.out.println("try block line 2");
		
		}catch(ArithmeticException  ae)
		{
			System.out.println("divide by zero");
			
		    System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array index error");
		}catch(RuntimeException re)
		{
			System.out.println("exception");
		}
		finally
		{
			System.out.println("From finally block");
		}
		
		System.out.println("Last message in main");
	}
}
