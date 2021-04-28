/*
* The RollDie program lets you create paramaters for a dice then
* prints out the random number.
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-28
* Class Dice.
*/

import java.util.Scanner; // import scanner

final class RollDie {

   private RollDie() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * Function gets random number.
  *
  * @param maxValue
  */
  public static void rollDie(final int maxValue) {

    // Checks if you inputed the dice sides
    if (maxValue > 1) {

      // Creates a random number
      int randomint = (int) (Math.random() * maxValue + 1);

      // Prints the random number
      System.out.println();
      System.out.println(randomint);

    // Runs if number less than 1 was inputted
    } else {

      // Outputs that the correct number needs to be inputed
      System.out.println();
      System.out.println("Please enter a number greater than 1");
      }
  }

  /**
  * Function gets user input and passes it ro RollDie.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // Begins try statment
    try {

      // Creates scanner
      Scanner myObj = new Scanner(System.in);

      // Ask for user input
      System.out.println("Please enter the range of your dice (1-?):");

      // Stores the input as an int
      int maxValue = myObj.nextInt();

      // Passes maxvalue to rolldie function
      rollDie(maxValue);

    // Catches errors
    } catch (Exception e) {
      // Runs if anything other than an intiger is inputted
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
