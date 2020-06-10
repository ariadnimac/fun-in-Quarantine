package codeanalyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAnalyzer implements SrcAnalyzer{
	private SrcFileReader fileReader;
	
	public RegexAnalyzer(String fileReaderType) {
		if (fileReaderType== "web") {
			this.fileReader = new WebReader();
		}else {
			this.fileReader = new LocalReader();
		}
	}
	
	public int calculateNOM(String filepath, String analyzerType) throws IOException {
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*"); 
	    Matcher methodSignatures = pattern.matcher(sourceCode);

	    int methodCounter = 0;
	    while (methodSignatures.find()) {
	    	methodCounter++;
	    }
		return methodCounter;
	}
	
	public int calculateLOC(String filepath, String analyzerType) throws IOException{
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
        Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

        int nonCodeLinesCounter = 0;
        while (nonCodeLinesMatcher.find()) {
        	nonCodeLinesCounter++;
        }
		
        int sourceFileLength = sourceCode.split("\n").length;
        int loc =  sourceFileLength - nonCodeLinesCounter;
        
		return loc;
		
	}
	
	public int calculateNOC(String filepath, String analyzerType) throws IOException{
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*"); 
        Matcher classSignatures = pattern.matcher(sourceCode);

        int classCounter = 0;
        while (classSignatures.find()) {
        	classCounter++;
        }
		return classCounter;
		
		
	}
}
