import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        do { //Allows the user to enter the height of the wall and only allows an input if the input is a double
            System.out.println("Enter wall height (feet): ");
            while (!scnr.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value for wall height (feet): ");
                scnr.next();
            }
            wallHeight = scnr.nextDouble(); //sets the wall height as the next double entered
        }
        while (wallHeight <= 0.0); //makes sure the do loop checking wall height only eecutes if the input is a double
        
        do { //Allows the user to enter the width of the wall and only allows an input if the input is a double
            System.out.println("Enter wall width (feet): ");
            while (!scnr.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value for wall width (feet): ");
                scnr.next();
            }
            wallWidth = scnr.nextDouble(); //sets the wallwidth as the next double entered
        }
        while (wallWidth <= 0.0); //makes sure the above do loop only executes if wallWidth is greater than 0

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}