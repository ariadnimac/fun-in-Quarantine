package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import io.FileIO;
import math.ArrayOperations;

import static org.mockito.Mockito.*;


public class ArrayOperationsTest {
	ArrayOperations ao = new ArrayOperations();
	
	@Test
	public void test_find_primes_in_file() {
		FileIO fio = mock(FileIO.class);
		MyMath mm = mock(MyMath.class);
		int [] mock_return = new int[] {3,5,6,8,9,10,13};
		String path = "src/test/resources/mock.txt";
		when(fio.readFile(path)).thenReturn(mock_return);
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(5)).thenReturn(true);
		when(mm.isPrime(6)).thenReturn(false);
		when(mm.isPrime(8)).thenReturn(false);
		when(mm.isPrime(9)).thenReturn(false);
		when(mm.isPrime(10)).thenReturn(false);
		when(mm.isPrime(13)).thenReturn(true);
		Assert.assertArrayEquals(new int [] {3,5,13},ao.find_primes_in_file(fio, path, mm));
	}
	

}
