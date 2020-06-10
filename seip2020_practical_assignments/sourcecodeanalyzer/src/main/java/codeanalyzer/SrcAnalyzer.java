package codeanalyzer;

import java.io.IOException;

public interface SrcAnalyzer {
	
	public int calculateNOM(String filepath, String analyzerType) throws IOException;
	public int calculateLOC(String filepath, String analyzerType) throws IOException;
	public int calculateNOC(String filepath, String analyzerType) throws IOException;
	
}
