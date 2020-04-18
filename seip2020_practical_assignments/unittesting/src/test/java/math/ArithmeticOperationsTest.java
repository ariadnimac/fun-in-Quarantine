package math;
import org.junit.Test;

import math.ArithmeticOperations;

import org.junit.Assert;

public class ArithmeticOperationsTest {
	ArithmeticOperations ao = new ArithmeticOperations();
	
	@Test (expected = ArithmeticException.class)
	public void test_divide_zero_denominator_exception() {
		ao.divide(2, 0);
	}
	

	@Test 
	public void test_divide_valid_denominator() {
		Assert.assertEquals(4.2, ao.divide(21.42, 5.1),0.00001);
	}
	


}
