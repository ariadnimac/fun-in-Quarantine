package math;

public class MyMath {

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
