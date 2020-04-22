package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;
/** The ArrayOperations utilizes the functions provided in other classes
 *  to modify and provide a new array.
 *  
 * @author ariadnimac
 * 
 *
 */


public class ArrayOperations {
	/** 
	 * Utilizes the readFile and isPrime functions of the classes
	 * FileIO and MyMath in order to create an initial array from the
	 * file that exists in the filepath the user has given.
	 * Then creates a new array that contains only the prime numbers 
	 * of the array created before from the given file.
	 * 
	 * @param fileIo
	 * @param filepath
	 * @param myMath
	 * @return an array that contains only the prime numbers of the initial array
	 */
	
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
