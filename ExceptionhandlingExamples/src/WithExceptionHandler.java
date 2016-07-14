
public class WithExceptionHandler {

	public static void main(String[] args) {
		int a=100;
		
		int b=0;
		try
		{
		int c=a/b;
		
		System.out.println("try block line 2");
		System.out.println("try block line 2");
		
		}catch(ArithmeticException  ae)
		{
			System.out.println("divide by zero");
			
		    System.out.println(ae.getMessage());
		}
		
		System.out.println("Last message in main");

	}

}
