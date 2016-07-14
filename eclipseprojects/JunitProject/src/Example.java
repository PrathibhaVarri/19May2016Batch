
public class Example {
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	public boolean isEven(int num)
	{
		if(num<0)
			throw new IllegalArgumentException();
		
		
		if(num%2==0)
			return true;
		else
			return false;
			
		
	}

}
