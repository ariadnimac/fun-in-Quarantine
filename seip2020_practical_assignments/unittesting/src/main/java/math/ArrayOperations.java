package math;

import io.FileIO;


public class ArrayOperations {
	
	 int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		 int [] all_numbers;
		 MyMath mm = new MyMath();
		 FileIO fio = new FileIO();
		 all_numbers = fio.readFile(filepath);
		 int [] only_prime =  new int [all_numbers.length];
		 int i = 0; 
		 for(int number: all_numbers){
			 if (mm.isPrime(number)) {
				 i++;
				 only_prime[i] = number;
			 }
		}
		return only_prime;
	 }

}
