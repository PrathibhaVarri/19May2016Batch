class NegativeNumberException extends Exception
{
	
}
class MyClass
{
	
	public void showSquare(int num)throws NegativeNumberException
	{
		if(num<0)
		{
			throw new NegativeNumberException();
		}
		System.out.println("Square = "+(num*num));
	}
}
public class Test {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		try
		{
		m.showSquare(-5);
		}catch(NegativeNumberException n)
		{
			System.out.println("negative number error");
		}
		}

}
