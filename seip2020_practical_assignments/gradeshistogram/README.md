# gradeshistogram 


This module serves the purpose of presenting a histogram based on the inputs the user provided.

## Main Classes 

### gradeshistogram package

#### HistogramGenerator:

Contains the methods:

**1.public void generateChart(int[] dataValues):**

**input:** ataValues One-dimension array (the array with the frequency of each grade made so as grade[i]= frequency of grade i  
**functionality:** Receives the frequency (or any other one dimension array) and creates a dataset that will be used for the creation of the visual chart   
**output:** nothing     
**exceptions:** none  


**2.public static void main(String[] args):** 

**input:** args used to read the arguments given through the command line
**functionality:** makes use of the generateChart method by reading a file and calling the generateChart with that input
**output:** nothing  
**exceptions:** throws  FileNotFoundException when the argument given cannot be found
