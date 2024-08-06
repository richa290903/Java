// 2. write a program to throw user defined exception when no is not prime 
import java.util.Scanner;
class NotPrimeException extends Exception {
      public NotPrimeException(String message) {
          super(message);
      }
  }
  
  public class p2{
      public static void main(String args[]) {
            int no; // Change this to any number you want to check
            Scanner s1=new Scanner(System.in);
            System.out.print("Enter any number :");
            no=s1.nextInt();
            try {
                  checkPrime(no);
                  System.out.println(no + " is a prime number.");
            }
            catch (NotPrimeException e) {
                  System.out.println(no + " is not a prime number: " + e.getMessage());
            }
      }
  
      public static void checkPrime(int num) throws NotPrimeException {
          if (num <= 1) {
              throw new NotPrimeException("Numbers less than or equal to 1 are not prime.");
          }
  
          boolean isPrime = true;
          for (int i = 2; i <= Math.sqrt(num); i++) {
              if (num % i == 0) {
                  isPrime = false;
                  break;
              }
          }
          if (!isPrime) {
              throw new NotPrimeException(num + " is not a prime number.");
          }
      }
  }
  