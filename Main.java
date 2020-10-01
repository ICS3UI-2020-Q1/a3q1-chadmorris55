import java.util.Scanner;

/** 
 *Tells the user what animal they are looking at absed on its physical features
 * @Chad 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    // asks user if animal has feathers
    System.out.println("Does your animal have feathers?");
    String feathers = input.nextLine();
    if ( feathers.equals("yes")){
      //animal has feathers
      // ask colour
      System.out.println("Are the feathers red or blue?");
      String colourFeathers = input.nextLine();
      if (colourFeathers.equals("blue")){
        System.out.println("You have a blue jay");
      }else if (colourFeathers.equals("red")){
        System.out.println("You have a cardinal");
      }
    } else {
      // animal doesn't have feathers
      // see what the animal has
      System.out.println("does your animal have scales or fur?");
      String scales = input.nextLine();
      switch (scales){
        case "scales":
         //animal is a reptile 
         System.out.println("does your animal have legs or no legs");
         String legs = input.nextLine();
         case "legs":
         System.out.println("You have an iguana");
         break;
         case "no legs":
         System.out.println("You have a snake");
         break;
        case "fur":
         //animal is a mammal 
         System.out.println("is your animal large or small");
         String size = input.nextLine();
         case "large":
         System.out.println("You have a bear");
         break;
         case "small":
         System.out.println("You have a mouse");
         break;


         



      }
    }

  }
}

