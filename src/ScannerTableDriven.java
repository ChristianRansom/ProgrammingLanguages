

public class ScannerTableDriven {
   public static boolean scan(String input) {


//      This is the scanner table that this code is made for
//       Current Input Character
//      State   digit   decimal other       Token
//      1       2       3       -
//              2       2       3       -           integer
//      3       3       -       -           decimal number

      char currentChar;
      int state = 1;
      char[] inputStream = input.toCharArray();

      for (int i = 0; i < input.length(); i++) {
         currentChar = inputStream[i];

         switch (state) { //Replicated/Redundant code is used here to emphasize the use of Minimal DFA
            case 1:
               switch(currentChar){
                  case '1':
                     state = 2;
                     break;
                  case '2':
                     state = 2;
                     break;
                  case '3':
                     state = 2;
                     break;
                  case '4':
                     state = 2;
                     break;
                  case '5':
                     state = 2;
                     break;
                  case '6':
                     state = 2;
                     break;
                  case '7':
                     state = 2;
                     break;
                  case '8':
                     state = 2;
                     break;
                  case '9':
                     state = 2;
                     break;
                  case '0':
                     state = 2;
                     break;
                  case '.':
                     state = 3;
                     break;
                  default:
                     System.out.println("ERROR IN STATE 1 ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break;
            case 2:
               switch(currentChar){
                  case '1':
                     state = 2;
                     break;
                  case '2':
                     state = 2;
                     break;
                  case '3':
                     state = 2;
                     break;
                  case '4':
                     state = 2;
                     break;
                  case '5':
                     state = 2;
                     break;
                  case '6':
                     state = 2;
                     break;
                  case '7':
                     state = 2;
                     break;
                  case '8':
                     state = 2;
                     break;
                  case '9':
                     state = 2;
                     break;
                  case '0':
                     state = 2;
                     break;
                  case '.':
                     state = 3;
                     break;
                  default:
                     System.out.println("ERROR IN STATE 2 ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break;
            case 3:
               switch(currentChar){
                  case '1':
                     state = 3;
                     break;
                  case '2':
                     state = 3;
                     break;
                  case '3':
                     state = 3;
                     break;
                  case '4':
                     state = 3;
                     break;
                  case '5':
                     state = 3;
                     break;
                  case '6':
                     state = 3;
                     break;
                  case '7':
                     state = 3;
                     break;
                  case '8':
                     state = 3;
                     break;
                  case '9':
                     state = 3;
                     break;
                  case '0':
                     state = 3;
                     break;
                  default:
                     System.out.println("ERROR IN STATE 3 ERROR - An invalid token was found! SYSTEM SHUTDOWN");
                     return false;
               }
               break;
         }
      }
      System.out.println("A valid token was found!");
      return true;

   }
}
