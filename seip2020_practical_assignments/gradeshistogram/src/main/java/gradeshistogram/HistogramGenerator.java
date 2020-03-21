package gradeshistogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;


public class HistogramGenerator {
	public void generateChart(int[] dataValues) {
		
		XYSeriesCollection dataset = new XYSeriesCollection();
	
		XYSeries data = new XYSeries("random values");

		
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		
		dataset.addSeries(data);

		boolean legend = false; 
		boolean tooltips = false; 
		boolean urls = false; 

		JFreeChart chart = ChartFactory.createXYLineChart("Chart title", "x_axis title", "y_axis_title", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		String filename = args[0];
		try {
		Scanner grades = new Scanner(new File(filename));
		List <Integer> temp = new ArrayList <Integer>();
		int i = 0;
		while (grades.hasNext()) {
			i++;
		    int grade =grades.nextInt();
		    temp.add(grade);
		}
		int[]dataValues  = new int[temp.size()];
			for(int j = 0;i < dataValues.length;i++)
				dataValues[j] = temp.get(i);
			 
		grades.close();

		HistogramGenerator demo = new HistogramGenerator();
		demo.generateChart(dataValues);
	}catch(FileNotFoundException e) {
		 System.out.println(e.getClass());
	}
	}
}
