

//This scanner is designed for a grammar that consists of only numbers and decimal numbers.
public class ScannerMinimalDFA {

   public static boolean scan(String input) {

      char[] inputStream = input.toCharArray();
      char state = 'a';

      for (int i = 0; i < inputStream.length; i++) {
         char currentChar = inputStream[i];
         switch (state) {
            case 'a':
               switch (currentChar) { //Replicated/Redundant code is used here to emphasize the use of Minimal DFA
                  case '1':
                     state = 'b';
                     break;
                  case '2':
                     state = 'b';
                     break;
                  case '3':
                     state = 'b';
                     break;
                  case '4':
                     state = 'b';
                     break;
                  case '5':
                     state = 'b';
                     break;
                  case '6':
                     state = 'b';
                     break;
                  case '7':
                     state = 'b';
                     break;
                  case '8':
                     state = 'b';
                     break;
                  case '9':
                     state = 'b';
                     break;
                  case '0':
                     state = 'b';
                     break;
                  case '.':
                     state = 'c';
                     break;
                  default:
                     System.out.println("ERROR IN STATE A ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break; //break from state a
            case 'b':
               switch (currentChar) { //Replicated/Redundant code is used here to emphasize the use of Minimal DFA
                  case '1':
                     state = 'b';
                     break;
                  case '2':
                     state = 'b';
                     break;
                  case '3':
                     state = 'b';
                     break;
                  case '4':
                     state = 'b';
                     break;
                  case '5':
                     state = 'b';
                     break;
                  case '6':
                     state = 'b';
                     break;
                  case '7':
                     state = 'b';
                     break;
                  case '8':
                     state = 'b';
                     break;
                  case '9':
                     state = 'b';
                     break;
                  case '0':
                     state = 'b';
                     break;
                  case '.':
                     state = 'd';
                     break;
                  default:
                     System.out.println("ERROR IN STATE B ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
//               if (i + 1 == input.length()) {
//                  System.out.println("The scanner has received an integer");
//                  return true;
//               }
               break; //break from state b
            case 'c':
               switch (currentChar) { //Replicated/Redundant code is used here to emphasize the use of Minimal DFA
                  case '1':
                     state = 'd';
                     break;
                  case '2':
                     state = 'd';
                     break;
                  case '3':
                     state = 'd';
                     break;
                  case '4':
                     state = 'd';
                     break;
                  case '5':
                     state = 'd';
                     break;
                  case '6':
                     state = 'd';
                     break;
                  case '7':
                     state = 'd';
                     break;
                  case '8':
                     state = 'd';
                     break;
                  case '9':
                     state = 'd';
                     break;
                  case '0':
                     state = 'd';
                     break;
                  default:
                     System.out.println("ERROR IN STATE C ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break; //break from state c
            case 'd':
               switch (currentChar) { //Replicated/Redundant code is used here to emphasize the use of Minimal DFA
                  case '1':
                     state = 'd';
                     break;
                  case '2':
                     state = 'd';
                     break;
                  case '3':
                     state = 'd';
                     break;
                  case '4':
                     state = 'd';
                     break;
                  case '5':
                     state = 'd';
                     break;
                  case '6':
                     state = 'd';
                     break;
                  case '7':
                     state = 'd';
                     break;
                  case '8':
                     state = 'd';
                     break;
                  case '9':
                     state = 'd';
                     break;
                  case '0':
                     state = 'd';
                     break;
                  default:
                     System.out.println("ERROR IN STATE D ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break; //break from state d
            }
         }
      System.out.println("A valid Token was found!");
      return true;
   }
}
