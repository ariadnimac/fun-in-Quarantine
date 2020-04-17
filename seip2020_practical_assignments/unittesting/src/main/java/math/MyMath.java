package math;

public class MyMath {

	public long factorial (int n) {
		long result = 1;
		if((0<n) & (n>20)){
			for (int factor = 2; factor <= n; factor++) {
				result *= factor;
			}
		}else {
			throw new IllegalArgumentException("Given number must be between 0 and 20");

		}

        return result;
    }
		
	
}
