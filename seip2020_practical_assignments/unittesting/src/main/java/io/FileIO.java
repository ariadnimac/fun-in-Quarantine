package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* The FileIO provides simple file input/output operations
* that serve as hands-on practice on Unit Testing.
*
* @author  ariadnimac
* @version 1.0
* @since   2020-04-16 
*/
public class FileIO {
	
	/**
	 * Reads a file that contains numbers line by line 
	 * and returns an array of the integers found in the file.
	 * @param filepath the file that contains the numbers
	 * @return an array of numbers
	 * @exception IllegalArgumentException when the given file does not exist
	 * @exception IllegalArgumentException when the given file is empty
	 * @exception IOException when an IO interruption occurs (not required to be tested)
	 */
	public int[] readFile(String filepath) {
		File file = new File(filepath);
		if (!file.exists()) 
			throw new IllegalArgumentException("Input file does not exist");
		
		List<Integer> numbersList = new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			int number =0;
			while ((line = reader.readLine()) != null) {
					try {
					    number = Integer.parseInt(line);
					    numbersList.add(number);    
					}catch(NumberFormatException  e){
					}
					
    
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (numbersList.size() == 0) 
			throw new IllegalArgumentException("Given file is empty");
		
		// Convert a List to an array using 
		return numbersList.stream().mapToInt(i -> i).toArray();
	}

}