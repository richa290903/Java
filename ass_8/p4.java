/*write a program to throw user defined exception when two no is not an equal using toString() method and display proper message either an exception is thrown or not. */

import java.util.Scanner;

class NotEqualException extends Exception {
      public NotEqualException(String message) {
          super(message);
      }
  }
  
  public class p4{
      public static void main(String[] args) {
          int no1,no2;
          Scanner s1=new Scanner(System.in);
          System.out.print("Enter first number :");
          no1=s1.nextInt();
          System.out.print("Enter second number :");
          no2=s1.nextInt();
          try {
              compareNumbers(no1, no2);
              System.out.println("The numbers are equal.");
          } catch (NotEqualException e) {
              System.out.println("The numbers are not equal: " + e.getMessage());
          }
      }
  
      public static void compareNumbers(int num1, int num2) throws NotEqualException {
          if (num1 != num2) {
              throw new NotEqualException(num1 + " is not equal to " + num2);
          }
      }
  }
  
