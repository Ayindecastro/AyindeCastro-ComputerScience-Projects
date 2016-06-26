//Ayinde Castro
import java.io.PrintWriter;// printWriter import
public class Economy_Class extends Airline
{

    int ROW = 15; //Fifteen rows
    int COLUMN = 6; //six columns

    private Seat[][] seats; //2D array Seat[][] seats

    int numPassnegers; // int numPassnegers

    public Economy_Class()
    {
        numPassnegers = 0; //sets int numPassnegers to 0
        seats = new Seat[ROW][COLUMN]; // creates the 2D array seat. ROW and COLUMN is passed through
        fillBlank(seats); // sets fillBlank and passes 'seats' through
    }

    private void fillBlank(Seat[][] seats) //method of fillBlank. Passes through 2d array seat[][] seats
    {
        for(int i = 0; i < seats.length; i++) {//for loop for the that gets everythin within the length of 'seats' uses int 'i' 
            for(int j = 0; j < seats[i].length; j++) {// nested for loop. uses int J to find everything in the length of seats[i]
                seats[i][j] = new Seat(i, j); //sets the new seat for [i][j]
          }
       }
    }

    public void addAisle(int numPassengers) //methof for addAisle.Passes through int numPassengers
    {
        this.numPassnegers += numPassengers; // adds numPassengers to this.numPassnegers and assign the result to this.numPassnegers
        int num = 0; // sets int num to 0

        int col1 = 1; // sets int col1 to 1
        for(int i = 0; i < ROW; i++) { // finds all elements in ROW
            if(!seats[i][col1].isReserved()) 
            {
                seats[i][col1].reserve(); // reserves the [i] & [col1]
                num++; // adds 1 to num
                if(num == numPassengers) {// if num is equal to numPassengers
                    return;  //returns
                }
            }
        }
        int col2 = 4;
        for(int i = 0; i < ROW; i++) { // finds all emements in ROW
            if(!seats[i][col2].isReserved()) // if statement for if the column1 is reserved
            {
                seats[i][col2].reserve(); // reserves the [i] and [col1]. 2D array.
                num++; // adds 1 to num 
                if(num == numPassengers)
                    return; //returns
            }
        }

        System.out.println("No fill spots"); // prints no filled spots
        return;
    }
    
    public void addCenter(int numPassengers)
    {
        this.numPassnegers += numPassengers; // adds numPassengers to this.numPassnegers and assign the result to this.numPassnegers
        int num = 0; // sets int num to 0

        int col1 = 2; // sets col1 to 2
        for(int i = 0; i < ROW; i++) {
            if(!seats[i][col1].isReserved())
            {
                seats[i][col1].reserve(); //reserves the [i] and [col2] 2D array 
                num++; //adds 1 to num 
                if(num == numPassengers) // if numPassengers is equal to num
                    return; // returns 
            }
        }

        int col2 = 3; // sets int col2 to 3
        for(int i = 0; i < ROW; i++) {
            if(!seats[i][col2].isReserved()) // if statement to see if col1 is reserved
            {
                seats[i][col2].reserve(); //reserves the [i] and [col2] 2D array 
                num++;  // adds 1 to num}
            
            }
            if(num == numPassengers) {
                    return; // returns
                }
                   
           }
           System.out.println("No fill spots"); /// prints out "no fill spots"
        return; // returns }
        }
    public void addWindow(int numPassengers)
    {
        this.numPassnegers += numPassengers; // adds numPassengers to this.numPassnegers and assign the result to this.numPassnegers
        int num = 0; // sets int num to 0

        int col1 = 0; // sets int col1 to 0
        for(int i = 0; i < ROW; i++) {// finds all elements in ROW
            if(!seats[i][col1].isReserved()) // if statement to see if col1 is reserved
            {
                seats[i][col1].reserve(); // reserves the [i] and [col2] 2D array
                num++; // adds 1 to num}
               if(num == numPassengers) 
                    return; // returns
            }
        }

        int col2 = 5; // sets int col2 to 3
        for(int i = 0; i < ROW; i++) 
            if(!seats[i][col2].isReserved()) // if statement to see if col2 is reserves
            {
                seats[i][col2].reserve(); // reserves the [i] and [col2] 2D array
                num++; // adds 1 to sum}
               if(num == numPassengers)
                    return; //returns
            }
 
        System.out.println("No fill spots"); // prints "no fill spots"
        return; // returns
    }

    public void display()
    {

        for(int i=0; i< ROW; i++) // for loop that gets all rows
        {
            for(int j=0; j< COLUMN; j++) // for loop that gets all columns
            {
                System.out.print(seats[i][j] + " "); // prints the 2D array list
                if(j == 1 || j == 3) 
                    System.out.print("\t"); 
                else
                    System.out.print(" "); // prints blank space
            }
                System.out.println(""); // prints blank 
        }

    }

}


