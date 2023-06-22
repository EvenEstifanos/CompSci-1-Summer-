/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: The program is a guessing program. 
 * It asks a user to select from a few selected colors (Red, Green, Blue, Orange, and Yellow) 
 * which color the PC is thinking of, and finally displays the total amount of times the user guessed correctly. 
 * Due: 06/19/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Even Estifanos
*/
import java.util.Scanner;
import java.util.Random;
public class MainClass 
{
	public static void main(String[] args) 
	{
		int userInput,number,correct=0;
		Scanner input = new Scanner(System.in);
		
		Random randomNumbers = new Random();
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter your MC M#: ");
		String mcID = input.nextLine();
		System.out.print("Describe yourself: ");
		String description = input.nextLine();
		
		System.out.println("Due Date: 06/20/23");
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		for(int i=1; i<11; i++)
		{
			System.out.println("Round " + i);
			System.out.println();
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.print("Enter your guess here: ");
			userInput = input.nextInt();
			System.out.println();
			
			number= randomNumbers.nextInt(5)+1;
			
			switch(number)
			{
				case 1: System.out.println("I was thinking of Red.");
				break;
				case 2: System.out.println("I was thinking of Green");
				break;
				case 3: System.out.println("I was thinking of Blue");
				break;
				case 4: System.out.println("I was thinking of Orange");
				break;
				case 5: System.out.println("I was thinking of Yellow");
				break;
				default :  System.out.println("PROGRAM ERROR");
			}
			
			if(number == userInput)
				correct++;
		}
		
		System.out.println("Game Over");
		System.out.println();
		System.out.println("You guessed " + correct + " out of 10 colors correctly.");
		System.out.println("User Name: " + name);
		System.out.println("Student MC M#: " + mcID);
		System.out.println("User Description: " + description);
		System.out.println("Date: 06/20/23");
	}
}
