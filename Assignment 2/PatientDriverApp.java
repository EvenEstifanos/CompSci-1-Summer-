/*
 *  Class: CMSC203 CRN 40438
 Program: Assignment #2
 Instructor: Dr. Grinberg
 Summary of Description: This program displays a patient's full information: their full name, full address, and the name 
                         and phone number of their emergency contact, and then displays the three different procedures they underwent
                         :the procedure's name,date, practitioner's name and cost. 
 Due Date: 07/03/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Even Estifanos
 */

/**
 * @author EvenE
 * PatientDriverApp Class
 * This class is the main tester - the main function is located here and the program starts running here
 */

public class PatientDriverApp 
{
     public static void main(String [] args)
     {
    	 
    	 //Display title
    	 System.out.println("This program was developed by a Student: Even Estifanos 07/03/2023");
    	 System.out.println();
    	 
    	 String name = "Jenny Elaine Santori";  // To hold the value of the patient's name
    	 String address = "123 Main Street";     // To hold the value of the patient's address
    	 String erName = "Bill Santori";          // To hold the value of the patient's emergency contact name
    	 
    	 // Creating an instance object of the patient class with its parameters, creating a new patient 
    	 Patient one = new Patient (name, address, "Rockville", "Maryland", "20877", "109-345-1045",erName, "777-555-1212" );

    	 // Creating an instance object of the procedure class with its parameters, creating a new procedure, in total creating three new procedures
    	 Procedure uno = new Procedure ("Physical Exam", "07/03/2023","Dr. Irvine", 250.00);
    	 Procedure dos = new Procedure ("X-ray", "07/03/2023","Dr. Jamison", 500.00);
    	 Procedure tres = new Procedure ("Blood test", "07/03/2023", "Dr. Smith", 200.00);
    	 
    	 
    	 // Displaying the patient's name, address, city, state, Zip and emergency contact's name and number by using instance methods of the patient class 
    	 System.out.println("Patient name: " + one.getName());
    	 System.out.println("Address: " + one.getAddress());
    	 System.out.println("City: " + one.getCity());
    	 System.out.println("State: " + one.getState());
    	 System.out.println("ZIP: " + one.getZip());
    	 System.out.println("Emergency Contact: " + one.getERContact());
    	 
     	 // Displaying the patient's first procedure's name, its date, the practitioner and its cost, by using instance methods in the procedure class
    	 System.out.println("Procedure: " + uno.getName());
    	 System.out.println("Procedure Date: " + uno.getDate());
    	 System.out.println("Practitioner: " + uno.getPractitioner());
    	 System.out.println("Procedure Charge: " + uno.getCost());
    	 System.out.println();
    	 
     	 // Displaying the patient's second procedure's name, its date, the practitioner and its cost, by using instance methods in the procedure class
    	 System.out.println("Procedure: " + dos.getName());
    	 System.out.println("Procedure Date: " + dos.getDate());
    	 System.out.println("Practitioner: " + dos.getPractitioner());
    	 System.out.println("Procedure Charge: " + dos.getCost());
    	 System.out.println();
    	 
     	 // Displaying the patient's third procedure's name, its date, the practitioner and its cost, by using instance methods in the procedure class
    	 System.out.println("Procedure: " + tres.getName());
    	 System.out.println("Procedure Date: " + tres.getDate());
    	 System.out.println("Practitioner: " + tres.getPractitioner());
    	 System.out.println("Procedure Charge: " + tres.getCost());
    	 System.out.println();
    	 
    	 // Calculating and displaying total charge
    	 System.out.println("The total charge is: $" + (uno.getCost()+ dos.getCost() + tres.getCost()));

    	 // Displaying wrap-up info: programmer's name, My MC ID, and the due date of the program
    	 System.out.println("Student Name: Even Estifanos");
    	 System.out.println("Student MC M#: M21136315");
    	 System.out.println("Due Date: 07/03/2023");
     }
}
