package codeanalyzer;

import java.util.Map;

public interface MetricsExporter {
	public void writeFile(String outputType, Map<String, Integer> metrics, String filepath);

}
