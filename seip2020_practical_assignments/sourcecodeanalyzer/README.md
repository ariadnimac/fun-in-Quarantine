
# Source Code Analyzer

This module serves the purpose of demonstrating the use and functionality of design patterns.
The code itself analyzes a source code file and exports the calculated metrics into a new file.

## Class Diagram 

![Class Diagram](https://github.com/ariadnimac/fun-in-Quarantine/seip2020_practical_assignments/sourcecodeanalyzer/SrcAnalyzer.jpg)

## Design Patterns Used - Class Diagram Explanation 

### Read the initial source code file 
For the purpose of reading the initial file from the web or from local computer into a string or a list the <b>Strategy Pattern</b> was used in order to simplify the process of reading the file when called from other classes, to get rid of the unecessary if-else and to make the code more extensible. That means that there is an interface called "SrcFileReader" that is being implemented by the classes "WebReader" and "LocalReader".

### Analyze the source code 
For the purose of analyzing the source code with the use either of regular expressions or string comparison the <b>Strategy Pattern</b> was again chosen to enhance the extensibility of the code. That means that there is an interface called "SrcAnalyzer" that is being implemented by the classes "RegexAnalyzer" and "StrcompAnalyzer".

### Export metrics into a new file 
For the purose of exporting the metrics calculated as explained above and write them into a new file <b>Strategy Pattern</b> was again chosen to enhance the extensibility of the code. That means that there is an interface called "MetricsExporter" that is being implemented by the classes "JsonExporter" and "CsvExporter".


## Building

Build the executable Java application with: 
	mvn package jacoco:report

## Running  

Run the executable by executing
	java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4
were args translate to: 	
	arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
	arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
	arg2 = “SourceCodeLocationType” [local|web]
	arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
	arg4 = “OutputFileType” [csv|json]
example: 
	java –jar ./target/sourcecodeanalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv