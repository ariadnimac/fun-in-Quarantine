package math;


import org.junit.Test;

import math.MyMath;


public class MyMathTest {
	
	
	MyMath mm = new MyMath();
	
	@Test (expected = IllegalArgumentException.class)
	public void test_zero_input_exception() {
		mm.factorial(0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_twelve_input_exception() {
		mm.factorial(12);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_negative_input_exception() {
		mm.factorial(-2);
	}


}
