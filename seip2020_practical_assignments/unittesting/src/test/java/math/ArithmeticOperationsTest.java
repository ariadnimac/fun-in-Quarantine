package math;
import org.junit.Test;
import org.junit.Rule;
import math.ArithmeticOperations;
import org.junit.rules.ExpectedException;
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
	
	@Test 
	public void test_divide_zero_noumerator() {
		Assert.assertEquals(0, ao.divide(0, 5.1),0.00001);
	}
	
	
	
	@Test 
	public void test_multiply_x_zero() {
		Assert.assertEquals(0, ao.multiply(0, 5));
	}
	

	@Rule 
	public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
	@Test 
	public void test_multiply_throw_exception_for_x_negative_input() {
	
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(-9, 5);
		
	}
	
	@Test 
	public void test_multiply_throw_exception_for_y_negative_input() {
	
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		ao.multiply(9, -5);
		
	}
	
	@Test 
	public void test_multiply_throw_exception_for_big_input() {
	
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		ao.multiply(2147483647,2 );
		
	}
	
	
	


}
