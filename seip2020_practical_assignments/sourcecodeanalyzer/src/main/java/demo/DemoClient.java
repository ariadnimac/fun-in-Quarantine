package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import codeanalyzer.*;

public class DemoClient {

	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilepath = "output_metrics";
		String outputType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilepath = args[3];
			outputType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}
		
		Factory fact = new Factory();
		Map<String, Integer> metrics = fact.analyze(sourceCodeAnalyzerType,sourceFileLocation,filepath);
		fact.writeFile(outputType,metrics, outputFilepath);
	}
	

}
