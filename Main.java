import java.util.Scanner;

/**
 * a program that will get a user to enter a positive integer and finish when a person enters a negative integer
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);


    // Ask the user for a number
    System.out.println("Please enter a positive integer. Enter a negative integer to quit");
    int number = input.nextInt();

    // Make sure it is a positive integer
    while (number >= 0){
    // Ask for a new number
    System.out.println("Please enter a positive integer. Enter a negative integer to quit");
    number = input.nextInt();
    } 
    System.out.println("All done!");


    
  }
}
