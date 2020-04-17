package math;

public class MyMath {

	public long factorial (int n) {
		long result = 1;

        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }

        return result;
    }
		
	
}
