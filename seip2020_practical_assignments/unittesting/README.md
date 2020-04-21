# Unittesting

This module serves the purpose of demonstrating the use of unittesting in various classes that perform basic mathematic functions.
The classes are seperated into two packages: **math** and **io**

## Main Classes (src/main/java)

### math package 

**MyMath:** 
Contains the mothods:

**1.public int factorial(int n):**
input: int n so as 0< n < 12
output: int result, the factorial of the given number 
exceptions:throws IllegalArguMentException for inputs smaller than 0 od larger than 12

**2.public boolean isPrime(int):** 
input: int n so as n>2
output: boolean so as true if the given number is a prime number, false otherwise
exceptions: throws IllegalArguMentException for inputs smaller than 2

**ArithmeticOperations:** 
Contains the mothods:


**1.public double divide(double noumerator, double denominator):**
input: double noumerator, double denominator, the denominator cannot be zero
output: the result of the division of the two numbers given
exceptions: throws IllegalArguMentException for denominator input equal tp zero


**2.public int multiply(int x, int y):**
input: int x, int y, so as x, y >0 
output: int result, the result of the multiple of the given numbers 
exceptions:throws IllegalArguMentException when x or y given is below 0
           throws IllegalArguMentException when the result is bigger than the Integer Max Value

**ArrayOperations**

**1.int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath):**
input: an object of type FileIO (a class in the io package)
       a string with the path of the file to read 
       an object of type MyMath the aforementioned class of this package
output: returns an array of integers which contains only the prime numbers of the initial array that was created from the given file
exceptions: none 




