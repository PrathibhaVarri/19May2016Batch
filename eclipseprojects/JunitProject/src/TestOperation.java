import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOperation {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	
	
	@Test
	public void testAddition()
	{
		Example e=new Example();
		
		assertEquals(5,e.add(2, 3));
				
	}
	Example e;
	@Before
	public void setUp()
	{
		e=new Example();
	}
	
	@Test
	public void whenNumberIsPositiveAndEvenItShouldReturnTrue()
	{
		
		assertTrue(e.isEven(6));
	}
	
	
	@Test(timeout=1000)
	public void testTimeFrameMethod()
	{
		for(int i=1;i<=10000000;i++)
		{
			System.out.print("");
		}
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenNumberIsLessThanZeroItSholdReturnException()
	{
		assertTrue(e.isEven(-6));
	}
	
/*	//tption
	//when number is positive and even it should return true
	@Test
	public void whenNumberIsPositiveAndEvenItShouldReturnTrue()
	{
		Example e=new Example();
		assertTrue(e.isEven(6));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenNumberIsLessThanZeroItSholdReturnException()
	{
		Example e=new Example();
		assertTrue(e.isEven(-6));
	}
	
	@Test(timeout=10)
	public void testTimeFrameMethod()
	{
		for(int i=1;i<=10000000;i++)
		{
			System.out.print("");
		}
	}
*/
}
