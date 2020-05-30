package codeanalyzer;

import java.io.IOException;
import java.util.List;


public class StrcompAnalyzer implements SrcAnalyzer{
	
	private SrcFileReader fileReader;
	
	public StrcompAnalyzer(String fileReaderType) {
		if (fileReaderType== "web") {
			this.fileReader = new WebReader();
		}else {
			this.fileReader = new LocalReader();
		}
	}
	
	public int calculateNOM(String filepath, String analyzerType) throws IOException {
		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
		int methodCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim().trim(); //clear all leading and trailing white spaces
			if ( ((line.contains("public") || line.contains("private") || line.contains("protected"))
					|| line.contains("void") || line.contains("int") || line.contains("String"))
					&& line.contains("(") && line.contains(")") && line.contains("{") )
					methodCounter++;
		}
		return methodCounter; 
	}
	
	public int calculateLOC(String filepath, String analyzerType) throws IOException{
		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
		int nonCodeLinesCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim().trim(); //clear all leading and trailing white spaces
			if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{") || line.equals("}") || line.equals(""))
				nonCodeLinesCounter++;
		}
		int loc = sourceCodeList.size() - nonCodeLinesCounter;
		return loc; 
		
	}
	
	public int calculateNOC(String filepath, String analyzerType) throws IOException{
		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
		int classCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); //remove leading and trailing white spaces
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}
		return classCounter; 
		
	}

}
