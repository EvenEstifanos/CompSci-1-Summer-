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

public class HolidayBonus 
{
	
    private static final double HIGHEST_BONUS = 5000.00;
    private static final double LOWEST_BONUS = 1000.00;
    private static final double OTHER_BONUS = 2000.00;

    public static double[] calculateHolidayBonus(double[][] salesData) 
    {
        double[] rewards = new double[salesData.length];

        for (int row = 0; row < salesData.length; row++) 
        {
            for (int col = 0; col < salesData[row].length; col++) 
            {
                if (salesData[row][col] > 0) 
                {
                    if (salesData[row][col] == salesData[TwoDimRaggedArrayUtility.getHighestInColumnIndex(salesData, col)][col])
                    {
                        rewards[row] += HIGHEST_BONUS;
                    } 
                    else if (salesData[row][col] == salesData[TwoDimRaggedArrayUtility.getLowestInColumnIndex(salesData, col)][col]) 
                    {
                        rewards[row] += LOWEST_BONUS;
                    } 
                    else
                    {
                        rewards[row] += OTHER_BONUS;
                    }
                }
            }
        }
        return rewards;
    }

    public static double calculateTotalHolidayBonus(double[][] salesData) 
    {
        double totalRewards = 0.0;
        
        double[] rewards = calculateHolidayBonus(salesData);

        for (double reward : rewards) 
        {
            totalRewards += reward;
        }

        return totalRewards;
    }
}

