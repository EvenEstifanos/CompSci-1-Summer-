import java.util
.Scanner;

public class MovieDriver {

	public static void main(String[] args) 
	{
		
		// Create a new object of type Scanner that reads from the keyboard
		Scanner one = new Scanner (System.in);
		
		// To hold the value of the user's choice, whether he wants to enter another movie or not
		String reply; 
		
		// Dowhile loop - posttest loop- loops once, and then checks if the user wants to enter another movie
		do
		{
			// Create a new movie object
			Movie uno = new Movie();
			
			// Prompt the user to enter the title of a movie 
			System.out.println("Enter the name of a movie");
			// Read in the line that the user types
			String title = one.nextLine();
			
			//Set the title in the movie object
			uno.setTitle(title);
			
			// Prompt the user to enter the movie’s rating
			System.out.println("Enter the rating of the movie");
			// Read in the line that the user types
			String rating = one.nextLine();
			
			//Set the rating in the movie object
			uno.setRating(rating);
			
			// Prompt the user to enter the number of tickets sold at a (unnamed) theater
			System.out.println("Enter the number of tickets sold for this movie");
			
		    //Read in the integer that the user types
			int ticketsSold = one.nextInt();
			
			/* Preventing a logical error. This issue occurs due to the way Scanner handles newline 
			 * characters when using nextInt() followed by nextLine(). Hence a random read in is needed
			*/
			one.nextLine();
			
			//Set the number of tickets sold in the movie object
			uno.setSoldTickets(ticketsSold);
			
			// Print out the information using the movie’s toString method
			System.out.println(uno);
			
			// Prompt user to enter whether he likes to continue or stop the process
			System.out.println("Do you want to enter another? (y or n)");
			
			// Read in the line that the users types
			reply = one.nextLine();
		}
		// If the user choose to continue, the loop continues, other wise it stops. 
		while(reply.equals("y"));
		
		// Displaying farewells - wrap up info
		System.out.println("Goodbye");

	}

}
