
 import java.util.ArrayList;
import java.util.Scanner;

//Ayinde Castro

public class Runner
{

    public static void main(String[] args)
    {

        Scanner cin = new Scanner(System.in); // new scanner
        String[] foodNames = {"Zacaraev's Special Chips", " Mr. Anderson's gummybears", "Mr. Zamani's Pretzels", "Ayinde's hi-chew"};
        double[] foodCosts = {6.20, 0.0, 0.0, 0.0};
        String[] sodaNames = {"Coke ", "Sprite", "Dr.Pepper", "Water"};
        double[] sodaCosts = {0, 2.20, 2.20, 0};
        int choice = 0;

        ArrayList<String> list = new ArrayList<String>();  // array list 

        while(choice != 3)
        {

            System.out.println("1) Order food\n2) Order Drink"
                    + "\n3) Quit");

            choice = cin.nextInt();

            if(choice == 1)
            {
                System.out.println("Enter seat number: ");
                String seatNum = cin.next();

                list.add("Seat Num: " + seatNum);

                System.out.println("Avaliable Food");
                for(int i = 0; i < foodNames.length; i++)
                    System.out.println((i + 1) + ") " + foodNames[i] + 
                            "\t\t$" + foodCosts[i]);

                int chosen = cin.nextInt();
                list.add(foodNames[chosen-1]);
                list.add("" + foodCosts[chosen-1]);
            }
            else if(choice == 2)
            {
                System.out.println("Enter seat number: ");
                String seatNum = cin.next();
                list.add("Seat Num: " + seatNum);

                System.out.println("Avaliable Drinks");
                for(int i = 0; i < sodaNames.length; i++)
                    System.out.println((i + 1) + ") " + sodaNames[i] + 
                            "\t\t$" + sodaCosts[i]);

                int chosen = cin.nextInt();
                list.add(sodaNames[chosen-1]);
                list.add("" + sodaCosts[chosen-1]);
            }

        }

        for(String s : list)
            System.out.println(s);
        
        int numChips = 0; // sets numChips to 0
        int numGummybears = 0; //setsnumGummybears to 0
        int numPretzels = 0; // sets numPretzels to 0
        int numHiChew = 0; // sets numHiChew to 0
        
        int numCoke = 0; // sets numCoke to 0
        int numSprite = 0; // sets numSprite to 0
        int numDrPepper= 0; // sets numDrPepper to 0
        int numWater = 0; // setsnumWater to 0 

        for(String s : list)
            if(s.equalsIgnoreCase("Zacaraev's special chips"))  
                numChips++; // adds 1 to number of chips
            else if(s.equalsIgnoreCase("Mr.Anderson's gummybears"))
                numGummybears++; // adds 1 to number of Gummybears
            else if(s.equalsIgnoreCase("Mr.Zamani's pretzles"))
                numPretzels++; // adds 1 to number of pretzles
            else if(s.equalsIgnoreCase("Ayinde's Hi-Chew")) 
                numHiChew++; // adds 1 to number of HiChew
            else if(s.equalsIgnoreCase("Coke"))
                numCoke++;  // adds 1 to number Cokes
            else if(s.equalsIgnoreCase("Sprite"))
                numSprite++; //adds 1 to number of Sprites
            else if(s.equalsIgnoreCase("Dr.Pepper"))
                numDrPepper++; //adds 1 to number of Dr.Peppers
            else if(s.equalsIgnoreCase("Water"))
                numWater++; //adds 1 to tne number of Dr.Peppers
            
        System.out.println("\nNum Zacaraev's special chips: " + numChips);  // prints how many chips were asked for 
        System.out.println("\nNum Mr.Anderson's gummybears: " + numGummybears); // prints how many Gummy bears were asked for 
        System.out.println("\nNum Mr.Zamani's pretzels: " + numPretzels); //prints how many pretzels were asked for 
        System.out.println("\nNum Ayinde's Hi-Chew:  " + numHiChew); // prints how many hiChews were asked for 
        System.out.println("\nNum Coke: " + numCoke); // prints how many cokes were asked for
        System.out.println("\nNum Sprite: " + numSprite); // prints how many Sprites were asked for
        System.out.println("\nNum Dr.Pepper: " + numDrPepper); // prints number of DrPeppers were asked for 
        System.out.println("\nNum Water: " + numWater); // prints number of waters asked fro 
            }
        
     }

