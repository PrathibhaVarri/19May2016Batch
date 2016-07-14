import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOperation {

	
	@Test
	public void testAddition()
	{
		AdditionExample a=new AdditionExample();
		assertEquals(5,a.add(2,3));
	}

}
