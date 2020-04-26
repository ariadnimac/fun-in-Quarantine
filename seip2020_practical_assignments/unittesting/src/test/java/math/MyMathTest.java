package math;


import org.junit.Assert;
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
	@Test (expected = IllegalArgumentException.class)
	public void test_isPrime_smaller_than_2_input_exception() {
		mm.isPrime(1);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test_isPrime_negative_input_exception() {
		mm.isPrime(-1);
	}
	@Test 
	public void test_isPrime_normal_cases() {
		Assert.assertEquals(true, mm.isPrime(5));
	}


}
