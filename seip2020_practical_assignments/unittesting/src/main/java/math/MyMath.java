package math;

/** The MyMath provides basic mathematic functions
 * 
 * @author ariadnimac
 *
 */

public class MyMath {
	/**Accepts a number and calculates its factorial
	 * 
	 * @param n
	 * @return the factorial of n
	 * exception IllegalArgumentException when the given number is not between 0 and 12
	 */

	public long factorial (int n) {
		long result = 1;
		if((0<n) && (n<12)){
			for (int factor = 2; factor <= n; factor++) {
				result *= factor;
			}
		}else {
			throw new IllegalArgumentException("Given number must be between 0 and 12");

		}

        return result;
    }
	/**Accepts a number and checks if it is prime or not 
	 * 
	 * @param n
	 * @return true if n is a prime number, false otherwise
	 * exception IllegalArgumentException when the given number is smaller than 2 
	 */
	
	public boolean isPrime(int n) {
		if (n<2) {
			throw new IllegalArgumentException("Given number must be bigger than 2");

		}else {
			for (int i = 2; i < n; i++) 
				if (n % i == 0) 
					return false; 
		}
		return true;
	}
	
}
