package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Factory {
	public  Map<String, Integer> analyze(String sourceCodeAnalyzerType, String sourceFileLocation,String filepath) throws IOException{
		SrcAnalyzer analyzer;
		
		if (sourceCodeAnalyzerType == "regex") {
			analyzer = new RegexAnalyzer(sourceFileLocation);
		}else {
			analyzer = new StrcompAnalyzer(sourceFileLocation);
		}

		int loc = analyzer.calculateLOC(filepath, sourceCodeAnalyzerType);
		int nom = analyzer.calculateNOM(filepath, sourceCodeAnalyzerType);
		int noc = analyzer.calculateNOC(filepath, sourceCodeAnalyzerType);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
		return metrics;
				
	}
	MetricsExporter exporter;
	
	public void writeFile(String outputType, Map<String, Integer> metrics, String outputFilepath) {
		if (outputType.equals("csv")) {
			exporter = new CsvExporter();
			
		} else if (outputType.equals("json")) {
			
			exporter = new JsonExporter();
		} else {
			throw new IllegalArgumentException("Unknown type : " + outputType);
		}
		
		exporter.writeFile(outputType, metrics, outputFilepath);
	}

}
