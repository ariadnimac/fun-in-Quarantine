package math;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import math.MyMath;

import org.junit.Assert;

/**
 * A test class that implements a Parameterized test
 * for the MyMath factorial method, 
 * for demonstrating Unit Testing.
 * @author ariadnimac
 */
@RunWith(Parameterized.class)
public class MyMathFactorialParameterizedTest {
	@Parameter (value = 0) 
	public int input;
	@Parameter (value = 1)
	public int result;


	MyMath mm = new MyMath();
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{
			{1,1},
			{2,2},
			};
		
		return Arrays.asList(data);
	}
	
	@Test
	public void testFactorialNormalCases() {
		
		Assert.assertEquals(result, mm.factorial(input));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
