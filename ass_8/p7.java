/*write a program to throw an exception when no is greater than 50 using super keyword inside Exception class and print an appropriate message with no.*/

import java.util.Scanner;

class GreaterThan50 extends Exception {
      public GreaterThan50(int number) {
          super("Number " + number + " is greater than 50.");
      }
  }
  
  public class p7{
      public static void main(String[] args) {
          //int no = 60; // Change this to any number you want to check
            Scanner s1=new Scanner(System.in);
            System.out.print("Enter any number :");
            int no=s1.nextInt();
;          try {
              checkNumber(no);
          } catch (GreaterThan50 e) {
              System.out.println(e.getMessage());
          }
      }
  
      public static void checkNumber(int number) throws GreaterThan50{
          if (number > 50) {
              throw new GreaterThan50(number);
          }
          System.out.println("Number " + number + " is not greater than 50.");
      }
  }
  