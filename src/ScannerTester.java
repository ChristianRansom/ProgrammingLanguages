import java.util.Scanner;

public class ScannerTester {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String loop = "Yes";
      String input;


      while(loop.toLowerCase().equals("yes")) {
         System.out.print("Enter a real number: ");
         input = keyboard.next();
         ScannerMinimalDFA.scan(input);
         System.out.print("\nEnter 'yes' to continue: ");
         loop = keyboard.next();
      }

   System.out.print("\nEnding Scanner Tester");  //position cursor for final message
   }
}
