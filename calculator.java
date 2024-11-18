import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     @SuppressWarnings("resource")
    Scanner v = new Scanner(System.in);
     System.out.print("Enter first number: ");
     double num1 = v.nextDouble();

     System.out.print("Enter an operator (+, -, *, /): ");
     char operator = v.next().charAt(0);
     // String a = v.next();

     System.out.print("Enter second number: ");
     double num2 = v.nextDouble();

     double result;

     switch (operator) {

       case '+':
         result = num1 + num2;
         System.out.println("Result: " + result);
         break;

      case '-':
        result = num1 - num2;
        System.out.println("Result: " + result);
        break;

      case '*':
        result = num1 * num2;
        System.out.println("Result: " + result);
        break;

      case '/':
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println("Result: " + result);
        } 
        else {
          System.out.println("Error! Division by zero is not allowed.");
        }
        break;

      default: //?
        System.out.println("Invalid operator! Please enter +, -, *, or /.");
        break;


      }
   }
}
