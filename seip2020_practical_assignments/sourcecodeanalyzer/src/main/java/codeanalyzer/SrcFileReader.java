package codeanalyzer;

import java.io.IOException;
import java.util.List;

public interface SrcFileReader {
	public List<String> readFileIntoList(String filepath) throws IOException;
	public String readFileIntoString(String filepath) throws IOException;

}
