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

/**
* The HistogramGenerator program accepts as input a .txt file with grades and generates
* generates the histogram according to the content of the file.
*
* @author  Ariadni Makari
* @version 1.0
* @since   2020-03-21 
*/
public class HistogramGenerator {
	/**
	   * This method is used to generate the Histogram(chart). 
	   * Receives the frequency (or any other one dimension array) and creates a dataset
	   * that will be used for the creation of the visual chart.
	   * 
	   * @param dataValues One-dimension array (the array with the frequency of each grade made so as 
	   * grade[i]= frequency of grade i
	   * 
	   * @return Nothing
	   */
	public void generateChart(int[] dataValues) {
		
		XYSeriesCollection dataset = new XYSeriesCollection();
	
		XYSeries data = new XYSeries("random values");

		
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);//add the values of the array in the XYSeries data 
		}

		
		dataset.addSeries(data);//add the series to the dataset

		boolean legend = false;//do not visualize legends
		boolean tooltips = false;//do not visualize tooltips
		boolean urls = false;//do not visualize urls 

		JFreeChart chart = ChartFactory.createXYLineChart("Grades Histogram", "graded", "frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);//create the chart

		
		ChartFrame frame = new ChartFrame("Grades", chart);//initialize a frame 
		frame.pack();
		frame.setVisible(true);//make the chart visible 
	}
	
	 /**
	   * This is the main method which makes use of the generateChart method.
	   * @param args used to read the arguments given through the command line
	   * @return Nothing
	   * @exception FileNotFoundException
	   * @see FileNotFoundException
	   */

	public static void main(String[] args) {
		String filename = args[0];//read file name given by user
		try {
		Scanner grades = new Scanner(new File(filename));//create File object with that name 
		List <Integer> temp = new ArrayList <Integer>();//create list to store the elements from the file
		int i = 0;
		while (grades.hasNext()) {
			i++;
		    int grade =grades.nextInt();
		    temp.add(grade);//store the grades from the file in temp list
		}
		int[]dataValues  = new int[11];//create array to store the grades
		for(int k =0; k<11;k++)
			dataValues[k]=0;
		for(int j = 0;j < temp.size();j++)
			dataValues[temp.get(j)] = dataValues[temp.get(j)]+1;//update array to hold the frequency of each grade
			 
		grades.close();

		HistogramGenerator demo = new HistogramGenerator();//create new HistogramGenerator file 
		demo.generateChart(dataValues);//call generateChart method with the array created above in order to generate the chart
		}catch(FileNotFoundException e) {
			System.out.println(e.getClass());
		}
	}
}
