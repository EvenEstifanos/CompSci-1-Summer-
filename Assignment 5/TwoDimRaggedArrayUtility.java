/**
  * Class: CMSC203 CRN 40438
  * Program: Assignment #5
  *  Instructor: Dr. Grinberg
  *  Summary of Description: The program includes two classes: HolidayBonus calculates holiday bonuses for retail stores based on sales data, 
  *  						considering highest and lowest sales values, while TwoDimRaggedArrayUtility offers utility methods for working 
  *  						with ragged arrays, including calculations and file operations. These classes streamline bonus calculations and 
  *  						array operations for retail districts.
 Due Date: 08/01/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Even Estifanos
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility 
{

	public static double[][] readFile(File inputFile) throws FileNotFoundException 
	{
        List<List<Double>> data = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split("\\s+");
                List<Double> row = new ArrayList<>();
                for (String element : elements) {
                    row.add(Double.parseDouble(element));
                }
                data.add(row);
            }
        } 
        
        catch (FileNotFoundException ex) 
        {
            System.err.println("File not found");
            return null;
        }
        
        int numRows = data.size();
        double[][] array = new double[numRows][];
        for (int i = 0; i < numRows; i++) {
            List<Double> row = data.get(i);
            int numCols = row.size();
            array[i] = new double[numCols];
            for (int j = 0; j < numCols; j++) {
                array[i][j] = row.get(j);
            }
        }

        return array;
    }

    public static void writeToFile(double[][] dataArray, File outputFile) throws FileNotFoundException
    {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (double[] row : dataArray) {
                for (int j = 0; j < row.length; j++) {
                    writer.print(row[j]);
                    if (j < row.length - 1) {
                        writer.print(" ");
                    }
                }
                writer.println();
            }
        } 
        catch (FileNotFoundException ex) 
        {
            throw new FileNotFoundException("Output file not found");
        }
    }


	public static double getTotal(double[][] data) 
	{
		double ourTotal = 0.0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				ourTotal += data[i][j];
			}
		}
		return ourTotal;
	}



	    public static double getAverage(double[][] data) 
	    {
	        int totalElements = 0;
	        double totalSum = 0.0;

	        for (double[] row : data) {
	            for (double value : row) {
	                totalSum += value;
	                totalElements++;
	            }
	        }

	        if (totalElements == 0) {
	            throw new IllegalArgumentException("Array is empty, cannot calculate average.");
	        }

	        return totalSum / totalElements;
	    }

	    public static double getRowTotal(double[][] data, int row) {
	        if (row < 0 || row >= data.length) {
	            throw new IllegalArgumentException("Invalid row index.");
	        }

	        double rowTotal = 0.0;
	        for (double value : data[row]) {
	            rowTotal += value;
	        }
	        return rowTotal;
	    }

	    public static double getColumnTotal(double[][] data, int col) {
	        if (col < 0) {
	            throw new IllegalArgumentException("Invalid column index.");
	        }

	        double colTotal = 0.0;
	        for (double[] row : data) {
	            if (col < row.length) {
	                colTotal += row[col];
	            }
	        }
	        return colTotal;
	    }

	    public static double getHighestInRow(double[][] data, int row) {
	        if (row < 0 || row >= data.length) {
	            throw new IllegalArgumentException("Invalid row index.");
	        }

	        double highestValue = Double.NEGATIVE_INFINITY;
	        for (double value : data[row]) {
	            if (value > highestValue) {
	                highestValue = value;
	            }
	        }
	        return highestValue;
	    }

	    public static int getHighestInRowIndex(double[][] data, int row) {
	        if (row < 0 || row >= data.length) {
	            throw new IllegalArgumentException("Invalid row index.");
	        }

	        double highestValue = Double.NEGATIVE_INFINITY;
	        int highestIndex = -1;
	        for (int i = 0; i < data[row].length; i++) {
	            if (data[row][i] > highestValue) {
	                highestValue = data[row][i];
	                highestIndex = i;
	            }
	        }
	        return highestIndex;
	    }

	    public static double getLowestInRow(double[][] data, int row) {
	        if (row < 0 || row >= data.length) {
	            throw new IllegalArgumentException("Invalid row index.");
	        }

	        double lowestValue = Double.POSITIVE_INFINITY;
	        for (double value : data[row]) {
	            if (value < lowestValue) {
	                lowestValue = value;
	            }
	        }
	        return lowestValue;
	    }

	    public static int getLowestInRowIndex(double[][] data, int row) {
	        if (row < 0 || row >= data.length) {
	            throw new IllegalArgumentException("Invalid row index.");
	        }

	        double lowestValue = Double.POSITIVE_INFINITY;
	        int lowestIndex = -1;
	        for (int i = 0; i < data[row].length; i++) {
	            if (data[row][i] < lowestValue) {
	                lowestValue = data[row][i];
	                lowestIndex = i;
	            }
	        }
	        return lowestIndex;
	    }

	public static double getHighestInColumn(double[][] data, int col) {
		 if (col < 0) {
	            throw new IllegalArgumentException("Column index is out of bounds.");
	        }

	        double highestValue = Double.NEGATIVE_INFINITY;
	        for (double[] row : data) {
	            if (col < row.length && row[col] > highestValue) {
	                highestValue = row[col];
	            }
	        }
	        return highestValue;

	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		 if (col < 0) {
	            throw new IllegalArgumentException("Column index is out of bounds.");
	        }

	        double highestValue = Double.NEGATIVE_INFINITY;
	        int hiIndex = -1;
	        
	        for (int i = 0; i < data.length; i++) 
	        {
	            if (col < data[i].length && data[i][col] > highestValue)
	            {
	                highestValue = data[i][col];
	                hiIndex = i;
	            }
	        }
	        return hiIndex;
	}


	public static double getLowestInColumn(double[][] data, int col) 
	{
		  if (col < 0) 
		  {
	            throw new IllegalArgumentException("Column index is out of bounds.");
	        }

	        double lowestValue = Double.POSITIVE_INFINITY;
	        for (double[] row : data) {
	            if (col < row.length && row[col] < lowestValue) {
	                lowestValue = row[col];
	            }
	        }
	        return lowestValue;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) 
	{
		 if (col < 0) {
	            throw new IllegalArgumentException("Column index is out of bounds.");
	        }

	        double lowestValue = Double.POSITIVE_INFINITY;
	        int lowestIndex = -1;
	        for (int i = 0; i < data.length; i++) {
	            if (col < data[i].length && data[i][col] < lowestValue) 
	            {
	                lowestValue = data[i][col];
	                lowestIndex = i;
	            }
	        }
	        return lowestIndex;
	}


	public static double getHighestInArray(double[][] data)
	{
		 double highestValue = Double.NEGATIVE_INFINITY;
	        for (double[] row : data) {
	            for (double value : row) {
	                if (value > highestValue) {
	                    highestValue = value;
	                }
	            }
	        }
	        return highestValue;

	}

	public static double getLowestInArray(double[][] data) 
	{
	    double lowestValue = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                if (value < lowestValue) {
                    lowestValue = value;
                }
            }
        }
        return lowestValue;
    }
	
}