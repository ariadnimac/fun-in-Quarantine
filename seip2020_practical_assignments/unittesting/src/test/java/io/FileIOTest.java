package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class FileIOTest {
	FileIO fio = new FileIO();
	public static String resourcesPath = "src/test/resources/";
	
	@Test 
	public void test_readFile_normal_cases() {
		String validInputFilepath = resourcesPath.concat("valid_numbers.txt");
		int result[] = new int[] {1,2,5,6,7,98,67,45,45,7,8,9,2,4,7,89,76,54,32,1,999};
		Assert.assertArrayEquals(result, fio.readFile(validInputFilepath));
	}
	
	
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none(); //initialize it to .none()
	@Test 
	public void test_readFile_throw_exception_for_empty_file() {
		String emptyFilepath = resourcesPath.concat("empty_file.txt");
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		fio.readFile(emptyFilepath);
		
	}
	
	@Test 
	public void test_readFile_throw_exception_for_non_existing_file() {
		String nonExistentFilepath = resourcesPath.concat("doesnt_exist.txt");
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		fio.readFile(nonExistentFilepath);
	}
}
