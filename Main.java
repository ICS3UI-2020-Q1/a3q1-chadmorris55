import java.util.Scanner;
/**
 * finds the largest integer out of the three given
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user to input numbers 
    System.out.println("Please enter three integers on separate lines");
    int numOne = input.nextInt();
    int numTwo = input.nextInt();
    int numThree = input.nextInt();
    
    if (numOne > numTwo && numOne > numThree){
      System.out.println("Maximum: " + numOne);
    } else if (numTwo > numOne && numTwo > numThree){
      System.out.println("Maximum: " + numTwo);
    } else {
      System.out.println("Maximum: " + numThree);
    } 


  }
}
