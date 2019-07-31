import java.util.*;
class Calculator
{
  public static void main(String args[])
   {
     int first,second,res;
     char o;

     Scanner cin = new Scanner(System.in);

     System.out.println("Enter first number: ");
     first = cin.nextInt();

     System.out.println("Enter second number: ");
     second = cin.nextInt();

     System.out.println("Choose any operator: + , - , * , / , %");
     o = cin.next().charAt(0);

     switch(o) 
    {
      case '+' :
      res = first + second;
      break;
     
      case '-' :
      res = first - second;
      break;
     
      case '*' :
      res = first * second;
      break;
 
      case '/' :
      res = first / second;
      break;
     
      case '%' :
      res = first % second;
      break;
     
      default :
      {
        System.out.println("Invalid Input...");
        return;
      }
    }
    System.out.printf("%d %c %d = %d", first,o,second,res);
  }
}