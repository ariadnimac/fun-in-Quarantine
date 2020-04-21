package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;


public class ArrayOperations {
	
	 int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		 int [] all_numbers;
		 MyMath mm = new MyMath();
		 FileIO fio = new FileIO();
		 all_numbers = fio.readFile(filepath);
		 List<Integer> only_prime = new ArrayList<>(); 
		 for(int number: all_numbers){
			 if (mm.isPrime(number)) {

				 only_prime.add(number);
			 }
		}
		 return only_prime.stream().mapToInt(i -> i).toArray();
	 }

}
