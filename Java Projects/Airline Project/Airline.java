// Ayinde Castro 
  import java.util.Scanner; // imports scanner
  import java.awt.event.ActionEvent; // imports Action event
 import java.awt.event.ActionListener;
 import java.awt.event.*;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.Date; 
 import java.util.Timer;
import java.awt.event.*;
import javax.swing.*;
 import java.io.PrintWriter; // printwriter import


// Airline.java
// application for assigning seats to a flight
public class Airline extends JFrame implements ActionListener {

    public Airline(){
	   setSize(400,400); // size of it
	   JButton startButton = new JButton("Start"); // start button 
	   startButton.addActionListener(this); // adds the ActionListener
	   add(startButton); // adds button
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // if closed, will exit
	   setVisible(true); // makes it vidible
	}
    public void actionPerformed(ActionEvent event)

     { 
        
         
         
         Scanner input = new Scanner(System.in); // scanner input

        boolean[] seats = new boolean[10]; // array that represents the seating chart of the plane
        int choice; // class choice given by the user
        int number; // user input in case one of the classes is full
        int firstclass= 0; // variable for keeping track of the seats in first class
        int economyclass = 5; // variable for keeping track of the seats in economy class

        System.out.println("Please type 1 for First Class"); // prints "Please type 1 for First Class"
        System.out.println("Please type 2 for Economy"); // prints "Please type 2 for Economy"
 
        for (int i = 0; i < seats.length; i++) // for loop that goes through all the seats 
        
        {    
             System.out.println("choice: "); // prints "choice: "
             choice = input.nextInt(); // makes choice the nextInt
          if (choice == 1 && firstclass < 5)  // if choice is 1 and firstclass <5
            {
                seats[firstclass++] = true; // makes boolean true. passes firstclass through seats. adds 1 to first class
                System.out.println("First Class. Seat #" + firstclass); //prints seat in first class
            }
            else if (choice == 1 && firstclass > 4) 
            {    
                System.out.print("First Class is full, Economy Class?\n"); // prints that first class if full
                System.out.print("1. Yes, 2. No. Your choice: ");// gives the user the option yes or no.
                number = input.nextInt();  // makes number the nextInt

                if (number == 1 && economyclass < 10)  // if number is equal to 1 and economyclass is less than 10
                    
                    {
                        seats[economyclass++] = true; // makes boolean true. passes firstclass through seats. adds 1 to first class
                        System.out.println("Economy Class. Seat #" + economyclass + "\n"); // prints the seat # and 
                    } 
                else  {
                        System.out.println("Next flight leaves in 21 hours.\n"); // if the flight is full, it tells user that that the next flight comes in 21 hours
                
                        System.out.println("Please type 1 for First Class"); // urges user to typ1 1 for first class
                        System.out.println("Please type 2 for Economy"); // urges user to type 2 for economy class
                    }
            }
            if (choice == 2 && economyclass < 10)  // if statement for int choice is equal to 2
            {
                seats[economyclass++] = true; // makes boolean true. passes firstclass through seats. adds 1 to first class
                System.out.println("Economy Class. Seat #" + economyclass); // prints the seat number
            }
            else if (choice == 2 && economyclass >= 10) 
            {
                System.out.print("Economy Class is full, First Class?\n");
                System.out.print("1. Yes, 2. No. Your choice: ");
                number = input.nextInt();
                    if (number == 1 && firstclass<= 5) 
                    {
                        seats[firstclass++] = true; // makes boolean true. passes firstclass through seats. adds 1 to first class
                        System.out.println("First Class. Seat #" + firstclass+ "\n");
                    } 
                    else 
                    {
                        System.out.println("Next flight leaves in 21 hours.\n"); // if it is full, tells another plane is coming soon 
                  
                        System.out.println("Please type 1 for First Class"); // Urges the user to type 1 for first class
                        System.out.println("Please type 2 for Economy"); // urges the user to type 2 to get economy
                }
          } 

        }
   
    
    }// end method assingSeat
    
}
     
   
