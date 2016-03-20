import java.util.Stack;

public class LLParser {

   private static Stack<String> inputStack = new Stack<String>();

   public static Boolean parse(String input){

      for(int i = input.length() - 1; i >= 0; i--){
         inputStack.add(Character.toString(input.charAt(i))); //Store input into a stack.
      }
      //System.out.print(inputStack);
      program();
      return null;
   }

   public static Boolean match(String matcher) {
      String nextToken = inputStack.peek();
      if (nextToken.equals(matcher)) {
         System.out.println("Matched " + nextToken);
         inputStack.pop();
         return true;
      } else {
         System.out.print("Match Parse Error");
         return false;
      }
   }

   public static void program(){
      String nextToken = inputStack.peek();
      if(nextToken.equals("(") || nextToken.equals("[") || nextToken.equals("$")) { //Production 1
         System.out.println("Predict program -> pair $");
         pair();
         match("$");
      }
      else {
         System.out.println("Program Parse Error");
      }
   }

   public static void pair(){
      String nextToken = inputStack.peek();
      //System.out.println("Next Token: " + nextToken);
      if(nextToken.equals("[")){ //Production 2
         System.out.println("Predict pair -> [ pair ] pair");
         match("[");
         pair();
         match("]");
         pair();
      }
      else if(nextToken.equals("(")){ //Production 3
         System.out.println("Predict pair -> ( pair ) pair");
         match("(");
         pair();
         match(")");
         pair();
      }
      else if(nextToken.equals(")") || nextToken.equals("]") || nextToken.equals("$")){ //Production 4
         System.out.println("Predict pair -> e");
         //Nothing happens. pair -> EPS
      }
      else {
         System.out.println("Pair Parse Error ");
      }
   }
}
